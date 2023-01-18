package ru.itmo.lab.classes;

import java.util.Objects;

public class Furniture{
    private final String name;

    public Furniture(String name){
        this.name = name;
    }

    public String getFurnitureName(){
        return  name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Furniture)) return false;
        Furniture other = (Furniture) o;
        return Objects.equals(this.name, other.getFurnitureName());
    }

    @Override
    public String toString() {
        return (String)("Furniture " + name);
    }

    @Override
    public int hashCode() {
        return getFurnitureName().hashCode();
    }

}
