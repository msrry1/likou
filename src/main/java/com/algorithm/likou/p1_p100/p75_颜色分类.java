package com.algorithm.likou.p1_p100;

/**
 * @ClassName:p75_颜色分类
 * @Auther: Lyh
 * @Date: 2022/7/12 15:24
 * @Version: v1.0
 */
public class p75_颜色分类 {
    public void sortColors(int[] nums) {
        //[0, zero)
        //[zero, two)
        //[two, len-1];
        int zero = 0;
        int two = nums.length;
        int len = two;
        if(len < 2){
            return;
        }
        for(int i = 0;i < two;i++){
            if(nums[i] == 0){
                swap(nums, i, zero);
                zero++;
            } else if(nums[i] == 2){
                two--;
                swap(nums, i, two);
                i--;
            }
        }
    }
    //交换i下标和j下标的元素
    public void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
