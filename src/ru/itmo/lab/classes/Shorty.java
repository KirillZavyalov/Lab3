package ru.itmo.lab.classes;

import ru.itmo.lab.abst.Humanoid;

import java.util.Objects;

public class Shorty extends Humanoid {

    String name = getName();
    private String eatingSounds;

    public Shorty(String name) {
        super(name);
    }

    public Shorty(String name, String eatingSounds){
        super(name);
        this.eatingSounds = eatingSounds;
    }

    public void eat(Food food){
        System.out.println(name + " уплетает " +
                food.getFoodName() + " " + eatingSounds + ".");
    }

    public void rentARoom(Shorty s1, Shorty s2, Room room){
        System.out.println(s1.getName() + " и " + s2.getName() +
                " уплатив " + room.GetPrice() + " сантиков" + " получили ключ от комнаты.");
    }
    public void enterRoom(Shorty s1, Shorty s2, Room room){
        System.out.println(s1.getName() + " и " + s2.getName() + ", разыскав свой номер, очутились в " + room.getSize() + " комнате." );
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Shorty other = (Shorty) o;
        return Objects.equals(this.name, other.name) && Objects.equals(this.eatingSounds, other.eatingSounds) ;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
}
