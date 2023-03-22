package com.example.programmers.level1;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;

public class 시저암호 {
    String sAlpha = "abcdefghijklmnopqrstuvwxyz";
    String bAlpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    String s = "a B z";
    int n = 4;
    @Test
    public void test() {

        String[] arr = s.split("");
        for (int i = 0; i < arr.length; i++) {
            char tmp = arr[i].charAt(0);
            if(Character.isUpperCase(tmp)){
                for (int j = 0; j < bAlpha.length(); j++) {
                    if(tmp==bAlpha.charAt(j)){
                        int cnt = 0;
                        if(j+n>=bAlpha.length()){
                            cnt = Math.abs(bAlpha.length()-(j+n));
                        }else{
                            cnt = j+n;
                        }
                        arr[i] = bAlpha.charAt(cnt)+"";
                        break;
                    }
                }
            }else if(Character.isLowerCase(tmp)){
                for (int j = 0; j < sAlpha.length(); j++) {
                    if(tmp==sAlpha.charAt(j)){
                        int cnt = 0;
                        if(j+n>=sAlpha.length()){
                            cnt = Math.abs(sAlpha.length()-(j+n));
                        }else{
                            cnt = j+n;
                        }
                        arr[i] = sAlpha.charAt(cnt)+"";
                        break;
                    }
                }
            }
        }

        String result = Arrays.stream(arr).collect(Collectors.joining());

        assertThat(result).isEqualTo("e F d");
    }
}
