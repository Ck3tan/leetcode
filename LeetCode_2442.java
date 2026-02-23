/*
2442. Count Number of Distinct Integers After Reverse Operations

You are given an array nums consisting of positive integers.

You have to take each integer in the array, reverse its digits, and add it to the end of the array. You should apply this operation to the original integers in nums.

Return the number of distinct integers in the final array.

 

Example 1:

Input: nums = [1,13,25,5]
Output: 4
Explanation: After including the reverse of each number, the resulting array is [1,13,25,5,1,31,52,5].
The reversed integers that were added to the end of the array are in bold. The resulting array has 4 distinct integers.
Example 2:

Input: nums = [2,2,2]
Output: 1
Explanation: After including the reverse of each number, the resulting array is [2,2,2,2].
The resulting array has 1 distinct integer.
 

Constraints:

1 <= nums.length <= 105
1 <= nums[i] <= 106

Create a helper function to reverse the digits of an integer.
Create a HashSet to store the distinct integers encountered in the array.
Iterate through each integer in the input array nums:
For each integer, check if it is already in the HashSet. If not, add it to the HashSet.
Use the helper function to reverse the integer and check if the reversed integer is already in the HashSet. If not, add the reversed integer to the HashSet.
After iterating through all the integers in the input array, return the size of the HashSet, which represents the number of distinct integers in the final array.

*/

import java.util.Set;
import java.util.HashSet;

class Solution {
    
    // helper function to reverese number
    public int reverseDigits(int n){
        int result = 0, digit = 0;
        while(n > 0){
            digit = n % 10;
            result = (result * 10) + digit;
            n = n /10;
        }
        return result;
    }

    public int countDistinctIntegers(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        // check if number and its reverse is in set if not than add in set
        for(int i : nums){
            if(!seen.contains(i))
                seen.add(i);
            if(!seen.contains(reverseDigits(i)))
                seen.add(reverseDigits(i));
        }
        // return set size which is the number of distinct intergers 
        return seen.size();
    }
}