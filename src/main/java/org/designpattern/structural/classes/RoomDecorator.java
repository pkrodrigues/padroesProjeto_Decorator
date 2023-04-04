package org.designpattern.structural.classes;

public abstract class RoomDecorator implements Room {
    private Room room;
    public String descricao;

    public RoomDecorator(Room room) {
        this.room = room;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public abstract String getRoomElements();
    public String getDescricao() {
        return this.room.getDescricao() + " com " + this.getRoomElements();
    }
    public void setRoomElements(String descricao) {
        this.descricao = descricao;
    }

    public abstract float getAddPrice();

    public float getPrice() {
        return this.room.getPrice()+this.getAddPrice();
    }

}
