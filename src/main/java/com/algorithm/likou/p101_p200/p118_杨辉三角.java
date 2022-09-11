package com.algorithm.likou.p101_p200;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName:p118_杨辉三角
 * @Auther: Lyh
 * @Date: 2022/6/30 16:59
 * @Version: v1.0
 */
public class p118_杨辉三角 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList();
        List<Integer> prev = new ArrayList();
        for(int i = 1; i <= numRows; i++){
            List<Integer> row = new ArrayList(i);
            if(i == 1){
                row.add(1);
            } else if(i == 2){
                row.add(1);
                row.add(1);
            } else{
                row.add(1);
                for(int j = 1;j <= i-2;j++){
                    row.add(prev.get(j-1) + prev.get(j));
                }
                row.add(1);
            }
            prev = row;
            res.add(row);
        }
        return res;
    }
}
