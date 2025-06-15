import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Insira uma string: ");
        String text = in.nextLine();

        text = text.replaceAll("\\s+", "").toLowerCase();

        if (isPalindrome(text, 0, text.length() - 1)) {
            System.out.println("\"" + text + "\" É um palíndromo.");
        } else {
            System.out.println("\"" + text + "\" Não é um palíndromo.");
        }
    }

    //recursividade
    public static boolean isPalindrome(String text, int left, int right) {
        if (left >= right) {
            return true;
        }

        if (text.charAt(left) != text.charAt(right)) {
            return false;
        }

        return isPalindrome(text, left + 1, right - 1);
    }
}
