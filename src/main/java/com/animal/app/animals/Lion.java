package com.animal.app.animals;

import com.animal.app.Animal;

public class Lion extends Animal {
    private String kind;

    public Lion() {
        super("lion");
        this.kind = "lion";
    }

    @Override
    public String getKind() {
        return kind;
    }
    
}
