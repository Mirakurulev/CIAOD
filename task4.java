package com.company;

import java.util.Deque;
import java.util.Stack;

public class task4 {
    public task4(String str) {
        Stack stc = new Stack();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='(')
                stc.push(str.charAt(i));
            else if(str.charAt(i)==')')
                stc.pop();
        }
        if(stc.empty())
            System.out.println("Task4: true");
        else
            System.out.println("Task4: false");
    }
}
