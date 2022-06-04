package com.archanajl.codewars.stripcomments;

public class StripComments {

  public static String stripComments(String text, String[] commentSymbols) {
    
    String input_text = new String(text);
    input_text.replaceAll("\\s+$", "");
    input_text.trim();
    String[] strArray = text.split("\r\n|\r|\n", -1);
    String result_word = "";
    for (int i=0; i < strArray.length;i++){
      System.out.println(strArray[i]);
      for (int j=0; j < commentSymbols.length;j++){
        if(strArray[i].indexOf(commentSymbols[j]) != -1){
          strArray[i] = strArray[i].substring(0,strArray[i].indexOf(commentSymbols[j]));
        }    else{
          strArray[i] = strArray[i];
        }     
        }
      result_word += strArray[i].replaceAll("\\s+$", "") ;
      if (i !=strArray.length) result_word += "\n";
    }
    return result_word.replaceAll("\\s+$", "");
  }
  
}