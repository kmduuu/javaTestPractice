package com.java.practice.reverseWord;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {

    public ArrayList<String> solution(int number, ArrayList<String> words) {
        ArrayList<String> strList = new ArrayList<>();
        String message = "";
        
        if (number >= 3 && number <= 20) {
            for (int i = 0; i < number; i++) {
                message = "";
                for (int j = words.get(i).length() - 1; j >= 0; j--) {
                    message += words.get(i).charAt(j);
                }
                strList.add(message);
            }
        }
        return strList;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Main ma = new Main();

        int input1 = Integer.parseInt(br.readLine());

        ArrayList<String> words = new ArrayList<>();
        for (int i = 0; i < input1; i++) {
            words.add(br.readLine());
        }

        ArrayList<String> resultList = ma.solution(input1, words);

        for (String result : resultList) {
            System.out.println(result);
        }
    }
}