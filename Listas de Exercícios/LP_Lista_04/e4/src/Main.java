public class Main {
    public static void main(String[] args) {
        int celsius = -80;

        System.out.println("Tabela de Conversão de Celsius para Fahrenheit");
        System.out.println("Celsius\t|\tFahrenheit");
        System.out.println("-----------------------------");

        while (celsius <= 80) {
            double fahrenheit = (9.0 / 5.0) * celsius + 32;
            System.out.printf("%d\t|\t%.1f\n", celsius, fahrenheit);
            celsius += 10;
        }
    }
}
