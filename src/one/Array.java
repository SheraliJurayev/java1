package one;

public class Array {
    public static void main(String[] args) {
        for (int i = 100; i <= 999; i++) {
            String numberInWords = convertToWords(i);
            System.out.println(i + " - \"" + numberInWords + "\"");
        }
    }

    public static String convertToWords(int number) {
        String[] ones = {"", "bir", "ikki", "uch", "to'rt", "besh", "olti", "yetti", "sakkiz", "to'qqiz"};
        String[] tens = {"", "o'n", "yigirma", "o'ttiz", "qirq", "ellik", "oltmish", "yetmish", "sakson", "to'qson"};
        String[] hundreds = {"", "yuz", "ikki yuz", "uch yuz", "to'rt yuz", "besh yuz", "olti yuz", "yetti yuz", "sakkiz yuz", "to'qqiz yuz"};

        int digit1 = number % 10;
        int digit10 = (number / 10) % 10;
        int digit100 = (number / 100) % 10;

        String numberInWords = hundreds[digit100] + " " + tens[digit10] + " " + ones[digit1];

        return numberInWords.trim();
    }
}

