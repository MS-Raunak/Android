package com.example.classes;

public class House     //class
{
    private int nrOfWindows;
    private int nrOfOfDoors;
    private String typeOfRoof;
    private String typeOfWall;

    public House()   // default constructor
    {
        nrOfWindows = 0;
        nrOfOfDoors = 0;
        typeOfRoof = null;
        typeOfWall = null;
    }
    //parametrized constructor
    public House (int nrOfWindows, int nrOfDoors, String typeOfRoof, String typeOfWall)
    {
        // this keyword refers to the current object in a method or constructor
        this.nrOfWindows = nrOfWindows;
        this.nrOfOfDoors = nrOfDoors;
        this.typeOfRoof = typeOfRoof ;
        this.typeOfWall = typeOfWall;
    }

    public int getNrOfWindows()
    {
        return nrOfWindows;
    }

    public int getGetNrOfDoors()
    {
        return nrOfOfDoors;
    }

    public String getTypeOfRoof()
    {
        return typeOfRoof;
    }

    public String getTypeOfWall()
    {
        return typeOfWall;
    }



    public void setNrOfWindows(int nrOfWindows)
    {
        this.nrOfWindows = nrOfWindows;
    }
    public void setGetNrOfDoors(int nrOfDoors)
    {
        this.nrOfOfDoors = nrOfDoors;
    }

    public void setTypeOfRoof(String typeOfRoof)
    {
        this.typeOfRoof = typeOfRoof;
    }

    public void setTypeOfWall(String typeOfWall)
    {
        this.typeOfWall = typeOfWall;
    }


}


