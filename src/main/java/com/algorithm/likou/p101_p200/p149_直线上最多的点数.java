package com.algorithm.likou.p101_p200;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName:p149_直线上最多的点数
 * @Auther: Lyh
 * @Date: 2022/7/30 16:50
 * @Version: v1.0
 */
public class p149_直线上最多的点数 {
    public int maxPoints(int[][] points) {
        int n = points.length;
        if (n <= 2) {
            return n;
        }
        int ret = 0;
        for (int i = 0; i < n; i++) {
            if (ret >= n - i || ret > n / 2) {
                break;
            }
            Map<String, Integer> map = new HashMap<String, Integer>();
            for (int j = i + 1; j < n; j++) {
                int x = points[i][0] - points[j][0];//x1-x2
                int y = points[i][1] - points[j][1];//y1-y2
                if (x == 0) {
                    y = 1;
                } else if (y == 0) {
                    x = 1;
                } else {
                    if (y < 0) {
                        x = -x;
                        y = -y;
                    }
                    int gcdXY = gcd(Math.abs(x), Math.abs(y));
                    x /= gcdXY;
                    y /= gcdXY;
                }
                String key = x + "_" + y;
                map.put(key, map.getOrDefault(key, 0) + 1);
            }
            int maxn = 0;
            for (Map.Entry<String, Integer> entry: map.entrySet()) {
                int num = entry.getValue();
                maxn = Math.max(maxn, num + 1);
            }
            ret = Math.max(ret, maxn);
        }
        return ret;
    }

    //求最大公因数
    public int gcd(int a, int b) {
        return b != 0 ? gcd(b, a % b) : a;
    }
}
