package morsning;

import java.util.Scanner;

public class MorsningMain {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Morsning mors = new Morsning();

        String wordis;
        int number = 0;


        System.out.println("Hello and welcome! Please press '1' to continue: ");

        while (true) {
            number = Integer.parseInt(scan.nextLine());

            if (number != 1) {
                System.out.println("Invalid number! PLease click number 1 to continue: ");

            } else {
                System.out.println("Write what you want to translate - in english or morse code: ");
                System.out.println("(If you are done, you can just write 'stop')");


                while (true) {
                    wordis = scan.nextLine();

                    if (wordis.equals("stop")) {
                        System.out.println("Thank you for your time. Bye!");
                        break;
                    }
                    mors.setText(wordis);
                }


            }
        }
    }
}



