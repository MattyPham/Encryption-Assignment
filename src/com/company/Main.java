package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Type in a word to encrypt.");
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();
        System.out.println((word.substring(word.length()-2)) +word+ "tysz");



    }
}
