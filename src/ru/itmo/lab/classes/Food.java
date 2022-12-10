package ru.itmo.lab.classes;
import ru.itmo.lab.intfce.Edible;

import java.util.Objects;

public class Food implements Edible{
    private String foodName;

    public Food(String foodName){
        this.foodName = foodName;
    }

    @Override
    public String getFoodName(){
        return foodName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Food other = (Food) o;
        return Objects.equals(this.foodName, other.foodName);
    }
}
