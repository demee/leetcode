package org.demee.removeElement;

public class RemoveElementSolution {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5 };

        int len = new RemoveElementSolution().removeElement(nums, 3);

        System.out.println(len);

        // print nums elements
        for (int i = 0; i < len; i++) {
            System.out.println(nums[i]);
        }
    }

    public int removeElement(int[] nums, int val) {
        int k = 0; 
        for(int i=0; i< nums.length; i++) {
            if(nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}
