package org.designpattern.structural.classes;

public class Suite extends RoomDecorator{
    public Suite(Room room){
        super(room);
    }

    public float getAddPrice() {
        return 50.0f;
    }

    public String getRoomElements() {
        return "Suíte";
    }
}
