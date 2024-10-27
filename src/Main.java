import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
Animal[]animals={new Shark(),new Turtle(),new Eagle(),new Shark(),new Eagle()};
int countShark=0;
int countTurtle=0;
int countEagle =0;
for (Animal animal:animals){
    if(animal instanceof Shark){
        countShark++;
    }
    if(animal instanceof Turtle){
        countTurtle++;
    }
    if(animal instanceof Eagle){
        countEagle++;
    }
}
Shark[]sharks=new Shark[countShark];
Turtle[]turtles=new Turtle[countTurtle];
Eagle[]eagles=new Eagle[countEagle];

int indexShark=0;
int indexTurtle=0;
int indexEagle=0;

for(Animal animal:animals){
    if (animal.getClass()==Shark.class){
        Shark shark=(Shark)animal;
        shark.attack();
        sharks[indexShark++]=shark;
    }
    if (animal.getClass()==Eagle.class){
        Eagle eagle=(Eagle)animal;
        eagle.fly();
        eagles[indexEagle++]=eagle;
    }
    if (animal.getClass()==Turtle.class){
        Turtle turtle=(Turtle) animal;
        turtle.swim();
        turtles[indexTurtle++]=turtle;
    }

}
        System.out.println("\nSharks array:"+ Arrays.toString(sharks));
        System.out.println("\nTurtles array:"+Arrays.toString(turtles));
        System.out.println("\nEagles array:"+Arrays.toString(eagles));



    }
}