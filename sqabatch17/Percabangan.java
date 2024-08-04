package com.juaracoding;

import java.util.Scanner;

public class Percabangan {

    public static void main(String[] args) {

        if(false){
            System.out.println("Statement");
        }

        System.out.println("Next Statement");

        // program ganjil genap (if else)
        int platNomor = 1234;
        if(platNomor % 2 == 0){ // 0 == 0 (false)
            System.out.println("Plat Nomor Genap");
        } else {
            System.out.println("Plat Nomor Ganjil");
        }

        // if majemuk
        // size, price
        String size = "L";
        int price = 0; // assignment value
        if(size == "S"){
            price = 40000;
        } else if (size == "M") {
            price = 50000;
        } else if(size == "L") {
            price = 60000;
        }
        System.out.println("Size: "+size+" Price: "+price);

        // login username password, String Object
        String username = "Admin";
        String password = "p4ssw0rd";
        if(username.equalsIgnoreCase("admin") && password.equals("p4ssw0rd")) { // true AND true
            System.out.println("Login Berhasil");
        } else {
            System.out.println("Login Gagal");
        }

        // nested if
        Scanner input = new Scanner(System.in);
        System.out.println("Total Amount: ");
        int totalAmount = input.nextInt();
        System.out.println("Total Amount: "+totalAmount);
        float discount = 0.0f;
        boolean isMember = false;
        boolean isFirstTimeBuyer = true;
        boolean hasCoupon = false;
        if(totalAmount > 500000){
            if(isMember){
                discount = 0.1f; // 10%
            } else if (isFirstTimeBuyer) {
                discount = 0.05f; // 5%
            } else if (hasCoupon) {
                discount = 0.02f; // 2%
            }
        } else {
            System.out.println("Belum dapat discount");
        }

        System.out.println("Discount: "+discount);
        System.out.println("Total Payment: "+(totalAmount-totalAmount*discount));

        // switch case
        // 1. Tampilkan data produk
        // 2. Input data produk
        System.out.println("Masukan menu 1-5: ");
        int menu = input.nextInt();
        switch (menu){
            case 1:
                System.out.println("1. Tampilkan data produk");
                break;
            case 2:
                System.out.println("2. Input data produk");
                break;
            default:
                System.out.println("Invalid input menu");
        }


        // operator ternary
        int stock = 1;
        String output = stock > 0 ? "Stok tersedia" : "Stok habis";
        System.out.println(output);
    }
}
