package com.hillel.shumskyi.lessons.lesson4;

public class Homework5 {
    public static void main(String[] args) {

        int liWarrior = 13;
        int liArcher = 24;
        int liCavalier = 46;
        int eachTypeLi = 860;


        int miWarrior = 9;
        int miArcher = 35;
        int miCavalier = 12;
        double eachTypeMi = 860 * 1.5;


        int l = (liWarrior + liArcher + liCavalier) * eachTypeLi;
        double m = (miWarrior + miArcher + miCavalier) * eachTypeMi;

        System.out.println("Загальний показник атаки династії Лі = " + l);
        System.out.println("Загальний показник атаки династії Мінь = " + (int)m);

    }
}
