package com.algorithm.likou.p1601_p1700;

/**
 * @ClassName:p1700_无法吃午餐的学生数量
 * @Auther: Lyh
 * @Date: 2022/10/19 22:20
 * @Version: v1.0
 */
public class p1700_无法吃午餐的学生数量 {
    public int countStudents(int[] a, int[] b) {
        int[] cnts = new int[2];
        for (int x : a) cnts[x]++;
        for (int i = 0; i < b.length; i++) {
            //人数相同
            //此时没有人想要栈顶的三明治，则该三明治和后面的三明治都吃不到了
            if (--cnts[b[i]] == -1) return b.length - i;
        }
        return 0;
    }
}
