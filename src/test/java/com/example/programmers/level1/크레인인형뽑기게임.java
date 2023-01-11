package com.example.programmers.level1;

import org.junit.jupiter.api.Test;

import java.util.Stack;

import static org.assertj.core.api.Assertions.assertThat;

public class 크레인인형뽑기게임 {
    int[][] board = {{0,0,0,0,0},
                    {0,0,1,0,3},
                    {0,2,5,0,1},
                    {4,2,4,4,2},
                    {3,5,1,3,1}};

    int[] moves = {1,5,3,5,1,2,1,4};
    @Test
    public void test() {
        Stack<Integer> stack = new Stack<>();
        int cnt = 0;
        for (int i = 0; i < moves.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if(board[j][moves[i]-1]!=0){
                    if(stack.size()>0 && stack.peek().equals(board[j][moves[i]-1])){
                        stack.pop();
                        cnt+=2;
                    }else{
                        stack.add(board[j][moves[i]-1]);
                    }
                    board[j][moves[i]-1] =0;
                    break;
                }

            }
        }
        System.out.println(cnt);
        assertThat(true);
    }
}
