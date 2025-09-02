/*
Second Largest Element

Given an array of integers nums, return the second-largest element in the array. If the second-largest element does not exist, return -1.

Examples:
Input: nums = [8, 8, 7, 6, 5]
Output: 7
Explanation: The largest value in nums is 8, the second largest is 7

Input: nums = [10, 10, 10, 10, 10]
Output: -1
Explanation: The only value in nums is 10, so there is no second largest value, thus -1 is returned
 */
public class s2ndLargestElementArray {
    public static void main(String[]args){
        int []num ={3,4,5,1,2,6};
        int ans = secondLargestElement(num);
        System.out.println("the second largest value is :"+ans);
    }
    public static int secondLargestElement(int[] nums) {
        int n = nums.length;
        int large = nums[0];
        int slarge = -1;

        for(int i =1;i<n;i++){
            if(nums[i]>large){
                slarge=large;
                large = nums[i];

            }
            else if(nums[i]<large && nums[i]>slarge){
                slarge = nums[i];
            }
        }

        return slarge;
    }
}
