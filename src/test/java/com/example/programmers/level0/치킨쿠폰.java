package com.example.programmers.level0;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class 치킨쿠폰 {
    int chicken = 1081;
    @Test
    public void test() {
        int coupon = chicken;
        int service = 0;
        while(coupon>=10){
            service += coupon/10;
            coupon = coupon/10+coupon%10;
        }
        assertThat(true);
    }
}
