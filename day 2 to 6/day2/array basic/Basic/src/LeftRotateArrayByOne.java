/*Left Rotate Array by One
Given an integer array nums, rotate the array to the left by one.
Note: There is no need to return anything, just modify the given array.

Examples:

Input: nums = [1, 2, 3, 4, 5]
Output: [2, 3, 4, 5, 1]
Explanation: Initially, nums = [1, 2, 3, 4, 5]
Rotating once to left -> nums = [2, 3, 4, 5, 1]

Input: nums = [-1, 0, 3, 6]
Output: [0, 3, 6, -1]
Explanation: Initially, nums = [-1, 0, 3, 6]
Rotating once to left -> nums = [0, 3, 6, -1]
 */
public class LeftRotateArrayByOne {
    public static void main(String[]args){
        int []num ={1,2,3,4,5};
        rotateArrayByOne(num);
        System.out.println("now the array  is :");
        for (int i =0;i<num.length;i++){
            System.out.print(num[i]+" ");
        }
    }
    public static void rotateArrayByOne(int[] nums) {
        int n = nums.length;
        int temp = nums[0];
        for(int i =1;i<n;i++){
            nums[i-1] = nums[i];
        }
        nums[n-1]=temp;


    }
}
