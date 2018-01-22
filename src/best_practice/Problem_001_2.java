package best_practice;

import java.util.HashMap;
import java.util.Map;

/**
 * 1. Two Sum
 * 
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 * 
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * 
 * Example:
 * Given nums = [2, 7, 11, 15], target = 9,
 * Because nums[0] + nums[1] = 2 + 7 = 9,
 * return [0, 1].
 *
 */
public class Problem_001_2 {
	public static void main(String[] args) {
		int[] num = {2, 7, 11, 15};
		int[] num1 = {3,2,4};
		int[] sum;
		sum = twoSum(num,9);
		for(int n: sum){
			System.out.println(n);
		}
		
		System.out.println();
		sum = twoSum(num1,6);
		for(int n: sum){
			System.out.println(n);
		}
	}
	
/**
 * Approach #3 (One-pass Hash Table) [Accepted]
 * 
 * It turns out we can do it in one-pass. 
 * While we iterate and inserting elements into the table, we also look back to check if 
 * current element's complement already exists in the table. 
 * If it exists, we have found a solution and return immediately.
 */
	public static int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<>();
		int complement;
	    for (int i = 0; i < nums.length; i++) {
	        complement = target - nums[i];
	        if (map.containsKey(complement)) {
	            return new int[] { map.get(complement), i };
	        }
	        map.put(nums[i], i);
	    }
	    throw new IllegalArgumentException("No two sum solution");
	}
}
