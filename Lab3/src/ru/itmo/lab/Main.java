package ru.itmo.lab;


import ru.itmo.lab.classes.*;
import ru.itmo.lab.enm.RoomSize;

public class Main {
    public static void main(String[] args) {

        Shorty dumby = new Shorty("Незнайка", "расхваливая");
        Shorty goat = new Shorty("Козлик", "крякая, чмокая губами от удовольствия");

        Food soup = new Food("Перловый суп");
        Food pie = new Food("Пироги");
        Food buckwheat = new Food("Гречневая каша с маслом");

        dumby.eat(soup);
        dumby.eat(pie);
        dumby.eat(buckwheat);

        goat.eat(soup);
        goat.eat(pie);
        goat.eat(buckwheat);

        Furniture sinkWithAMirror = new Furniture("рукомойник с зеркалом"),
            table = new Furniture("стол"),
            chairs = new Furniture("несколько стульев"),
            closet = new Furniture("платьяной шкаф"),
            television = new Furniture("телевизор");

        Furniture[] furnitureList = new Furniture[]{
                sinkWithAMirror,
                table,
                chairs,
                closet,
                television};

        Room cheapSmallRoom = new Room(50, RoomSize.SMALL, furnitureList);

        dumby.rentARoom(dumby, goat, cheapSmallRoom);
        dumby.enterRoom(dumby, goat, cheapSmallRoom);

        cheapSmallRoom.GetFurniture();

    }
}