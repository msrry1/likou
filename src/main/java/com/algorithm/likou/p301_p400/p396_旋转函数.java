package com.algorithm.likou.p301_p400;

import java.util.Arrays;

/**
 * @ClassName:p396_旋转函数
 * @Auther: Lyh
 * @Date: 2022/11/19 20:54
 * @Version: v1.0
 */
public class p396_旋转函数 {
	public int maxRotateFunction(int[] nums) {
		int f = 0, n = nums.length, numSum = Arrays.stream(nums).sum();
		for (int i = 0; i < n; i++) {
			f += i * nums[i];
		}
		int res = f;
		for (int i = n - 1; i > 0; i--) {
			f += numSum - n * nums[i];
			res = Math.max(res, f);
		}
		return res;
	}
}
