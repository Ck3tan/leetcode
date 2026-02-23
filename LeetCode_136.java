/* 136. Single Number
Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

Example 1:
Input: nums = [2,2,1]
Output: 1

Example 2:
Input: nums = [4,1,2,1,2]
Output: 4

Example 3:
Input: nums = [1]
Output: 1

Constraints:
1 <= nums.length <= 3 * 104
-3 * 104 <= nums[i] <= 3 * 104
Each element in the array appears twice except for one element which appears only once.
Follow up: Could you implement a solution with a linear runtime complexity and without using extra memory?

Best Solution: Use XOR
The trick is to use the bitwise XOR (^) operator.
Why XOR works

a ^ a = 0
a ^ 0 = a

XOR is commutative and associative
So when you XOR all numbers:

All duplicate numbers cancel out, leaving only the single number.

Example:

[4,1,2,1,2]

4 ^ 1 ^ 2 ^ 1 ^ 2
= 4 ^ (1^1) ^ (2^2)
= 4 ^ 0 ^ 0
= 4

*/


class Solution {
    public int singleNumber(int[] nums) {
        
        int num=0;
        for(int number:nums){
            num=num^number;
        }
        return num;
        
    }
}
