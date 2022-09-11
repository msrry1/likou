package com.algorithm.likou.p1801_p1900;

/**
 * @ClassName:p1823_找出游戏的获胜者
 * @Auther: Lyh
 * @Date: 2022/7/24 15:07
 * @Version: v1.0
 */
public class p1823_找出游戏的获胜者 {
    public int findTheWinner(int n, int k) {
        int winner = 1;
        for (int i = 2; i <= n; i++) {
            winner = (k + winner - 1) % i + 1;
        }
        return winner;
    }
}
