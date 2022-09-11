package com.algorithm.likou.p101_p200;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName:p119_杨辉三角II
 * @Auther: Lyh
 * @Date: 2022/7/13 14:33
 * @Version: v1.0
 */
public class p119_杨辉三角II {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<Integer>();
        //初始化第0列
        row.add(1);

        for (int i = 1; i <= rowIndex; ++i) {
            //先占一列
            row.add(0);
            //更新每一列
            //从右向左更新
            for (int j = i; j > 0; --j) {
                row.set(j, row.get(j) + row.get(j - 1));
            }
        }
        return row;
    }
}
