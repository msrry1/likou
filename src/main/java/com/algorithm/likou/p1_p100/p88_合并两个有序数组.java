package com.algorithm.likou.p1_p100;

/**
 * @ClassName:p88_合并两个有序数组
 * @Auther: Lyh
 * @Date: 2022/6/29 21:09
 * @Version: v1.0
 */
public class p88_合并两个有序数组 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] nums = new int[m+n];
        int p = 0;
        int i = 0,j = 0;
        while(m != 0 || n != 0){
            if(m == 0){
                nums[p++] = nums2[j++];
                n--;
            } else if(n == 0){
                nums[p++] = nums1[i++];
                m--;
            } else{
                if(nums1[i] < nums2[j]){
                    nums[p++] = nums1[i++];
                    m--;
                } else{
                    nums[p++] = nums2[j++];
                    n--;
                }
            }
        }
        for(i = 0;i < nums.length;i++){
            nums1[i] = nums[i];
        }
    }
}
