import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = 1, num2;
        int resposta, correto;
        String jogarNovamente = "s";

        while (jogarNovamente.equalsIgnoreCase("s")) {
            num1 = 1;
            boolean perdeu = false;

            while (num1 <= 10) {
                System.out.println("Quanto é " + num1 + " x " + num1 + "?");
                resposta = in.nextInt();
                correto = num1 * num1;

                if (resposta == correto) {
                    num1++;
                } else {
                    System.out.println("Resposta errada! Você perdeu o jogo.");
                    perdeu = true;
                    break;
                }
            }

            if (!perdeu) {
                System.out.println("Parabéns! Você completou toda a tabuada!");
            }

            System.out.println("Deseja jogar novamente? (s/n)");
            jogarNovamente = in.next();
        }
    }
}

