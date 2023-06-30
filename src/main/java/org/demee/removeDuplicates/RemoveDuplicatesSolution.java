package org.demee.removeDuplicates;

public class RemoveDuplicatesSolution {
    public static void main(String[] args) {
       
        RemoveDuplicatesSolution removeDuplicatesSolution = new RemoveDuplicatesSolution();

        removeDuplicatesSolution.replaceString();


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

    public void replaceString() {
                String s = "A man, a plan, a canal: Panama";

        s.length();

        // remove all non alphanumeric characters form the string s
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        // print s
        System.out.println(s);
    }
}
