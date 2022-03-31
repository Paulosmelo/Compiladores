package com.company;

import java.util.ArrayList;
import java.util.Stack;

public class RpnStack {

    public int run(ArrayList<String> tokens){
        Stack<Integer> pilha = new Stack<>();
        for(String token : tokens) {
            try{
                pilha.push(Integer.parseInt(token));
            }catch (NumberFormatException e){
                int x = 0, y = 0;

                y = pilha.pop();
                x = pilha.pop();

                if(token.equals("+")) {
                    pilha.push(x+y);
                }else if(token.equals("-")) {
                    pilha.push(x-y);
                }else if(token.equals("*")) {
                    pilha.push(x*y);
                }else {
                    pilha.push(x/y);
                }
            }
        }
        return pilha.get(0);
    }
}
