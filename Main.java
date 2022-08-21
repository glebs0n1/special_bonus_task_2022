package com.company;
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        final int MAX_NUMBER = 10;
        try {
            BufferedReader bf = new BufferedReader(new FileReader("input.txt"));
            String line = null;
            while ((line = bf.readLine()) != null) {
                int[] intFromString = getFromString(line);
                for (int num : intFromString) {
                    if (num >=MAX_NUMBER)
                        System.out.println(line);
               }
            }
            bf.close();
        } catch (IOException e) {
       }
    }
    private static int[] getFromString(String text) {
        String onlyNumbers = text.replaceAll("[^0-9]", " ");
        onlyNumbers = onlyNumbers.replaceAll(" +", " ").trim();
        int[] numbers = new int[1];
        if (!onlyNumbers.isEmpty())
            numbers = Arrays.stream(onlyNumbers.split(" ")).mapToInt(Integer::parseInt).toArray();
        return numbers;
    }
}
