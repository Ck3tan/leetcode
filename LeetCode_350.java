/*
    * 350. Intersection of Two Arrays II
    * https://leetcode.com/problems/intersection-of-two-arrays-ii/  
    * 
    *  Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must appear as many times as it shows in both arrays and you may return the result in any order.
    *   
    * 
    *   *  Example 1:
    *   * Input: nums1 = [1,2,2,1], nums2 = [2,2]
    *  *   * Output: [2,2]
    *   *   * Example 2:
    *   *   * Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
    *  *   * Output: [4,9]
    *  *   * Explanation: [9,4] is also accepted.
    * 
    *   *   * Constraints:
    *  *   * 1 <= nums1.length, nums2.length <= 100
    *   * 0 <= nums1[i], nums2[i] <= 1000
    * 
 */


/*
  Create a frequency map for nums1 to count the occurrences of each element. 

  Then, iterate through nums2 and check if any element is present in the frequency map with a count greater than 0. If it is, add it to the result list and decrement the count in the frequency map.

  Finally, convert the result list to an array and return it.

  To reduce space complexity, we can directly store the result in an array and keep track of the index for insertion. After processing, we can return a copy of the result array up to the index of the last inserted element.


*/

import java.util.Map;
import java.util.HashMap;
import java.util.Arrays;


class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        
        Map<Integer, Integer> lookup = new HashMap<>();

        for(int num : nums1){
            lookup.put(num, lookup.getOrDefault(num, 0) + 1);
        }

        int[] result = new int[nums1.length];
        int k = 0;
        for(int num : nums2){
            if(lookup.containsKey(num) && lookup.get(num) >= 1){
                lookup.put(num, lookup.get(num) - 1);
                result[k] = num;
                k++;
            }
        }

        return Arrays.copyOfRange(result, 0, k);
        
    }
}