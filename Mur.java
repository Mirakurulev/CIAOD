package com.company;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.Scanner;

public class Mur {
    PrintWriter out;

    static void find() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите начальную строку");
        String source = in.nextLine();
        System.out.println("Введите подстроку для поиска");
        String template = in.nextLine();
        int sourceLen = source.length();
        int templateLen = template.length();
        TreeMap<Character, Integer> offsetTable = new TreeMap<Character, Integer>();
        for (int i = 0; i <= 255; i++) {
            offsetTable.put((char) i, templateLen);
        }
        for (int i = 0; i < templateLen - 1; i++) {
            offsetTable.put(template.charAt(i), templateLen - i - 1);
            System.out.println(template.charAt(i) + "->" + (templateLen - i - 1));
        }
        int i = templateLen - 1;
        int j = i;
        int k = i;
        while (j >= 0 && i <= sourceLen - 1) {
            j = templateLen - 1;
            k = i;
            while (j >= 0 && source.charAt(k) == template.charAt(j)) {
                k -= 1;
                j -= 1;
            }
            i += offsetTable.get(source.charAt(i));
        }
        if (k >= sourceLen - templateLen) {
            System.out.println("Не найдено");
        } else {
            System.out.println("Позиция первого вхождения - " + (k + 1));
        }
    }

    void run() {
        Scanner in = new Scanner(System.in);
        out = new PrintWriter(System.out, true);
        try {
            find();
        } finally {
            out.close();
        }
    }

    public static void main(String args[]) {
        new Mur().run();
    }
}
