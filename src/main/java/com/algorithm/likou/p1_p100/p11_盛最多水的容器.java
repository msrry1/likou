package com.algorithm.likou.p1_p100;

/**
 * @ClassName:p11_盛最多水的容器
 * @Auther: Lyh
 * @Date: 2022/7/14 16:50
 * @Version: v1.0
 */
public class p11_盛最多水的容器 {
    public int maxArea(int[] height) {
        int n = height.length;
        int left = 0, right = n-1;
        int ans = 0;
        int count = 0;
        while(left < right){
            count = Math.min(height[left], height[right]) * (right-left);
            ans = Math.max(count, ans);
            if(height[left] <= height[right]){
                left++;
            } else{
                right--;
            }
        }
        return ans;
    }
}
