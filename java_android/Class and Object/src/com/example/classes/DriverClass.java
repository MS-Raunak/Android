package com.example.classes;

public class DriverClass
{
    public static void main(String[] args)
    {
        //House is a class, house is an object and inside the brackets all are attributes of object.

        House house = new House(10, 2, "Tiles", "Bricks");
        house.setGetNrOfDoors(3);
        house.setTypeOfWall("Plaster");

        System.out.println("House:");
        System.out.println("NO of windows: " + house.getNrOfWindows());
        System.out.println("No of doors: " + house.getGetNrOfDoors());
        System.out.println("Type of Roof: " + house.getTypeOfRoof());
        System.out.println("Type of walls: " + house.getTypeOfWall());

    }
}
