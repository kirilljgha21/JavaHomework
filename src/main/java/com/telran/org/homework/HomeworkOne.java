package com.telran.org.homework;

public class HomeworkOne {
    public static void main(String[] args) {
        // Nr.1
        char a = 'G';
        int b = 89;
        byte c = 4;
        short d = 56;
        float e = 4.7333436f;
        double f = 4.355453532;
        long g = 12121;

        System.out.println("char: " + a + "\ninteger: " + b + "\nbyte: " + c + "\nshort: " + d + "\nfloat: " + e + "\ndouble: " + f + "\nlong: " + g);

        // Nr.2
        String count = "345";
        System.out.println("Число " + count + " -> " + count.substring(0,1) + ", " + count.substring(1,2) + ", " + count.substring(2));
    }
}
