package com.example.programmers;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
// 브루트 포스 알고리즘 ( 완전탐색 )
// or 백트래킹  ( 현재 상태에서 가능한 후보군으로 가지를 치며 탐색 )
public class 생일예측 {
    int[] card = {1,2,3,4,5,6};
    @Test
    public void test() {
        int x = 0;
        int y = 0;

        int[] A = {};
        int[] B = {};

        assertThat(true);
    }
}


//    private void findDanbiBirth() {
//        dfs(1, new ArrayList<>());
//    }
//
//    private void dfs(int num, List<Integer> dummy1) {
//        if (6 < num)
//            return;
//        dfs(num + 1, dummy1);
//
//        dummy1.add(num);
//        int x = dummy1.stream().mapToInt(Integer::intValue).sum();
//        Set<Integer> dummy2 = new HashSet<>(Set.of(1, 2, 3, 4, 5, 6));
//        dummy2.removeAll(dummy1);
//        int dummy2Mul = 1;
//        int dummy2Sum = 0;
//        for (Integer i : dummy2) {
//            dummy2Mul *= i;
//            dummy2Sum += i;
//        }
//        if (x * x == dummy2Mul * 2 + 1) {
//            System.out.println("생일은 " + x + "월 " + dummy2Sum + "일 입니다.");
//        }
//
//        dfs(num + 1, dummy1);
//        dummy1.remove(dummy1.size() - 1);
//    }
