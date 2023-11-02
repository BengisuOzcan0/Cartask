import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the model:");
        String model = input.nextLine();
        System.out.println("Enter the brand:");
        String brand = input.nextLine();
        System.out.println("Enter the year:");
        int year = input.nextInt();
        System.out.println("Enter the price:");
        double price = input.nextDouble();
        System.out.println("Enter the color:");
        String color = input.next();
        System.out.println("Enter the quantity:");
        int quantity = input.nextInt();

        Car car = new Car(model, brand, year, price, color, quantity);

        car.setColor("blue");

        System.out.println("Color: " + car.getColor());

        car.setYear(1999);

        System.out.println(car.toString());
    }
}