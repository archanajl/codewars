package com.archanajl.codewars.stringmanipulation;

public class PigLatin {
    public static String pigIt(String str) {
        // Write code here
      String[] arrstr = str.split(" ");
      String current_word = "";
      String result_word = "";
      for (int i=0;i<=arrstr.length-1;i++){
        // check whether it is alphabet and then alter the word
        if (arrstr[i].matches("^[a-zA-Z]*$"))
          current_word = arrstr[i].substring(1) + arrstr[i].substring(0,1) + "ay";
        else
          current_word = arrstr[i];
        // don't add space for last word
        if (i !=arrstr.length-1) current_word = current_word + " ";
        result_word = result_word + current_word;
      }
      return result_word;
    }
}