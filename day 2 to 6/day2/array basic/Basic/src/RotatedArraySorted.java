/*1752. Check if Array Is Sorted and Rotated

Given an array nums, return true if the array was originally sorted in non-decreasing order, then rotated some number of positions (including zero). Otherwise, return false.
There may be duplicates in the original array.
Note: An array A rotated by x positions results in an array B of the same length such that B[i] == A[(i+x) % A.length] for every valid index i.

Example 1:
Input: nums = [3,4,5,1,2]
Output: true
Explanation: [1,2,3,4,5] is the original sorted array.
You can rotate the array by x = 2 positions to begin on the element of value 3: [3,4,5,1,2].

Example 2:
Input: nums = [2,1,3,4]
Output: false
Explanation: There is no sorted array once rotated that can make nums.

Example 3:
Input: nums = [1,2,3]
Output: true
Explanation: [1,2,3] is the original sorted array.
You can rotate the array by x = 0 positions (i.e. no rotation) to make nums.

Constraints:
1 <= nums.length <= 100
1 <= nums[i] <= 100

 */
public class RotatedArraySorted {
    public static void main(String[]args){
        int []num ={3,4,5,1,2};
        boolean ans = check(num);
        System.out.println("the array is sorted:"+ans);
    }
    public static boolean check(int[] nums) {
        int n =nums.length;
        int count =0;
        for(int i =0;i<n;i++){
            if(nums[i]>nums[(i+1)%n]) count++;
            if(count>1) return false;
        }
        return true;
    }
}
/*🔹 Explanation of the Code Logic

The problem asks: is the array sorted in non-decreasing order, and then rotated some number of times?
To solve this, we check how many times the order "drops" (an element is bigger than the one after it).

🔹 Key Idea

In a perfectly sorted array, every element is ≤ the next one.

If the array is just rotated, then there can be at most one place where the order breaks (the rotation point).

If there are two or more breaks, it’s not possible to form the array by rotation.

🔹 How the Code Works

Let n = nums.length.

Loop through all indices i = 0 to n-1.

Compare nums[i] with nums[(i+1) % n].

The % n makes sure we also compare the last element with the first one.

If nums[i] > nums[(i+1) % n], that’s a drop.

Keep count of how many drops we find.

At the end:

If drops <= 1, return true.

Otherwise, return false.

🔹 Why (i+1) % n?

For i = 0, 1, 2, …, n-2, it just gives i+1.

For i = n-1 (the last element), (n) % n = 0, so we wrap around and compare nums[n-1] with nums[0].

This way, we check the entire circle of the array, including the rotation point.

🔹 Example Walkthrough

Take nums = [3, 4, 5, 1, 2]:

Compare 3 vs 4 → OK

Compare 4 vs 5 → OK

Compare 5 vs 1 → drop found

Compare 1 vs 2 → OK

Compare 2 vs 3 (wrap-around) → OK

Drops = 1 → ✅ Valid rotated sorted array.

👉 So the solution is basically:
Count the number of places where the array decreases. If it’s more than one, return false.

 */
