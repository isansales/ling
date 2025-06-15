import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String text = in.nextLine();

        if (isPalindrome(text)) {
            System.out.println("\"" + text + "\" is a palindrome.");
        } else {
            System.out.println("\"" + text + "\" is not a palindrome.");
        }
    }

    public static boolean isPalindrome(String text) {
        // Remover espaços e transformar em minúsculas para comparação correta
        text = text.replaceAll("\\s+", "").toLowerCase();

        int left = 0;
        int right = text.length() - 1;

        while (left < right) {
            if (text.charAt(left) != text.charAt(right)) {
                return false; // Se encontrar caracteres diferentes, não é palíndromo
            }
            left++;
            right--;
        }
        return true; // Se passou por todo o laço sem problemas, é palíndromo
    }
}
