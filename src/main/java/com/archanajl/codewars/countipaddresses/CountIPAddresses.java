package com.archanajl.codewars.countipaddresses;

import java.util.*;
import java.lang.*;
public class CountIPAddresses {

    public static long ipsBetween(String start, String end) {

        String[] startArr = start.split("\\.");
        String[] endArr = end.split("\\.");


        long startIPAddress = Long.parseLong(startArr[0]) * 256 * 256 * 256 + Long.parseLong(startArr[1]) * 256 * 256 + Long.parseLong(startArr[2]) * 256 + Long.parseLong(startArr[3]) ;
        long endIPAddress = Long.parseLong(endArr[0]) * 256 * 256 * 256 + Long.parseLong(endArr[1]) * 256 * 256 + Long.parseLong(endArr[2]) * 256 + Long.parseLong(endArr[3]) ;


        return Math.abs(startIPAddress - endIPAddress);
    }
}