package com.animal.app.animals;

import com.animal.app.Animal;

public class Leopard extends Animal {
    
    private String kind;

    public Leopard() {
        super("leopard");
        this.kind = "leopard";
    }

    @Override
    public String getKind() {
        return kind;
        
    }
}

