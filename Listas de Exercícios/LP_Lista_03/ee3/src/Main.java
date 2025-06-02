import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double n1, n2, media;

        Scanner in = new Scanner(System.in);

        System.out.println("digite a primeira nota (0 a 100): ");
        n1 = in.nextDouble();

        System.out.println("digite a segunda nota: ");
        n2 = in.nextInt();

        media = (n1+n2)/2;
        System.out.println("Média =" +media);

        System.out.println(media<50?"reprovado":"aprovado");
    }
}