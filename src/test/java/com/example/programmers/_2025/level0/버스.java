package com.example.programmers._2025.level0;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class 버스 {
    String[][] passengers = {{"On", "On", "On"},
            {"Off", "On", "-"},
            {"Off", "-", "-"} };
    @Test
    public void test() {
        int seat = passengers[0].length;
        int num_passenger = 0;
        for(int i=0; i<passengers.length; i++){
            num_passenger += func3(passengers[i]);
            num_passenger -= func4(passengers[i]);
        }
        int answer = func1(seat+num_passenger);
        System.out.println(answer);
    }

    public int func1(int num){
        if(0 > num){
            return 0;
        }
        else{
            return num;
        }
    }
    public int func2(int num){
        if(num > 0){
            return 0;
        }
        else{
            return num;
        }
    }

    public int func3(String[] station){
        int num = 0;
        for(int i=0; i<station.length; i++){
            if(station[i].equals("Off")){
                num += 1;
            }
        }
        return num;
    }

    public int func4(String[] station){
        int num = 0;
        for(int i=0; i<station.length; i++){
            if(station[i].equals("On")){
                num += 1;
            }
        }
        return num;
    }

}
