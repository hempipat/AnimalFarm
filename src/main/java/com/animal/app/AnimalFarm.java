package com.animal.app;

import com.animal.app.animals.Cat;
import com.animal.app.animals.Dog;
import com.animal.app.animals.Leopard;
import com.animal.app.animals.Lion;
import com.animal.app.animals.Sheep;

public class AnimalFarm {

    public static Animal createAnimal(String kind) {
        if (kind.equals("cat")) {
            return new Cat();
            
        }

        if (kind.equals("dog")) {
            return new Dog();

        }

        if (kind.equals("lion")) {
            return new Lion();

        }

        if (kind.equals("leopard")) {
            return new Leopard();
            
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
            animalFarm.addAnimal(createAnimal(animalKind));
        }
        animalFarm.printContents();
    }
}
