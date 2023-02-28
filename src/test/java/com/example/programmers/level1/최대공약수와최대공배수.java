package com.example.programmers.level1;

import org.junit.jupiter.api.Test;

import javax.swing.plaf.metal.MetalIconFactory;

import static org.assertj.core.api.Assertions.assertThat;

public class 최대공약수와최대공배수 {
    int n = 3;
    int m = 12;
    @Test
    public void test() {
        int[] arr = new int[2];
        int gcd = 0;
        for (int i = 1; i <= n; i++) {
            if(n%i ==0 && m%i ==0){
                gcd = i;
            }
        }
        arr[0] = gcd;
        arr[1] = (n*m)/gcd;
        assertThat(true);
    }
}
