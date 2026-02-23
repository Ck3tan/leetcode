/*
345. Reverse Vowels of a String

Given a string s, reverse only all the vowels in the string and return it.

The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.

 

Example 1:

Input: s = "IceCreAm"

Output: "AceCreIm"

Explanation:

The vowels in s are ['I', 'e', 'e', 'A']. On reversing the vowels, s becomes "AceCreIm".

Example 2:

Input: s = "leetcode"

Output: "leotcede"

 

Constraints:

1 <= s.length <= 3 * 105
s consist of printable ASCII characters.

*/



class Solution {
    public String reverseVowels(String s) {
        int left = 0, right = s.length() - 1;
        char[] stringArray = s.toCharArray();
        String vowels = "aAeEiIoOuU";

        while(left <= right){
         
         while(left < right && vowels.indexOf(stringArray[left]) == -1){
            left ++;
         }
         while( left < right && vowels.indexOf(stringArray[right]) == -1){
            right --;
         }
         
                char temp = stringArray[left];
                stringArray[left] = stringArray[right];
                stringArray[right] = temp;
                left ++;
                right --;

         }
         String answer = new String(stringArray);
        return answer;
    }    
}