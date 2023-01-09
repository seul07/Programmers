package com.example.programmers.level1;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.assertj.core.api.Assertions.assertThat;

public class 체육복 {
    int n = 7;
//    int[] lost= {1,2,4,5};
    int[] lost= {2,4,7};
//    int[] reserve = {2,3,4};
    int[] reserve = {1,3,5};


    @Test
    public void test() {
        Arrays.sort(lost);
        Arrays.sort(reserve);
        List<Integer> lostList = new ArrayList<>();
        List<Integer> reserveList = new ArrayList<>();
        for (int i = 0; i <lost.length ; i++) {
            lostList.add(lost[i]);
        }
        for (int i = 0; i <reserve.length ; i++) {
            reserveList.add(reserve[i]);
        }
        int cnt = 0;
        for (int i = 0; i < lostList.size(); i++) {
            for (int j = 0; j < reserveList.size(); j++) {
                if((lostList.get(i)!=0 && reserveList.get(j)!=0) && lostList.get(i)==reserveList.get(j)){
                    lostList.set(i,0);
                    reserveList.set(j,0);
                    cnt++;
                }
            }
        }

        for (int i = 0; i < lostList.size(); i++) {
            for (int j = 0; j < reserveList.size(); j++) {
                if((lostList.get(i)!=0 && reserveList.get(j)!=0) && (lostList.get(i)-1)==reserveList.get(j) || (lostList.get(i)+1)==reserveList.get(j)){
                    lostList.set(i,0);
                    reserveList.set(j,0);
                    cnt++;
                    break;
                }
            }
        }

        int answer = n-lost.length+cnt;
        assertThat(answer).isEqualTo(6);
    }

}
