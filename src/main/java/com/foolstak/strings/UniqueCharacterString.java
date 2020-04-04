package com.foolstak.strings;

import java.util.HashMap;

public class UniqueCharacterString {

    public static  boolean isUniqueWithSeparateDatastructure(String stringUnderQuestion){
        HashMap<Character, Integer> characterMap = new HashMap<>();
        for(int i = 0; i < stringUnderQuestion.length(); i++){
            if(characterMap.get(stringUnderQuestion.charAt(i))  != null){
                return false;
            }
            else{
                characterMap.put(stringUnderQuestion.charAt(i), 1);
            }
        }
        return true;
    }

}
