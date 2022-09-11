package com.algorithm.likou.p1_p100;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName:p22_括号生成
 * @Auther: Lyh
 * @Date: 2022/7/21 14:32
 * @Version: v1.0
 */
public class p22_括号生成 {
    List<String> ret = new ArrayList();
    public List<String> generateParenthesis(int n) {
        int left = n;
        int right = n;
        dfs(left, right,new StringBuilder());
        return ret;
    }

    public void dfs(int left, int right, StringBuilder sb){
        if(left == 0 && right == 0){
            ret.add(sb.toString());
            return;
        }
        if(left == right){
            //如果左括号数量等于右括号，只能加左括号
            sb.append("(");
            dfs(left - 1, right, sb);
            sb.deleteCharAt(sb.length() - 1);
        } else if(left < right){
            //左括号少于右括号，都可以加
            if(left > 0){
                sb.append("(");
                dfs(left - 1,right, sb);
                sb.deleteCharAt(sb.length() - 1);
            }
            sb.append(")");
            dfs(left, right - 1,sb);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}
