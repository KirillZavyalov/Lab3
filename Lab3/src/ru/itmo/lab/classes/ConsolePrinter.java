package ru.itmo.lab.classes;

public class ConsolePrinter {
    private String string;
    private Furniture furniture[];

    public ConsolePrinter(String string){
        this.string = string;
    }
    public ConsolePrinter(String string, Furniture[] array){
        this.string = string;
        this.furniture = array;
    }
    public static void printString(String string){
        System.out.println(string);
    }
    public static void printStringAndFurniture(String string, Furniture[] furniture){
        System.out.print(string);
        for (int i = 0; i < furniture.length; i++) {
            if (i + 1 != furniture.length){
                System.out.print(furniture[i].getFurnitureName() + ", ");
            }
            else System.out.print(furniture[i].getFurnitureName() + ".\n");
        }
    }
}
