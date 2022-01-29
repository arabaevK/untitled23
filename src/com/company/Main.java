package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        System.out.println(generateRanodmAge());
        System.out.println(rec(generateRanodmAge(), 24));
        System.out.println("-------------------------");
        System.out.println(rec(generateRanodmAge(), 30));
        System.out.println("-------------------------");

        System.out.println(rec(generateRanodmAge(), 40));
        System.out.println("-------------------------");

        System.out.println(rec(generateRanodmAge(), 15));
        System.out.println("-------------------------");

        System.out.println(rec(generateRanodmAge(), 50));


    }

    public static String rec(int temperature, int age) {
        String toy = "Можно идти гулять";
        String toy1 = "нельзя идти гулять";
        if (age >= 20 && age <= 45 && temperature >= -20 && temperature <= 30) {
            return toy;
        } else if (age < 20 && temperature >= 0 && temperature <= 28) {
            return toy;

        } else if (age > 45 && temperature > -10 && temperature <= 35) {
            return toy;

        } else {
            System.out.println(toy1);

        }
        return toy1;
    }

    public static int generateRanodmAge(){
        Random random = new Random();
        int randomNum = random.nextInt(100);
        return randomNum;
    }
}
