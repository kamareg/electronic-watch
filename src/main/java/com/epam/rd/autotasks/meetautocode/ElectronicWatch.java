package com.epam.rd.autotasks.meetautocode;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ElectronicWatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int seconds = scanner.nextInt();

        DecimalFormat decimalFormat = new DecimalFormat("00");


        int s = 00;
        int m = 00;
        int h = 00;
        int x;

        if (seconds > 86400) {
            seconds -= 86400;
        }
        if (seconds < 86400) {

            if (seconds <= 86399 && seconds >= 3600) {
                h = seconds / 3600;
                x = h * 3600;
                seconds -= x;

            }
            if (seconds <= 3599 && seconds >= 60) {
                m = seconds / 60;
                x = m * 60;
                seconds -= x;
            }
            if (seconds <= 59 && seconds >= 0) {
                s = seconds;
            }

        } else if (seconds == 86400) {
        }
        String ss = decimalFormat.format(s);
        String mm = decimalFormat.format(m);
        System.out.println(h + ":" + mm + ":" + ss);


    }
}
