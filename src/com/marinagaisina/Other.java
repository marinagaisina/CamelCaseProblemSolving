package com.marinagaisina;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.*;
public class Other {

    //assemble the input using string function using one string variable
//after the loop do the system out
//create a string at the top and set it to empty
//then append it to the variable
    public static void main(String[] args) throws IOException {
        //String m = "camelCase looksLikeThis";
        String w;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter input: ");
        String s = br.readLine();
        s= s.substring(0,1).toUpperCase()+s.substring(1,s.length()).trim();
        w = s.substring(0);
        System.out.println(w);
    }
    }

