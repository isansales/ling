import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double n1, n2, media, recovery;

        Scanner in = new Scanner(System.in);

        System.out.println("digite a primeira nota (0 a 100): ");
        n1 = in.nextDouble();

        System.out.println("digite a segunda nota: ");
        n2 = in.nextInt();

        media = (n1+n2)/2;
        System.out.println("Média =" +media);

        if(media>=50) {
            System.out.println("Aprovado");
        }else{
            System.out.println("Digite a nota da recuperação: ");
            recovery = in.nextDouble();

            media = (media + recovery)/2;
            System.out.println("nova média = "+ media);

            if(media<50)
                System.out.println("reprovado");
            else
                System.out.println("Aprovado");

        }
    }
}