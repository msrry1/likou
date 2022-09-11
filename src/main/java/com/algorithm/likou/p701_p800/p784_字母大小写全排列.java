package com.algorithm.likou.p701_p800;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName:p784_字母大小写全排列
 * @Auther: Lyh
 * @Date: 2022/7/9 16:14
 * @Version: v1.0
 */
public class p784_字母大小写全排列 {
    public List<String> letterCasePermutation(String S) {
        List<String> res = new ArrayList<>();
        char[] charArray = S.toCharArray();
        dfs(charArray, 0, res);
        return res;
    }

    private void dfs(char[] charArray, int index, List<String> res) {
        if (index == charArray.length) {
            res.add(new String(charArray));
            return;
        }

        dfs(charArray, index + 1, res);
        if (Character.isLetter(charArray[index])) {
            //大小写互相转换
            charArray[index] ^= 1 << 5;
            dfs(charArray, index + 1, res);
        }
    }
}
