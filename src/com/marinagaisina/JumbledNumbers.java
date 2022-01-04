package com.marinagaisina;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class JumbledNumbers {
    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
        BufferedReader in = new BufferedReader(reader);
        String line;
        String str ="";
        while ((line = in.readLine()) != null) {
            str += line;
        }
        String[] letterArr = str.split("");
        Set<String> result = new HashSet<>();

        if (str.contains("o") && (str.contains("n") && (str.contains("e")))) {
            str = str.replace("o", "").replace("n", "").replace("e", "");
            result.add("one");
        }
        if (str.contains("t") && (str.contains("w") && (str.contains("o")))) {
            str = str.replace("t", "").replace("w", "").replace("o", "");
            result.add("two");
        }
        if (str.contains("t") && (str.contains("h")) && (str.contains("r")) && (str.contains("e"))) {
            str = str.replace("t", "").replace("h", "").replace("r", "");
            result.add("three");
        }
        if (str.contains("f") && (str.contains("o")) && (str.contains("u")) && (str.contains("r"))) {
            str = str.replace("o", "").replace("n", "").replace("e", "");
            result.add("four");
        }
        if (str.contains("f") && (str.contains("i")) && (str.contains("v")) && (str.contains("e"))) {
            str = str.replace("o", "").replace("n", "").replace("e", "");
            result.add("five");
        }
        if (str.contains("s") && (str.contains("i")) && (str.contains("x"))) {
            str = str.replace("o", "").replace("n", "").replace("e", "");
            result.add("six");
        }
        if (str.contains("s") && (str.contains("e")) && (str.contains("v")) && (str.contains("e")) && (str.contains("n"))) {
            str = str.replace("o", "").replace("n", "").replace("e", "");
            result.add("three");
        }
        Map<String, Integer> map = new HashMap<>();
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        map.put("four", 4);
        map.put("five", 5);
        map.put("six", 6);
        map.put("seven", 7);
        map.put("eight", 8);
        map.put("nine", 9);
        map.put("zero", 0);


    }
}
