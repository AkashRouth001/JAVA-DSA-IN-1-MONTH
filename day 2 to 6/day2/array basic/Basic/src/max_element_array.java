
/*Given an array of integers nums, return the value of the largest element in the array

Examples:
Input: nums = [3, 3, 6, 1]
Output: 6
Explanation: The largest element in array is 6

Input: nums = [3, 3, 0, 99, -40]
Output: 99
Explanation: The largest element in array is 99*/

public class max_element_array {
    public static int largestElement(int[] nums) {
        int n  = nums.length;
        int max = Integer.MIN_VALUE;
        for(int i =0;i<n;i++){
            if(nums[i]>max){
                max = nums[i];
            }
        }
        return max;
    }

    public static void main(String[]args){
        //int []num =  {3, 3, 6, 1};
        int []num ={3, 3, 0, 99, -40};
        int max = largestElement(num);
        System.out.println("the max element:"+max);

    }

}
