package com.archanajl.codewars.weightforweight;

import java.util.*;

public class WeightSort  {

    public static String orderWeight(String strng) {

        Map<String, Integer> hashmap=new HashMap<String, Integer>();
        Map<String, Integer> sortedmap=new HashMap<String, Integer>();
        Map<String, Integer> repmap=new HashMap<String, Integer>();

        String result = "";
        int weight = 0;

        String[] numArray = strng.split(" ");
        for ( String strNum: numArray){

            weight =0;
            for (int i = 0; i < strNum.length(); i++) {
                weight += Character.getNumericValue(strNum.charAt(i));
            }
            // If there is any duplicate entry , maintain it in the repmap
            if (hashmap.containsKey(strNum)){
                if(repmap.containsKey(strNum)) repmap.put(strNum,repmap.get(strNum) + 1);
                else repmap.put(strNum, 2);
            }
            hashmap.put( strNum, weight );

        }
        // get the hashmap sorted
        sortedmap = sortByValue(hashmap);
        // create the result string while checking the repmap for repition
        for (Map.Entry<String, Integer> entry : sortedmap.entrySet())
        {
            if(repmap.containsKey(entry.getKey())) result += (entry.getKey() + " ").repeat(repmap.get(entry.getKey()));
            else result += entry.getKey() + " ";
        }

        return result.trim();
    }

    // Sorting the hash map
    public static Map<String,Integer> sortByValue(Map<String,Integer> map)
    {

        //convert HashMap into List
        List<Map.Entry<String, Integer>> list = new LinkedList<>(map.entrySet());
        //sorting the list elements
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>()
        {
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2)
            {
                if ( o1.getValue() == o2.getValue() )
                    return o1.getKey().compareTo(o2.getKey());
                return Integer.compare(o1.getValue() , o2.getValue());
            }
        });

        //return the sorted HashMap
        Map<String, Integer> sortedMap = new LinkedHashMap<String, Integer>();
        for (Map.Entry<String, Integer> entry : list)
        {
            sortedMap.put(entry.getKey(), entry.getValue());
        }
        return sortedMap;
    }


}