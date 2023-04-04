package org.designpattern.structural.classes;

public class ArCondicionado extends RoomDecorator {
    public ArCondicionado(Room room) {
        super(room);
    }

    public float getAddPrice() {
        return 40.0f;
    }

    public String getRoomElements() {
        return "Ar Condicionado";
    }
}
