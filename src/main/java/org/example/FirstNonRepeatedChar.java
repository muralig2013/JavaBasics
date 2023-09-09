package org.example;

import org.apache.commons.lang3.StringUtils;

import java.util.*;

public class FirstNonRepeatedChar {

    public static void main(String[] args) {
        firstNonRepeatedCharacter("ILOVEINDIA");
        firstDuplicatedCharacterUsingSet("ILOVEINDIA");
    }

    static char firstNonRepeatedCharacter(String input) {
        if (StringUtils.isNotEmpty(input)) {
            Map<Character, Integer> charContainer = new LinkedHashMap<>();
            for(int index=0; index < input.length(); index++) {
                if(charContainer.containsKey(input.charAt(index))) {
                   int count = charContainer.get(input.charAt(index));
                   charContainer.put(input.charAt(index), count+1);
                } else {
                    charContainer.put(input.charAt(index), 1);
                }
            }

//            for (Map.Entry<Character, Integer> characterIntegerEntry : charContainer.entrySet()) {
//                System.out.println("Key is : " +characterIntegerEntry.getKey() + " and value is : " +characterIntegerEntry.getValue());
//            }

            for(Character c : charContainer.keySet()){
                if(charContainer.get(c) == 1){
                    System.out.println("First non repeated character is : " +c);
                    return c;
                }
            }



            return 0;
        }
        return 0;
    }

    static char firstDuplicatedCharacterUsingSet(String input) {
        if (StringUtils.isNotEmpty(input)) {
            Set<Character> charContainer = new HashSet<>();
            for (char c: input.toCharArray()) {
                if(!charContainer.add(c)){
                    System.out.println("First non duplicated character is : " +c);
                    return c;
                }
            }
        }
        return 0;
    }
}
