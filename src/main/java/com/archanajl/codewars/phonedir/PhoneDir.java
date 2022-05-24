package com.archanajl.codewars.phonedir;

public class PhoneDir {

    public static  String phone(String strng, String num) {

        // check for no occurrence or multiple occurrences
        int index = strng.indexOf("+" + num);
        if (index == -1){
            return "Error => Not found: " + num;
        } else{
            if (strng.indexOf("+" + num,index +1) != -1 )
                return "Error => Too many people: " + num;
        }
        String[] strlines = strng.split("\n");
        // Loop through the directory
        for(String strline: strlines){
            // Find the line containing the number
            if (strline.contains("+" + num)){
                //find the values to be displayed
                strline = strline.replace(num,"");
                String strName = strline.substring(strline.indexOf("<") +1,strline.indexOf(">"));
                strline = strline.replace("<"+strName+">","");
                strline = strline.replaceAll("[\\_]"," ");
                strline = strline.replaceAll("[^\\w\\s\\-\\.]","");
                strline = strline.replaceAll("\\s+"," ");
                return "Phone => " + num + ", Name => " + strName + ", Address => " + strline.trim();
            }
        }
        return strng;
    }
}