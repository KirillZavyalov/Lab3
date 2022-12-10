package ru.itmo.lab;


import ru.itmo.lab.classes.Food;
import ru.itmo.lab.classes.Room;
import ru.itmo.lab.classes.Shorty;
import ru.itmo.lab.enm.RoomSize;

public class Main {
    public static void main(String[] args) {

        Shorty Dumby = new Shorty("Незнайка", "расхваливая");
        Shorty Goat = new Shorty("Козлик", "крякая, чмокая губами от удовольствия и жмурясь, словно проголодавшийся котенок, которого принесли с мороза и угостили сметанкой");

        Food Soup = new Food("Перловый суп");
        Food Pie = new Food("Пироги");
        Food Buckwheat = new Food("Гречневая каша с маслом");

        Dumby.eat(Soup);
        Dumby.eat(Pie);
        Dumby.eat(Buckwheat);

        Goat.eat(Soup);
        Goat.eat(Pie);
        Goat.eat(Buckwheat);

        Room cheapSmallRoom = new Room(50, RoomSize.SMALL, "стол, несколько стульев, платяной шкаф, рукомойник с зеркалом у стены и даже телевизор в углу.");

        Dumby.rentARoom(Dumby, Goat, cheapSmallRoom);
        Dumby.enterRoom(Dumby, Goat, cheapSmallRoom);
        cheapSmallRoom.inspectRoom();
    }
}