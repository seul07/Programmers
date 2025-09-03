package com.example.programmers._2023.level0;

import static org.assertj.core.api.Assertions.assertThat;
/**
 * Math.sqrt() : 제곱근(루트) 함수
 *  => double 로 리턴
 *  => 리턴되는 값이 정수(int) 여야 제곱근이 해당된다.
 *  => n 값의 제곱근을 double 형으로 반환. 단, 음수 사용시 NaN 출력
 * Math.pow(double a,double b) : 제곱함수
 *  => power : 거듭제곱
 *  => a 의 b 제곱 리턴 (double 형)
 *
 *  n.intValue()  => n 값을 int 값으로 변환
 *  => sqrt 리턴값이 양의 정수인지 확인 하면 됨
 *
 *         int answer = 2;
 *         Double root = Math.sqrt(n);
 *         System.out.println(root);
 *         if(root==root.intValue()){
 *             answer = 1;
 *         }
 *
 *
 * */
public class TestClass {
    int n = 144;
//    @Test
//    public void test() {
//        List<Integer> list = new ArrayList<>();
//        if(n!=0){
//
//            for (int i = 1; i <= n; i++) {
//                if(n%i==0){
//                    list.add(i);
//                }
//            }
//        }
//
//        Collections.sort(list);
//
//        int[] answer = list.stream().mapToInt(i->i).toArray();
//        assertThat(true);
//    }

    public static void main(String[] args) {
         int n = 144;
         int answer = 2;
         Double root = Math.sqrt(n);
         System.out.println(root);
         if(root==root.intValue()){
             answer = 1;
         }
    }


}
