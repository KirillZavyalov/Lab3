package ru.itmo.lab.abst;

import ru.itmo.lab.classes.Food;

public abstract class Humanoid {
    private String name;

    public Humanoid(String name) {
        this.name = name;
    }

    public void eat(Food food){
        System.out.println(name + " уплетает " + food.getFoodName());
    }

    public String getName(){
        return name;
    }
}
