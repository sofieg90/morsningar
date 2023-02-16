package morsning;

import java.util.Scanner;

public class MorsningMain {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String wordis;


        Morsning mors = new Morsning();
        System.out.println("Hello! Please write something and I will translate it:");


            wordis = scan.nextLine();

            mors.setText(wordis);
    }
}
