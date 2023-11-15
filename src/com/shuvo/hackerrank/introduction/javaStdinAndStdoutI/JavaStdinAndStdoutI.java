package com.shuvo.hackerrank.introduction.javaStdinAndStdoutI;

import java.util.Scanner;

public class JavaStdinAndStdoutI {
    public static void main(String[] args) {
        Scanner inputNum = new Scanner(System.in);
        int a = inputNum.nextInt();
        int b = inputNum.nextInt();
        int c = inputNum.nextInt();
        inputNum.close();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

    }
}
