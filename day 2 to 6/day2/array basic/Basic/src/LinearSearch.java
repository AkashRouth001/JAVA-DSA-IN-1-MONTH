/*
Linear Search
Given an array of integers nums and an integer target, find the smallest index (0 based indexing) where the target appears in the array. If the target is not found in the array, return -1

Examples:
Input: nums = [2, 3, 4, 5, 3], target = 3
Output: 1
Explanation: The first occurence of 3 in nums is at index 1

Input: nums = [2, -4, 4, 0, 10], target = 6
Output: -1
Explanation: The value 6 does not occur in the array, hence output is -1
 */
public class LinearSearch {
    public static void main(String[]args){
        int []num ={3,4,5,1,2,6};
        int target = 51;
        int ans = LS(num,target);
        System.out.println("the location  is :"+ans);
    }
    public static int LS(int []num,int target){
        for(int i =0;i<num.length;i++){
            if(num[i]==target){
                return i;
            }
        }
        return -1;
    }
}
