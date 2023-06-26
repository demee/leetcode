package org.demee.mergeSortedArray;

import org.junit.Test;

public class MergeSortedArraySolutionTest {
    @Test
    public void testMerge() {
        MergeSortedArraySolution solution = new MergeSortedArraySolution();
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        
        solution.merge(nums1, 3, nums2, 3);
        
        for (int i = 0; i < nums1.length; i++) {
            System.out.println(nums1[i]);
        }
    }
    
}
