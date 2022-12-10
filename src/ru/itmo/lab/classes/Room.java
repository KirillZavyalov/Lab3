package ru.itmo.lab.classes;


import ru.itmo.lab.enm.RoomSize;
import ru.itmo.lab.intfce.RoomInterface;

public class Room implements RoomInterface {

    int price;
    String furniture;
    Enum roomSize;

    public Room(int price, Enum roomSize, String furniture){
        this.price = price;
        this.roomSize = roomSize;
        this.furniture = furniture;
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
}
