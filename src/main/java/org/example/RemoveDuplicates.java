package org.example;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {

    public static void main(String[] args) {
        Set< Integer > set = new HashSet<>();
        set.add(100);
        set.add(200);
        set.add(300);
       boolean hasAdded = set.add(400);
        System.out.println("Value added: " +hasAdded);
        hasAdded = set.add(400);
        System.out.println("Value added: " +hasAdded);


    }


}
