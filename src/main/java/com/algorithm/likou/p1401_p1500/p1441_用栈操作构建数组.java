package com.algorithm.likou.p1401_p1500;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName:p1441_用栈操作构建数组
 * @Auther: Lyh
 * @Date: 2022/10/15 16:34
 * @Version: v1.0
 */
public class p1441_用栈操作构建数组 {
    public List<String> buildArray(int[] target, int n) {
        List<String> res = new ArrayList();
        int data = 1;
        for(int i = 0;i < target.length;i++){
            if(target[i] == data){
                res.add("Push");
                data++;
            }else{
                while(data < target[i]){
                    res.add("Push");
                    res.add("Pop");
                    data++;
                }
                res.add("Push");
                data++;
            }
        }
        return res;
    }
}
