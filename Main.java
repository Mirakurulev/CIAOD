package com.company;


import javax.script.ScriptException;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) throws ScriptException {
        //task1
        String str1="Aff Cfs Bwq De Dgjg SD ";
        new task1(str1);
        System.out.println();

        //task2
        String str = "12191(45197689)";
        Deque dec = new LinkedList();
        dec.addLast('1');
        dec.addLast('2');
        dec.addLast('т');
        dec.addLast('у');
        dec.addLast('9');
        dec.addLast('(');
        dec.addLast(' ');
        dec.addLast('е');
        dec.addLast('4');
        dec.addLast('5');
        dec.addLast('к');
        dec.addLast('с');
        dec.addLast('6');
        dec.addLast('7');
        dec.addLast('л');
        dec.addLast('д');
        dec.addLast('8');
        dec.addLast(')');
        dec.addLast('я');
        dec.addLast('3');
        new task2(dec, str);
        //task3
        System.out.print("task3: ");
        new task3(4, 'A','B','C');
        //task4
        String str4 = "((((1151()))()))";
        new task4(str4);
        //task 5
        String str5 = "[]";
        new task5(str5);
        //task6
        String str6 = "111qqqwww111--1q-_+";
        new task6(str6);
        System.out.println();
        //task7
        int[] arr7 = {1, -15, 16, 71};
        new task7(arr7);
        System.out.println();
        //task8
        String str8 = "15 q1 1521 qwt";
        new task8(str8);
        System.out.println();
        //task9
        String str9="(F+(T*F+(F+T)))X(NF)";
        new task9(str9);
        //task10
        String str10="N(9,(M(1,N(1,2))))";
        new task10(str10);
        //task11
        String str11="x+(y+z+(z+y))";
        new task11(str11);
    }
}

