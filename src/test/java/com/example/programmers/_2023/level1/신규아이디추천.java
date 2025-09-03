package com.example.programmers._2023.level1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class 신규아이디추천 {
//    String new_id = "abcdefghijklmn.p";
//    String new_id = "123_.def";
//    String new_id = "=.=";
//    String new_id = "z-+.^.";
    String new_id = "...!@BaT#*..y.abcdefghijklm";
    @DisplayName("신규아이디추천")
    @Test
    public void test() {
        //1 대문자 -> 소문자
        new_id = new_id.toLowerCase();
        //2 - _ . 제외한 모든 문자 제외
        String match = "[^a-z0-9-_.]";
        new_id = new_id.replaceAll(match,"");
        //3 마침표 2개 => 1개로 치환
        while(new_id.contains("..")){
            new_id = new_id.replaceAll("\\.\\.","\\.");
        }
        //4 마침표로 시작 또는 끝에 있으면 제거
        if(new_id.startsWith(".")){
            new_id = new_id.substring(1,new_id.length());
        }
        if(new_id.length()>1 && new_id.charAt(new_id.length()-1)=='.'){
            new_id = new_id.substring(0,new_id.length()-1);
        }
        //5 빈 문자열이면 a
        if(new_id==null || "".equals(new_id)){
            new_id = "a";
        }
        //6
        if(new_id.length()>=16){
            new_id = new_id.substring(0,15);
            if(new_id.charAt(new_id.length()-1)=='.'){
                new_id=new_id.substring(0,14);
            }
        }
        //7
        if(new_id.length()<=2){
            String t = new_id.charAt(new_id.length()-1)+"";
            while(new_id.length()<=2){
                new_id+=t;
            }
        }
        System.out.println(new_id);
        assertThat(true);
    }
}
