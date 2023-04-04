package org.designpattern.structural.classes;

public class BasicRoom implements Room {
    public float price;

    public BasicRoom(){
    }

    public BasicRoom(float price){
        this.price = price;
    }

    public float getPrice(){
        return price;
    }

    public String getDescricao() {
        return "Básico";
    }

}
