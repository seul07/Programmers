package com.example.programmers._2023.level0;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class GetString {
    String my_string = "bus";
    @Test
    public void test() {
        String answer= "";
        for (int i = 0; i < my_string.length(); i++) {
            if(my_string.charAt(i) !='a' && my_string.charAt(i)!='e'&&
                    my_string.charAt(i)!='i'&&
                    my_string.charAt(i)!='o'&&
                    my_string.charAt(i)!='u'){
                answer += my_string.charAt(i);
            }
        }
        assertThat(answer).isEqualTo("bs");
    }
}
