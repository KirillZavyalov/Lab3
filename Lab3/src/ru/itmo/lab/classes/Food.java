package ru.itmo.lab.classes;
import ru.itmo.lab.intfce.Edible;

import java.util.Objects;

public class Food implements Edible {
    final private String foodName;
    public Food(String foodName){
        this.foodName = foodName;
    }
    public String getFoodName(){
        return foodName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Food)) return false;
        Food other = (Food) o;
        return Objects.equals(this.foodName, other.foodName);
    }

    @Override
    public String toString() {
        return (String) "Food "+foodName;
    }

    @Override
    public int hashCode() {
        return foodName.hashCode();
    }
}
