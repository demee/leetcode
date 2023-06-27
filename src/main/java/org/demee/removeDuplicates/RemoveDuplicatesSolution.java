package org.demee.removeDuplicates;

public class RemoveDuplicatesSolution {
    public static void main(String[] args) {
        int[] nums = { 1,1,1,2,2,3 };
        RemoveDuplicatesSolution removeDuplicatesSolution = new RemoveDuplicatesSolution();

        int k = removeDuplicatesSolution.removeSomeDuplicates(nums);

        //print k
        System.out.println(k);
        //print array nums
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int k = 0; 
        int b = nums[0];        
        for (int i = 1; i < nums.length; i++) {
            if (b != nums[i]) {
                k++;
                nums[k] = nums[i];                
                b = nums[i];
            }             
        }
        return k + 1;
    }

    public int removeSomeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int k = 0;
        int b = nums[0];
        int count = 0;

        for(int i = 1; i < nums.length; i++) {
            if( count < 1 || b != nums[i] ) {  
                k++;              
                nums[k] = nums[i];
                
                if(b == nums[i])
                    count++;
                else
                    count = 0;

                b = nums[i];
                
            } 
        }

        return k + 1;
    }
}
