package morsning;

public class Morsning {

    char[] alfa;
    String[] morse;

    String text;
    String output;

    String output2;

    public Morsning() {
        alfa = new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n',
                'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};


        morse = new String[]{".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..",
                ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.",
                "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};

        text = "";


    }

    public void setText(String input) {

        text = input;

        System.out.print("translate " + text + ": ");

            for (int i = 0; i < text.length(); i++) {
                for (int j = 0; j < alfa.length; j++) {
                    if (text.charAt(i) == alfa[j]) {
                        System.out.print(morse[j] + " ");
                        output = morse[j] + " ";

                        break;
                    }
                }
            }
                String[] word = text.split(" ");

                for (int i = 0; i < word.length; i++) {
                    for (int j = 0; j < morse.length; j++) {
                        if (word[i].compareTo(morse[j]) == 0) {
                            System.out.print(alfa[j] + " ");
                            output2 = alfa[j] + " ";
                            break;
                        }
                    }
                }


            }

    public String getText() {

        return text;
    }

    public String getMorse() {

        return output;
    }


    public String getAlfa() {

        return output2;
    }

}
