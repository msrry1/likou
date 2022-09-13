package com.algorithm.likou.p201_p300;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName:p241_为运算表达式设计优先级
 * @Auther: Lyh
 * @Date: 2022/9/13 11:42
 * @Version: v1.0
 */
public class p241_为运算表达式设计优先级 {
    char[] cs;
    public List<Integer> diffWaysToCompute(String s) {
        cs = s.toCharArray();
        return dfs(0, cs.length - 1);
    }
    List<Integer> dfs(int l, int r) {
        List<Integer> ans = new ArrayList<>();
        for (int i = l; i <= r; i++) {
            if (cs[i] >= '0' && cs[i] <= '9') continue;
            List<Integer> l1 = dfs(l, i - 1), l2 = dfs(i + 1, r);
            for (int a : l1) {
                for (int b : l2) {
                    int cur = 0;
                    if (cs[i] == '+') cur = a + b;
                    else if (cs[i] == '-') cur = a - b;
                    else cur = a * b;
                    ans.add(cur);
                }
            }
        }
        if (ans.isEmpty()) {
            int cur = 0;
            for (int i = l; i <= r; i++) cur = cur * 10 + (cs[i] - '0');
            ans.add(cur);
        }
        return ans;
    }


/*dp
        public List<Integer> diffWaysToCompute(String expression) {
        List<Object> ops = new ArrayList<>();
        //将字符串分割为digit、op、digit、op、digit......这样的序列
        for (int i = 0; i < expression.length(); ) {
            if (!Character.isDigit(expression.charAt(i))) {
                //添加操作符
                ops.add(expression.charAt(i));
                i++;
            } else {
                //添加数字
                int digit = 0;
                while (i < expression.length() && Character.isDigit(expression.charAt(i))) {
                    digit = digit * 10 + expression.charAt(i) - '0';
                    i++;
                }
                ops.add(digit);
            }
        }
        //dp[i][j]表示从i到j子问题（子表达式）的所有答案
        List<Integer>[][] dp = new List[ops.size()][ops.size()];
        for (int i = 0; i < ops.size(); i++) {
            for (int j = 0; j < ops.size(); j++) {
                dp[i][j] = new ArrayList<>();
            }
        }
        //初始时，所有的digit都是自己本身并且数字都是隔着存放的，并且位置固定在偶数位(0,2,4...) 所以+2
        //eg：digit、op、digit、op、digit......
        for (int i = 0; i < ops.size(); i += 2) {
            dp[i][i].add((int) ops.get(i));
        }
        //从长度为3的子问题开始计算
        for (int len = 3; len <= ops.size(); len += 2) {
            //左边界从0开始
            for (int left = 0; left + len <= ops.size(); left += 2) {
                //右边界
                int right = left + len - 1;
                //按照op进行分割左右两个子表达式 +2表示下一个op
                for (int k = left + 1; k < right; k += 2) {
                    List<Integer> leftAns = dp[left][k - 1];
                    List<Integer> rightAns = dp[k + 1][right];
                    //对左右两个子表达式的结果集进行合并处理
                    for (int num1 : leftAns) {
                        for (int num2 : rightAns) {
                            char op = (char) ops.get(k);
                            if (op == '+') {
                                dp[left][right].add(num1 + num2);
                            } else if (op == '-') {
                                dp[left][right].add(num1 - num2);
                            } else if (op == '*') {
                                dp[left][right].add(num1 * num2);
                            }
                        }
                    }
                }
            }
        }
        return dp[0][ops.size() - 1];
    }
*/
}
