package com.animal.app;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Farm {
    private Set<Animal> animals;

    public Farm() {
        animals = new HashSet<>();
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public void printContents() {
        System.out.println("We've got some animals on the farm: ");
        String animalKinds = animals.stream()
                .map(Animal::getKind)
                .collect(Collectors.joining(", "));
        System.out.println(animalKinds + ".");
    }
}
