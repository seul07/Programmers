package com.example.programmers._2025.level0;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class 물부족 {
    int storage = 1000;
    int usage = 2000;
    int[] change = {-10, 25, -33};
    @Test
    public void test() {

        int result = result(storage,usage,change);

        System.out.println(result);
    }

    private int result(int storage, int usage, int[] change) {
        int total_usage = 0;
        for(int i=0; i<change.length; i++){
            usage += usage * change[i] / 100;
            total_usage += usage;
            if(total_usage > storage){
                return i;
            }
        }
        return -1;
    }

}
