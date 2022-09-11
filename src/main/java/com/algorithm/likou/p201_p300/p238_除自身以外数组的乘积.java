package com.algorithm.likou.p201_p300;

/**
 * @ClassName:p238_除自身以外数组的乘积
 * @Auther: Lyh
 * @Date: 2022/7/15 11:38
 * @Version: v1.0
 */
public class p238_除自身以外数组的乘积 {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        ans[0] = 1;
        for(int i = 1;i < n;i++){
            ans[i] = nums[i-1] * ans[i-1];
        }
        int R = 1;
        for(int i = n-1;i >= 0;i--){
            //左边*右边等于中间
            ans[i] = ans[i] * R;
            R *= nums[i];
        }
        return ans;
    }
}
