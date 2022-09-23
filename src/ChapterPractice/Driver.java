package ChapterPractice;

import java.io.FileReader;

public class Driver {
    static class EscapeSequences {
        public static void main(String[] args) {
            System.out.println("First line\n Second line!");

            System.out.println("Then Chuck said, \" It\'s above the countertop!\"");
        }
    }
    static class ReaderDemo{
        public static void main(String[] args) {
            FileReader inputStream = null;
            FileWriter outputStream = null;
        }
    }
}
