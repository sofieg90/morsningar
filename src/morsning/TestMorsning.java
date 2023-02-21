package morsning;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class TestMorsning {

    @Test

    public void getAmorse() {

        Morsning morse = new Morsning();

        morse.setText("a");

        String expected = ".- ";
        String actual = morse.getMorse();

        assertEquals(expected, actual);


    }

    @Test

    public void getBmorse() {
        Morsning morse = new Morsning();

        morse.setText("b");

        String expected = "-... ";
        String actual = morse.getMorse();

        assertEquals(expected, actual);
    }

    @Test

    public void getMorseToC() {

        Morsning morse = new Morsning();

        morse.setText("-.-.");

        String expected = "c";
        String actual = morse.getAlfa();

        assertEquals(expected, actual);

    }

    @Test

    public void sayHi() {
        Morsning morse = new Morsning();

        morse.setText("hi");

        String expected = ".... .. ";
        String actual = morse.getMorse();

        assertEquals(expected, actual);
    }

    @Test

    public void morseToHi() {
        Morsning morse = new Morsning();

        morse.setText(".... ..");

        String expected = "hi";
        String actual = morse.getAlfa();

        assertEquals(expected, actual);
    }
}

