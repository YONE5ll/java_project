import java.util.Scanner;

public class TemperatureConverter {
    int temperature;
    String chars;

    public static void main(String[] args) {
        Scanner yo = new Scanner(System.in);
        TemperatureConverter a = new TemperatureConverter();

        System.out.println("enter the temperature inc Degree Celcius you want to convert:");
        a.temperature = yo.nextInt();

        System.out.println("Enter C for Celcius\n Enter F for frenhite\n Enter k for Kelvin\n");
        a.chars = yo.next().toUpperCase();

        switch (a.chars) {
            case "C":
                int Celcius = a.temperature / 5;
                System.out.println("Celcius scale:" + Celcius);
                break;

            case "F":
                int frenhite = a.temperature - 32 / 9;
                System.out.println("Ferehite scale:" + frenhite);
                break;
            case "K":
                int Kelvin = a.temperature - 273 / 5;
                System.out.println("Ferehite scale:" + Kelvin);
                break;

            default:
                System.out.println("invalid input");
                break;
        }

    }

}
