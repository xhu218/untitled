package com.company;

import org.junit.Test;

public class ComTest6 {
    @Test
    public void Test1() {
        int a = 2;
        int n = 5;

        int s = 0, t = 0;
        for (int i = 1; i <= n; i++) {

            t += a;
            a = a * 10;

            s += t;
        }

        System.out.println(s);
    }

    @Test
    public void Test2() {
        long sum = 0;
        long fac = 1;

        for (int i = 1; i <= 20; i++) {
            fac = fac * i;
            System.out.println(" " + fac);
            sum += fac;
        }
        System.out.println("sum = " + sum);
        System.out.println("max = " + Long.MAX_VALUE);
    }

    @Test
    public void Test3() {

        int index = 0;

        int num1 = 2;
        int num2 = 1;
        float num3 = 1.0f;
        while (index++ <= 3) {
            float num4 = num1 / num2;
            num3 += num4;
            System.out.println(num4 + "=" + num1 + "/" + num2);
            int temp = num1;
            num1 = num1 + num2;
            num2 = temp;

        }
        System.out.println(num3);

    }

    @Test
    public void Test4() {
        double s = 0;

        double h = 100;

        for (int i = 1; i <= 10; i++) {
            s += h;
            h = h / 2;
            s += h;
        }

        System.out.println("经过路程：" + s);
        System.out.println("反弹高度：" + h);

    }


    @Test
    public  void Test5(){

    }


}