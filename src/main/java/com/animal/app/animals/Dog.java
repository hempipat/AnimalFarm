package com.animal.app.animals;

import com.animal.app.Animal;

public class Dog extends Animal{
    private String kind;

    public Dog() {
        super("dog");
        this.kind = "dog";
    }

    @Override
    public String getKind() {
        return kind;
    }
}


