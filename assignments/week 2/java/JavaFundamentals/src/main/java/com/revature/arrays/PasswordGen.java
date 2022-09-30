package com.revature.arrays;

import java.util.Random;

public class PasswordGen {
    public static void main(String[] args) {
        String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lower = "abcdefghijklmnopqrstuvwxyz";
        String num = "0123456789";
        String specialChar = "!@#$%^&*";
        String combo = upper + lower + specialChar + num;
        int len = 8;
        char[] password = new char[len];
        Random r = new Random();

        for ( int i = 0; i < len; i++) {
            password[i] = combo.charAt(r.nextInt(combo.length()));
        }
        System.out.println("New Password: " + new String(password));
    }
}
