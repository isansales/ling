import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String name;
        int year;

        Scanner in = new Scanner(System.in);

        System.out.println("My name is: ");
        name = in.next();

        System.out.println("I was born in: ");
        year = in.nextInt();

        askQuestions(name, year); //chamar a função askQuestion
        orderMenu(); //chamar a função orderMenu

        //void não tem retorno
    }

    public static void orderMenu() {
        System.out.println("\nMENU");
        System.out.println("1");
        System.out.println("2");
        System.out.println("3");
    }

    public static void askQuestions(String user, int year) {
        int age = calcAge(year);
        System.out.println("\nWelcome, " + user);
        System.out.println("You are " + calcAge(year) + " years old");
    }

    public static int calcAge(int year){
        return 2025-year;
    }
}