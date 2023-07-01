package com.animal.app;

import com.animal.app.animals.Cat;
import com.animal.app.animals.Dog;
import com.animal.app.animals.Sheep;

public class AnimalFarm {

    public static Animal makeAnimal(String kind) {
        if (kind.equals("cat")) {
            return new Cat();
            
        }
        if (kind.equals("dog")) {
            return new Dog();
        }
        if (kind.equals("sheep")) {
            return new Sheep();
            
        }

        return new Animal(kind);
    }

    public static void main( String[] args ){
        if (args.length == 0) {
            System.out.println("Pass at least one animal type!");
            System.exit(1);
        }
        Farm animalFarm = new Farm();
        for (String animalKind : args) {
            animalFarm.addAnimal(makeAnimal(animalKind));
        }
        animalFarm.printContents();
    }
}
