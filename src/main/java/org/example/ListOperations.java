package org.example;

import java.util.ArrayList;
import java.util.List;

public class ListOperations {

    public static void main(String[] args) {


        List<String> input = new ArrayList<String>();
        input.add("ABDC");
        input.add("SDKSLKDJ");
        input.add("JSJAS");
        input.add("DSKDJS");
        input.add("WOEUOW");
        input.add("CDKFJKSJFS");
        input.removeAll(input);

        for(String inp : input){
            System.out.println(inp);
        }
    }
}
