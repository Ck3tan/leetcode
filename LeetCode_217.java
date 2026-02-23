/*217. Contains Duplicate
Given an integer array nums, return true if any value appears at least twice in the array,
and return false if every element is distinct.
Example 1:
Input: nums = [1,2,3,1]
Output: true

Example 2:
Input: nums = [1,2,3,4]
Output: false           
Example 3:
Input: nums = [1,1,1,3,3,4,3,2,4,2]  
Output: true
Constraints:
1 <= nums.length <= 105
-109 <= nums[i] <= 109

Create a HashSet to store the unique elements encountered in the array.
Iterate through each element in the nums array:
For each element, check if it already exists in the HashSet.
If it does, return true (indicating a duplicate is found).
If it does not, add the element to the HashSet.
If the loop completes without finding any duplicates, return false (indicating all elements are distinct).      

*/


import java.util.HashSet;
import java.util.Set;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> duplicateLookup = new HashSet<>();

        for(int num : nums){
            if(duplicateLookup.contains(num))
                return true;
            else 
                duplicateLookup.add(num);
        }
        return false;
    }
}

//------------- Array Sort Method -----------------

class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i] == nums[i + 1])
                return true;
        }
        return false;
    }
}