package ru.mirea.lab3_5;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Report rep = new Report();
        int choise = 0;
        System.out.println("??????? ??????????? ?? ?????? ??????: ");
        rep.setSize(sc.nextInt());

        do
        {
            System.out.println("1)???????? ??????????");
            System.out.println("2)??????? ?????????? ? ???????? ???? ???????????");
            choise = sc.nextInt();
            switch (choise) {
                case 1:
                    rep.addPerson();
                    break;
                case 2:
                    for (int i = 0; i < rep.getSize(); i++) {
                        System.out.println(rep.generateReport(i));
                    }
                    break;
                default:
                    break;

            }
        } while (choise != 0);
    }


}

