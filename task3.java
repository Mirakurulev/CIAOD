package com.company;

import java.util.Deque;
import java.util.Stack;

public class task3 {


    public task3(int topN, char from,
                 char inter, char to) {
        if (topN == 1) {
            System.out.println("Disk 1 from "
                    + from + " to " + to);
        } else {
            new task3(topN - 1, from, to, inter);
            System.out.println("Disk "
                    + topN + " from " + from + " to " + to);
            new task3(topN - 1, inter, from, to);
        }
    }
}
