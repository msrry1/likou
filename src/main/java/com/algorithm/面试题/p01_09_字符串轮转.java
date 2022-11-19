package com.algorithm.面试题;

/**
 * @ClassName:p01_09_字符串轮转
 * @Auther: Lyh
 * @Date: 2022/9/29 10:55
 * @Version: v1.0
 */
public class p01_09_字符串轮转 {
    //字符串轮转。给定两个字符串s1和s2，请编写代码检查s2是否为s1旋转而成（比如，waterbottle是erbottlewat旋转后的字符串）。
//    public static boolean isFlipedString(String s1, String s2) {
//        StringBuilder s11 = new StringBuilder();
//        int n1 = s1.length();
//        int n2 = s2.length();
//        if(n2 != n1){
//            return false;
//        }
//        for(int i = 0;i < n1;i++){
//            s11 = new StringBuilder();
//            if(s1.charAt(i) == s2.charAt(0)){
//                s11.append(s1.substring(i, n1)).append(s1.substring(0,i));
//                if(s2.equals(s11.toString())){
//                    return true;
//                }
//            }
//        }
//        return false;
//    }
//
//    public static void main(String[] args) {
//        System.out.println(isFlipedString("waterbottle", "erbottlewat"));
//    }
    public boolean isFlipedString(String s1, String s2) {
        return s1.length() == s2.length() && (s1 + s1).contains(s2);
    }
}
