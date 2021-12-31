package com.marinagaisina;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String str ="";
        String line;
        boolean camelCase =false;
        while ((line = input.readLine()) != null) {
            if ((line.length() != 0) && (!camelCase)) {
                str += line.toLowerCase();
                camelCase = true;
            } else if (line.length() != 0) {
                String firstLetter = line.substring(0, 1).toUpperCase();
                String rest = line.substring(1).toLowerCase();
                str += firstLetter+rest;
                camelCase = true;
            } else {
                str += " ";
                camelCase = false;
            }
        }
        System.out.println(str);
    }
}
