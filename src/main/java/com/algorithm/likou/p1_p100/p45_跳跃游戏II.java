package com.algorithm.likou.p1_p100;

/**
 * @ClassName:p45_跳跃游戏II
 * @Auther: Lyh
 * @Date: 2022/7/23 10:52
 * @Version: v1.0
 */
public class p45_跳跃游戏II {
    public int jump(int[] nums) {
        int n = nums.length;
        int now = n - 1;
        int ret = 0;
        while(now > 0){
            for(int i = 0;i < now;i++){
                if(i + nums[i] >= now){
                    now = i;
                    ret++;
                    break;
                }
            }
        }
        return ret;
    }
    // public int jump(int[] nums) {
    //     int length = nums.length;
    //     int end = 0;
    //     int maxPosition = 0;
    //     int steps = 0;
    //     for (int i = 0; i < length - 1; i++) {
    //         maxPosition = Math.max(maxPosition, i + nums[i]);
    //         if (i == end) {
    //             end = maxPosition;
    //             steps++;
    //         }
    //     }
    //     return steps;
    // }
}
