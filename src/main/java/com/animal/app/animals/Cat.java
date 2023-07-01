package com.animal.app.animals;

import com.animal.app.Animal;

public class Cat extends Animal {
    private String kind;

    public Cat() {
        super("cat"); // Invoke the constructor of the Animal class explicitly
        this.kind = "cat";
    }
    
    @Override
    public String getKind() {
        return kind;
    }
}

