import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int n;

        Scanner in = new Scanner(System.in);

        do{
            System.out.println("Digite um número inteiro maior que zero");
            n = in.nextInt();
        }while (n<=0);

        System.out.println(n + "!=" + fatorial(n));
    }
    public static  int fatorial(int n){
        int fatorial=1;
        for(int i=n;i>1;i--){
            fatorial*=i;
        }
        return fatorial;
    }
}