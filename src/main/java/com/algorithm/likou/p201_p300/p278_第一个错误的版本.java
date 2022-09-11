package com.algorithm.likou.p201_p300;

/**
 * @ClassName:p278_第一个错误的版本
 * @Auther: Lyh
 * @Date: 2022/6/27 18:37
 * @Version: v1.0
 */
public class p278_第一个错误的版本 {

    public boolean isBadVersion(int mid){
        //判断是否错误
        //只做占位
        return true;
    }
    public int firstBadVersion(int n) {
        int left = 1, right = n;
        while (left < right) { // 循环直至区间左右端点相同
            int mid = left + (right - left) / 2; // 防止计算时溢出
            if (isBadVersion(mid)) {
                right = mid; // 答案在区间 [left, mid] 中
            } else {
                left = mid + 1; // 答案在区间 [mid+1, right] 中
            }
        }
        // 此时有 left == right，区间缩为一个点，即为答案
        return left;
    }
}
