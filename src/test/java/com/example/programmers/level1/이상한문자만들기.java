package com.example.programmers.level1;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.linesOf;
//단어 사이 공백이 여러개
//문자의 시작과 끝에 공백
//단어에 대문자가 섞여있는 경우 위 세가지 고려해서 테스트 해보시면 될거 같습니다.
//"  tRy hello  WORLD    " 로 넣어서 테스트 해보시면 될거같습니다.
public class 이상한문자만들기 {
//    String s = "  tRy hello  WORLD    ";
    String s = "  try hello world";
    @Test
    public void test() {
        String[] arr = s.split(" ",-1);
        String answer = "";
        for (int i = 0; i < arr.length ; i++) {
            String[] tmp = arr[i].split("");
            for (int j = 0; j < tmp.length; j++) {
                if(j%2==0){
                    tmp[j] = tmp[j].toUpperCase();
                }else{
                    tmp[j] = tmp[j].toLowerCase();
                }
            }
            String str = String.join("",tmp);
            answer += str+" ";
        }
        answer = answer.substring(0, answer.length()-1);
        System.out.println(answer);
        assertThat(true);
    }
}
