package com.algorithm.likou.p400_p500;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @ClassName:p435_无重复区间
 * @Auther: Lyh
 * @Date: 2022/7/14 16:03
 * @Version: v1.0
 */
public class p435_无重复区间 {
    public int eraseOverlapIntervals(int[][] intervals) {

        int n = intervals.length;
        //根据右区间排序
        //根据结束时间排序
        Arrays.sort(intervals, new Comparator<int[]>() {
            public int compare(int[] interval1, int[] interval2) {
                return interval1[1] - interval2[1];
            }
        });
        //需要移除区间的最小数量就是总区间数量-不重复区间数量
        int ret = 1;
        int right = intervals[0][1];
        for(int i = 1;i < n;i++){
            if(intervals[i][0] >= right){
                //不重叠时
                ret++;
                right = intervals[i][1];
            }
        }
        return n - ret;
    }
}
