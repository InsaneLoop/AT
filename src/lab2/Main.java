package lab2;

import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        String input = "Java is a versatile programming language.";

        String delimiter = " ";

        StringTokenizer tokenizer = new StringTokenizer(input, delimiter);

        System.out.println("Токени:");
        while (tokenizer.hasMoreTokens()) {
            System.out.println(tokenizer.nextToken());
        }
    }
}
