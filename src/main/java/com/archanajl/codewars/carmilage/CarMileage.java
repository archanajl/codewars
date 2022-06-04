package com.archanajl.codewars.carmilage;

import java.util.Arrays;
import java.lang.*;


public class CarMileage {
  
  public static int isInteresting(int number, int[] awesomePhrases) {
    int current_number = number;  
  
    int result = 0;
    // small numbers
    if (number < 98) return 0;
  
    while (current_number <= number + 2)  {
   
      // Get the digits in an array
      int[] digits = Integer.toString(current_number).chars().map(c -> c-'0').toArray();
      int no_of_digits = digits.length;

      // In case of 98, 99, -> skip the numbers and check for 100 and return 1 
      if (current_number<100) {
        current_number = current_number + 1;
        continue;
      }

      int first_digit = digits[0];
      int number_of_zero = 0;
      int same_digit = 0;
      int increasing = 0;
      int decreasing = 0;
      int palindrome = 0;
      
      boolean isPalindrome = false;
      boolean isBoring = false;

      // check whether it is in array
      Arrays.sort(awesomePhrases);  
      boolean isInArray = Arrays.binarySearch(awesomePhrases, current_number) >= 0;

      // check palindrome
      String str = String.valueOf(current_number);
      StringBuilder builder = new StringBuilder(str);
      builder.reverse();
      if (str.toString().equals(builder.toString())) isPalindrome = true;
      if (digits[0] == first_digit ) palindrome++;
      
      // Check all zero's, repetition, increasing, decreasing
      for (int i=1;i<=no_of_digits-1; i++){
        
        if (digits[i]+1 == digits[i-1]) decreasing++;
        if ((digits[i] == digits[i-1]+1 ) || (digits[i] == 0 && digits[i-1] == 9) ) increasing++;
        if (digits[i] == 0) number_of_zero++; 
        if (digits[i] == first_digit) same_digit++;
      }
      
      if  ((number_of_zero == no_of_digits -1 ) || (same_digit == no_of_digits-1) || (increasing == no_of_digits-1) || (decreasing == no_of_digits-1) || isPalindrome || isInArray)
        {
        // Given number satisfies the condition
        if (number == current_number ){
          result =2;
         break;
        }
        // Upcoming Numbers
        else{
          result = 1;
          break;
        }
      } 
      
      current_number = current_number + 1;
    }
       return result;      
    }

  
}