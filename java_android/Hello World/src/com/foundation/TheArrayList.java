package com.foundation;

import javax.xml.transform.sax.SAXSource;
import java.util.ArrayList;

public class TheArrayList
{
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.add("James");
        names.add("Peter");
        names.add("Harry");
        names.add("Brookly");
        names.add(("Jonson"));

        names.remove(0);// used to delete a particular element of an array
//        System.out.println(names);
        for (int i = 0; i < names.size(); i++)
        {
            System.out.println(names.get(i));
        }

    }
}
