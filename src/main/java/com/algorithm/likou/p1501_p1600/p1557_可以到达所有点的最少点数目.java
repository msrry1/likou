package com.algorithm.likou.p1501_p1600;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @ClassName:p1557_可以到达所有点的最少点数目
 * @Auther: Lyh
 * @Date: 2022/7/29 14:33
 * @Version: v1.0
 */
public class p1557_可以到达所有点的最少点数目 {
    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
        List<Integer> ans = new ArrayList<Integer>();
        Set<Integer> endSet = new HashSet<Integer>();
        for (List<Integer> edge : edges) {
            endSet.add(edge.get(1));
        }
        for (int i = 0; i < n; i++) {
            if (!endSet.contains(i)) {
                ans.add(i);
            }
        }
        return ans;
    }
}
