package com.algorithm.likou.p101_p200;

/**
 * @ClassName:p167_两数之和II_输入有序数组
 * @Auther: Lyh
 * @Date: 2022/6/29 23:07
 * @Version: v1.0
 */
public class p167_两数之和II_输入有序数组 {
    public int[] twoSum(int[] numbers, int target) {
        int p = 0,q = numbers.length-1;
        while(p < q){
            if(numbers[p] + numbers[q] == target){
                return new int[] {p+1,q+1};
            } else if(numbers[p] + numbers[q] > target){
                q--;
            } else {
                p++;
            }
        }
        return new int[] {-1, -1};
    }
}
