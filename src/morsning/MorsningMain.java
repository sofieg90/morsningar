package morsning;

import java.util.Scanner;

public class MorsningMain {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Morsning mors = new Morsning();

        String wordis;
        int number = 0;


            System.out.println("Hello and welcome! Please press '1' to continue: ");
            System.out.println("(If you are done, you can just write 'stop')");
        while (true) {

            try {
                number = Integer.parseInt(scan.nextLine());

                break;

            } catch (Exception e) {
                System.out.println("Invalid number! PLease klick number 1 to continue: ");
            }
        }
        if (number == 1) {
            System.out.println("Write what you want to translate - in english or morse code: ");
        }


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


