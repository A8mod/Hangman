package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HangMan
{
    public static void main(String[] args) {
        System.out.println("enter the secret word");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        StringBuffer word;


        try {
            word = new StringBuffer(br.readLine());
            System.out.println("your word is"+word);

        } catch (IOException e) {
            e.printStackTrace();
        }



    }
}
