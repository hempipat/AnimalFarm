package com.animal.app.animals;

import com.animal.app.Animal;

public class Sheep extends Animal {
    private String kind;

    public Sheep() {
        super("sheep");
        this.kind = "sheep";
    }
    
    @Override
    public String getKind() {
        return kind;
    }
}
