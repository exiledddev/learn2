package com.markedexiled.learn2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {

    public static void main(String[] args)
    {
        String[] groceriesList = new String[]{"milk", "eggs", "bananas", "cyberpunk dlc", "flowers"};
        System.out.println(">> Go through array elements:");
        for(int i=0; i<groceriesList.length; i++)
            System.out.println(groceriesList[i]);
        System.out.println(">> Enhanced for loop for array:");

        for(String i: groceriesList)
            System.out.println(i);
        List<String> carParts = new ArrayList<String>();
        System.out.println(">> Go through list elements:");
        carParts.add("Doors");
        carParts.add("Engine");
        carParts.add("Trunk");
        carParts.add("Wheels");

        for(int j=0; j<carParts.size(); j++)
            System.out.println(carParts.get(j));

        System.out.println(">> Enhanced for loop for list elements:");
        for(String j: carParts)
            System.out.println(j);

        HashMap<String, String> bouletin = new HashMap<>();
        bouletin.put("Name", "Andrew");
        bouletin.put("Alias", "Exiled");
        bouletin.put("Age", "17");
        bouletin.put("Hobbies", "Programming, Music, etc.");

        System.out.println(">> Go through HashMap elements:");

        for(String l: bouletin.keySet())
            System.out.println(l + " " + bouletin.get(l));

    }
}
