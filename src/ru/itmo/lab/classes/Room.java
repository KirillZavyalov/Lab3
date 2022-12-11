package ru.itmo.lab.classes;


import ru.itmo.lab.enm.RoomSize;
import ru.itmo.lab.intfce.RoomInterface;

import java.util.Objects;

public class Room implements RoomInterface {

    int number = 0;

    int price;
    String furniture;
    Enum roomSize;

    public Room(int price, Enum roomSize, String furniture){
        this.price = price;
        this.roomSize = roomSize;
        this.furniture = furniture;
    }

    public Room(int price, Enum roomSize, String furniture, int number){
        this.price = price;
        this.roomSize = roomSize;
        this.furniture = furniture;
        this.number = number;
    }

    @Override
    public int GetPrice(){
        return price;
    }

    @Override
    public String getFurniture(){
        return furniture;
    }

    @Override
    public String getSize(){
        if (roomSize.equals(RoomSize.BIG)){
            return "небольшой";
        }

        if (roomSize.equals(RoomSize.ORDINARY)){
            return "обычного размера";
        }

        if (roomSize.equals(RoomSize.SMALL)){
            return "маленькой";
        }

        return null;
    }

    @Override
    public  void inspectRoom(){
        System.out.println("В комнате были: " + furniture);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Room other = (Room) o;
        return Objects.equals(this.price, other.price) && Objects.equals(this.furniture, other.furniture) && Objects.equals(this.roomSize, other.roomSize) &&
                Objects.equals(this.number, other.number);
    }

    @Override
    public String toString() {
        return String.valueOf(number);
    }

    @Override
    public int hashCode() {
        return String.valueOf(number).hashCode();
    }
}
