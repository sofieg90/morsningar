package morsning;

public class Morsning {

    char[] alfa;
    String[] morse;

    String text;

    public Morsning() {
        alfa = new char[]{'a', 'b','c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n',
        'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};


        morse = new String[]{".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..",
                ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.",
                "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};

        text = "";


    }

    public void setText(String input) {

        text = input;
        System.out.print(" morse code of " + text + " is: ");

       String[] word = text.split(" ");

        for (int i = 0; i < text.length(); i++) {
            for (int j = 0; j < alfa.length; j++) {
                if (text.charAt(i)== alfa[j]) {
                    System.out.print(morse[j] + " ");
                    break;
                }
            }
        }

    }

    public String getText() {
        return text;
    }


}
