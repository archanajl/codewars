package com.archanajl.codewars.permutations;

import java.util.List;
import java.util.ArrayList;

public class Permutations {


    public static List<String> singlePermutations(String s) {
        List<String> outputList = new ArrayList<>();
        getWord(s, "", outputList);
        return outputList;
    }

    public static void getWord(String str, String output, List<String> outputList){

        // If string is empty
        if (str.length() == 0 ) {
            if (!outputList.contains(output.trim())){
                outputList.add(output.trim());
                return;
            }
        }

        for (int i = 0; i < str.length(); i++) {

            // ith character of str
            char ch = str.charAt(i);

            // Rest of the string after excluding
            // the ith character
            String ros = str.substring(0, i) +
                    str.substring(i + 1);

            // Recursive call
            getWord(ros, output + ch, outputList);
        }

    }

}
