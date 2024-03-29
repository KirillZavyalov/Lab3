package ru.itmo.lab.classes;


import ru.itmo.lab.enm.RoomSize;
import ru.itmo.lab.intfce.Buyable;

import java.util.Objects;

public class Room implements Buyable {

    private int number = 0;

    final private int price;
    final private Furniture[] furniture;
    private final Enum roomSize;

    public Room(int price, Enum roomSize, Furniture[] furniture){
        this.price = price;
        this.roomSize = roomSize;
        this.furniture = furniture;
    }

    public Room(int price, Enum roomSize, Furniture[] furniture, int number){
        this.price = price;
        this.roomSize = roomSize;
        this.furniture = furniture;
        this.number = number;
    }

    @Override
    public int GetPrice(){
        return price;
    }

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
    public void GetFurniture(){
        ConsolePrinter.printStringAndFurniture("В конате была мебель: ", furniture);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Room) ) return false;
        Room other = (Room) o;
        return Objects.equals(this.price, other.price) && Objects.equals(this.furniture, other.furniture) && Objects.equals(this.roomSize, other.roomSize) &&
                Objects.equals(this.number, other.number);
    }

    @Override
    public String toString() {
        return (String)("Room " + number);
    }

    @Override
    public int hashCode() {
        return String.valueOf(number).hashCode() + price;
    }
}
