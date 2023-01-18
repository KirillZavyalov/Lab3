package ru.itmo.lab.abst;

import java.util.Objects;

public abstract class Humanoid {
    private String name;

    public Humanoid(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Humanoid)) return false;
        Humanoid other = (Humanoid) o;
        return Objects.equals(this.name, other.name);
    }

    @Override
    public String toString() {
        return (String)("Humanoid " + name);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
}
