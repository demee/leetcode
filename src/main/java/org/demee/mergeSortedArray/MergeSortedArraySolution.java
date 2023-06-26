package org.demee.mergeSortedArray;

public class MergeSortedArraySolution {
    public static void main(String[] args) {
        int[] nums1 = { 1, 2, 3, 4, 5 };
        int[] nums2 = {};

        new MergeSortedArraySolution().merge2(nums1, 5, nums2, 0);

                // print nums1 elements
        for (int i = 0; i < nums1.length; i++) {
            System.out.println(nums1[i]);
        }
    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {

        if (m == 0) {
            for (int i = 0; i < n; i++) {
                nums1[i] = nums2[i];
            }
        } else if (n == 0) {
            // num1 is already the answer
        } else {
            int[] out = new int[m + n];
            int[] nums2copy = new int[n + 1];
            for (int i = 0; i < n; i++) {
                nums2copy[i] = nums2[i];
            }

            int s = 0;
            int mi = 0;
            int ni = 0;

            if (m + n > 1 && (n > 0 && m > 0)) {
                nums1[m] = Integer.MAX_VALUE;
                nums2copy[n] = Integer.MAX_VALUE;
            }

            while (s < m + n) {
                if ((nums1[mi] < nums2copy[ni])) {
                    out[s] = nums1[mi];
                    if (mi < m)
                        mi++;
                } else {
                    out[s] = nums2[ni];
                    if (ni < n)
                        ni++;
                }
                s++;
            }
            for (int k = 0; k < out.length; k++) {
                nums1[k] = out[k];
            }
        }
    }

    public void merge2(int[] nums1, int m, int[] nums2, int n) {
            int k = m+n-1;
            m--; //for memory management i didnt use additional variables
            n--;
            
            //note: 'm'th index and 'nums1' array's last index are different.

            //the below loop will be looking for the largest element from the 'm'th and 'n'th indices. The largest one will be inserted from the last index of nums1 array.
            while(m>=0 && n >=0)
            {
                if(nums1[m] >= nums2[n])
                {
                    nums1[k--] = nums1[m--];
                }
                else{
                    nums1[k--] =  nums2[n--];
                }
            }

            //finally, only the elements from nums2 array will be remaining. Note: if nums1 array's elements are remaining, they are already in the proper order. Just think!!

            while(n>=0) //add elements from nums2 array from the place where we left(i.e.'k'th index and 'n'th index).
            {
                nums1[k--] = nums2[n--];
            }

    }
}
