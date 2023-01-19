package com.epam.rd.autotasks.meetautocode;

import java.util.Scanner;

public class ElectronicWatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int seconds = scanner.nextInt();
        int hours=seconds/3600;
        int min=(seconds%3600)/60;
        int sec=seconds%60;
        if(hours==24){
            hours=0;
        }
        if(hours>24){
            hours=hours%24;
        }
        System.out.println(hours +":"+ min +":" +sec);

    }
}
