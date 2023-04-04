package org.designpattern.structural.classes;

public class TV extends RoomDecorator{
    public TV(Room room){
        super(room);
    }


    public float getAddPrice() {
        return 20.0f;
    }

    public String getRoomElements() {
        return "TV";
    }
}
