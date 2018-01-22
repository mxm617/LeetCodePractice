package my_submission;
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
 *@date 2017-11-28
 *@author Charles Mao
 */
public class Problem_001 {

	public static void main(String[] args) {
		int[] num = {2, 7, 11, 15};
		int[] sum;
		sum = twoSum(num,9);
		for(int n: sum){
			System.out.println(n);
		}
		
	}
	
	public static int[] twoSum(int[] nums, int target) {
        int i,j;
		int sum[] = {0,0};
        for(i=0; i<nums.length; i++){
        	for(j=i+1; j<nums.length; j++){
        		if(nums[i]+nums[j]==target){
        			sum[0] = i;
        			sum[1] = j;
        			return sum;
        		}
        	}
        }
        return sum;
    }

}
