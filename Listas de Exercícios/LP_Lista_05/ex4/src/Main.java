import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int [] num = new int[10];
        int positionMin = 0, positionMax = 0;

        Scanner in = new Scanner(System.in);

        for (int i=0; i<10; i++) {
            System.out.println("Enter your number for " + i + " position: ");
            num [i] = in.nextInt();
        }

        int min = num [0];
        int max = num [0];

        for (int i=0; i<10; i++) {
            if (num [i] >= max) {
                max = num [i];
                positionMax = i;
            } else if (num [i] <= min) {
                min = num [i];
                positionMin = i;
            }
        }

        System.out.println("\nMax number is " + max + ", found at " + positionMax + "º position");
        System.out.println("Min number " + min + ", found at " + positionMin + "º position");
    }
}