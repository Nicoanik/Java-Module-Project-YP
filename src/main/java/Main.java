import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HashSet<Car> carList = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i <= 3; i++) {
            System.out.println("Введите название автомобиля №" + i + ":");
            String name = scanner.next();
            System.out.println("Введите скорость автомобиля " + name + " (от 0 до 250):");
            int speed = scanner.nextInt();
            Car car = new Car(name, speed);
            carList.add(car);
            Race.newRaceLeader(name, speed);
        }
    }
}
