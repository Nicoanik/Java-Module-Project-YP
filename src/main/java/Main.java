import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> carList = new ArrayList<>();
        for (int i = 1; i <= 3; i++) {
            String name;
            int speed;
            while (true) {
                System.out.println("Введите название автомобиля №" + i + ":");
                Scanner scanner = new Scanner(System.in);
                name = scanner.nextLine();
                if (name.isEmpty()) {
                    System.out.println("Вы не ввели название, попробуйте ещё раз.");
                } else if (carList.contains(name)) {
                    System.out.println("Автомобиль с таким именем уже учавствует в гонке, введите другое название.");
                } else {
                    break;
                }
            }
            while (true) {
                System.out.println("Введите скорость автомобиля " + name + " (от 0 до 250):");
                Scanner scanner = new Scanner(System.in);
                if (scanner.hasNextInt()) {
                    speed = scanner.nextInt();
                    if (speed > 0 && speed <= 250) {
                        break;
                    }
                }
                System.out.println("Вы ввели не верное значение скорости, попробуйте ещё раз.");
            }
            Car car = new Car(name, speed);
            carList.add(name);
            Race.newRaceLeader(name, speed);
        }
        System.out.println("В гонке учавствовали автомобили: " + carList);
        System.out.println("Самый быстрый автомобиль: " + Race.raceLeader);
    }
}
