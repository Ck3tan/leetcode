/*
349. Intersection of Two Arrays
https://leetcode.com/problems/intersection-of-two-arrays/
Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must be unique and you may return the result in any order.

Example 1:
Input: nums1 = [1,2,2,1], nums2 = [2]
Output: [2]

Example 2:
Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [9,4]
Explanation: [4,9] is also accepted.        

Constraints:
1 <= nums1.length, nums2.length <= 1000
0 <= nums1[i], nums2[i] <= 1000 

 */


/*

Create a set to store unique elements of nums1. 

Then, iterate through nums2 and check if any element is present in the set. 
If it is, add it to the result list (ensuring uniqueness). 

Finally, convert the result list to an array and return it.

*/


import java.util.*;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {


        ArrayList<Integer> resultList = new ArrayList<>();
        Set<Integer> checkSet = new HashSet<>();

        for(int num : nums1){
            if(!checkSet.contains(num))
                checkSet.add(num);
        }

        for(int num : nums2){
            if(checkSet.contains(num))
                if(!resultList.contains(num))
                     resultList.add(num);
        }

        int[] result = new int[resultList.size()];
        for(int k = 0; k < result.length; k++){
            result[k] = resultList.get(k);
        }

        return result;
        
    }
}

