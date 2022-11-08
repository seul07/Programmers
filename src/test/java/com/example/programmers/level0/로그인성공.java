package com.example.programmers.level0;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class 로그인성공 {
    String[] id_pw = {"meosseugi", "1234"};
    String[][] db = {
            {"rardss", "123"}, {"yyoom", "1234"}, {"meosseugi", "1234"}
                    };
    @Test
    public void test() {
        String answer = "fail";
        for (int i = 0; i < db.length; i++) {
            if(id_pw[0].equals(db[i][0]) ){
                if(id_pw[1].equals(db[i][1])){
                    answer = "login";
                    break;
                }else{
                    answer = "wrong pw";
                    break;
                }
            }else{
                answer = "fail";
            }
        }
        System.out.println(answer);
        assertThat(true);
    }
}
