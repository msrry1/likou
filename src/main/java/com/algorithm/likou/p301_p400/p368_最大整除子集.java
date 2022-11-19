package com.algorithm.likou.p301_p400;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @ClassName:p368_最大整除子集
 * @Auther: Lyh
 * @Date: 2022/9/28 14:58
 * @Version: v1.0
 */
public class p368_最大整除子集 {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        Arrays.sort(nums);
        Arrays.fill(dp,1);
        int maxLength = 1;
        int maxI = nums[0];
        for(int i = 1;i < n;i++){
            for(int j = 0;j < i;j++){
                if(nums[i]%nums[j] == 0){
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            if(dp[i] > maxLength){
                maxLength = dp[i];
                maxI = nums[i];
            }
        }
        List<Integer> res = new ArrayList();
        for(int i = n-1;i >= 0;i--){
            if(maxLength == dp[i] && maxI%nums[i] == 0){
                res.add(nums[i]);
                maxLength--;
                maxI = nums[i];
            }
        }
        return res;
    }
}
