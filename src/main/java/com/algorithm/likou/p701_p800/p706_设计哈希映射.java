package com.algorithm.likou.p701_p800;

import java.util.Arrays;

/**
 * @ClassName:p706_设计哈希映射
 * @Auther: Lyh
 * @Date: 2022/7/12 16:37
 * @Version: v1.0
 */
public class p706_设计哈希映射 {
    int[] map = new int[1000001];
    public p706_设计哈希映射() {
        Arrays.fill(map, -1);
    }

    public void put(int key, int value) {
        map[key] = value;
    }

    public int get(int key) {
        return map[key];
    }

    public void remove(int key) {
        map[key] = -1;
    }
}
