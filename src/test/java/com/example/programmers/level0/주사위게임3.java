package com.example.programmers.level0;

import org.junit.jupiter.api.Test;

import java.util.*;


public class 주사위게임3 {
    int a = 1;
    int b = 2;
    int c = 4;
    int d = 3;
    @Test
    public void test() {
        int answer = 0;
        Map<Integer,Integer> map = new HashMap<>();
        map.put(a,0);
        map.put(b,0);
        map.put(c,0);
        map.put(d,0);
        map.put(a,map.get(a)+1);
        map.put(b,map.get(b)+1);
        map.put(c,map.get(c)+1);
        map.put(d,map.get(d)+1);
        if(map.size()==1){
            answer = 1111*a;
        }else if(map.size()==2){
            boolean result = false;
            int p = 0;
            int q = 0;
            List<Integer> value = new ArrayList<>(map.values());
            if(value.get(0)==value.get(1)){
                List<Integer> key = new ArrayList<>(map.keySet());
                p = key.get(0);
                q = key.get(1);
                answer = (p+q)*(Math.abs(p - q));
            }else{
                for(Map.Entry<Integer, Integer> m : map.entrySet()) {
                    if(m.getValue()==3){
                        p = m.getKey();
                    }else{
                        q = m.getKey();
                    }
                }
                answer = (10*p+q)*(10*p+q);
            }
        }else if(map.size()==3){
            int p = 0;
            int q = 0;
            int r = 0;
            for(Map.Entry<Integer, Integer> m : map.entrySet()) {
                if(m.getValue()==2){
                    map.remove(m.getKey());
                    break;
                }
            }
            List<Integer> key = new ArrayList<>(map.keySet());
            q = key.get(0);
            r = key.get(1);
            answer = q*r;
        }else{
            int tmp = Math.min(a,b);
            tmp = Math.min(tmp,c);
            tmp = Math.min(tmp,d);
            answer = tmp;
        }
        System.out.println(answer);
    }
}

