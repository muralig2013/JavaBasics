package org.example;

import java.util.*;
class MapEx{
    public static void main(String args[]){
        Map<Integer,String> map=new HashMap<Integer,String>();
        map.put(100,"Amit");
        map.put(101,"Vijay");
        map.put(102,"Rahul");

        String value = map.get(100);

        System.out.println(value);

        if(map.containsKey(400)){
            System.out.println("Key is present");
        } else {
            System.out.println("Key is not present");
        }
        //Elements can traverse in any order
        for(Map.Entry m:map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }

        for(int i : map.keySet()){
            System.out.println(map.get(i));
        }
    }
}