package com.algorithm.likou.p400_p500;

/**
 * @ClassName:p413_等差数列划分
 * @Auther: Lyh
 * @Date: 2022/7/24 14:04
 * @Version: v1.0
 */
public class p413_等差数列划分 {
    public int numberOfArithmeticSlices(int[] nums)
    {
        if(nums.length<3)return 0;
        int[] dp=new int[nums.length];
        int res=0;
        dp[1]=0;
        for(int i=2;i<nums.length;i++)
        {
            if(nums[i]-nums[i-1]==nums[i-1]-nums[i-2])dp[i]=dp[i-1]+1;
            else dp[i]=0;
            res+=dp[i];
        }
        return res;

    }
}
