package ru.itmo.lab.classes;

import ru.itmo.lab.abst.Humanoid;

import java.util.Objects;

public class Shorty extends Humanoid {
    private String eatingSounds;

    private String name = getName();

    public Shorty(String name) {
        super(name);
    }

    public Shorty(String name, String eatingSounds){
        super(name);
        this.eatingSounds = eatingSounds;
    }

    public void eat(Food food){
        ConsolePrinter.printString((String)(name + " уплетает " +
                food.getFoodName() + " " + eatingSounds + "."));
    }

    public void rentARoom(Shorty s1, Shorty s2, Room room){
        ConsolePrinter.printString((String)s1.getName() + " и " + s2.getName() +
                " уплатив " + room.GetPrice() + " сантиков" + " получили ключ от комнаты.");
    }
    public void enterRoom(Shorty s1, Shorty s2, Room room){
        ConsolePrinter.printString((String)s1.getName() + " и " + s2.getName() + ", разыскав свой номер," +
                " очутились в " + room.getSize() + " комнате.");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Shorty) ) return false;
        Shorty other = (Shorty) o;
        return Objects.equals(this.name, other.name) &&
                Objects.equals(this.eatingSounds, other.eatingSounds) ;
    }

    @Override
    public String toString() {
        return (String)("Shorty " + name);
    }

    @Override
    public int hashCode() {
        return name.hashCode() + eatingSounds.hashCode();
    }
}
