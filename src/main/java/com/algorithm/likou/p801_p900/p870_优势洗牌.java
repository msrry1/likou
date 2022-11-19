package com.algorithm.likou.p801_p900;

import sun.reflect.generics.tree.Tree;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * @ClassName:p870_优势洗牌
 * @Auther: Lyh
 * @Date: 2022/10/8 13:07
 * @Version: v1.0
 */
public class p870_优势洗牌 {

    public static void main(String[] args) {
        int[] nums1 = {2,7,11,15};
        int[] nums2 = {1,10,4,11};
        Integer[] ns = new Integer[]{0,1,2,3};
        Arrays.sort(ns,(i, j) -> nums2[i] - nums2[j]);
        for (int i = 0; i < ns.length; i++) {
            System.out.println(ns[i]);
        }
    }
    public static int[] advantageCount(int[] nums1, int[] nums2) {
        int[] n1s = Arrays.copyOf(nums1, nums1.length);
        Arrays.sort(n1s);
        int k = 0;
        for(int i = 0;i < nums2.length;i++){
            for(int j = 0;j < n1s.length;j++){
                if(nums2[i] < n1s[j]){
                    nums1[k++] = n1s[j];
                    break;
                }
            }
        }

        return nums1;
    }
}
