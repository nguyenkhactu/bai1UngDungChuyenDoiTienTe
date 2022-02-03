package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int check =0;
        do {
            currencyConversion();
        }while (check!=-1);

    }

    private static void currencyConversion() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập 1 để chọn chuyển tiền VND sang đô la");
        System.out.println("nhập 2 để chọn chuyển tiền đô la sang VND");
        System.out.println("nhập lựa chọn");
        int number = scanner.nextInt();

        switch (number){
            case 1:
                System.out.println("nhập số tiền VND");
                int priceVND = scanner.nextInt();
                int priceUsd = priceVND/23000;
                System.out.println(priceVND + "VND" + "=" + priceUsd + "USD");

                break;
            case 2:
                System.out.println("nhập số tiền USD");
                int priceUSD = scanner.nextInt();
                int priceVnd = priceUSD * 23000;
                System.out.println(priceUSD + "USD" + "=" + priceVnd + "VND");
                break;
        }
    }
}

