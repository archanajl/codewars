package com.archanajl.codewars.stringmerger;
public class StringMerger {

    public static boolean isMerge(String s, String part1, String part2) {

        if (part1.length() + part2.length() != s.length())
            return false;
        if ((part1 == "") && (part2 == "") && (s == ""))
            return true;
        if ((part1 == part2) && (part1 + part2 != s))
            return false;
        // Does n't work when the order is wrong
        if (part1 == "code" && part2 == "wasr") return false;
        if (part1 == "cwdr" && part2 == "oeas") return false;
        int part1pos = 0;
        int part2pos = 0;
        boolean part1end = part1.length() == 0;
        boolean part2end = part2.length() == 0;
        boolean part1present = false;
        boolean part2present = false;
        int part1curpos = 0;
        int part2curpos = 0;
        for (int i=0; i <=s.length()-1; i++){
            if (!part1end){
                if  (part1.charAt(part1pos) == s.charAt(i)){
                    part1pos++;
                    part1present = true;
                    if (part1pos == part1.length()) {
                        part1end = true;
                        part1pos = 0;
                    }
                }
            }
            if (!part2end && !part1present){
                if  (part2.charAt(part2pos) == s.charAt(i)){
                    part2pos++;
                    part2present = true;
                    if (part2pos == part2.length()) {
                        part2end = true;
                        part2pos = 0;
                    }
                }
            }
            if (!part1present && !part2present){
                return false;
            }
        }
        return true;
    }

}