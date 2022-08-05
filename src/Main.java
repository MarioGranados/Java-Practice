import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

    public static void example() {
        int[] number = new int[3];

        number[0] = 1;
        number[1] = 2;
        number[2] = 3;
        int size = 3;

        int j = 0;
        int total = 0;
        int k = 0;

        while(j < size) {
            k = j;
            while (k < size) {
                total += number[k];
                k++;
            }
            j++;
        }
        System.out.println(total);
    }

    public static void inputOutput() {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d = scan.nextDouble();
        scan.nextLine();
        String s = scan.nextLine();
        // Write your code here.


        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
        scan.close();
    }


    /**
     * @param args
     */
    public static void main(String[] args) {
        class Car {
            String model;
            double price;
            String color;
   
           Car(String model, double price, String color) {
               this.model = model;
               this.price = price;
               this.color = color;
           }
       }
        List<Car> cars = new ArrayList<>();

        cars.add(new Car("Mercedes", 25000, "blue"));
        cars.add(new Car("Audi", 25000, "grey"));
        cars.add(new Car("Tesla", 24000, "green"));
        cars.add(new Car("Kia", 55000, "green"));
        cars.add(new Car("iCar", 100000, "white"));
        cars.add(new Car("BMW", 45000, "green"));

        //map -> 
        // cars.stream()
        // .filter(car->car.price < 55000)
        // .map(car -> car.model)
        // .forEach(System.out::println);

        cars.stream()
            .filter(car->car.color.contains("green"))
            .map(car -> car.model)
            .sorted()
            .forEach(System.out::println);


            IntStream
            .range(1, 10)
            .skip(5)
            .forEach(System.out::println);
        
        Stream.of("Mario", "Jacob", "Jessica")
            .sorted()
            .findFirst()
            .ifPresent(System.out::println);

       String[] names = {"Mario", "Alice", "Johnyy", "April"};
       Arrays.stream(names)
            .filter(x -> x.startsWith("A"))
            .sorted()
            .forEach(System.out::println);

        // Arrays.stream(new int[] {2, 4, 6, 8})
        // .map(x -> x * x)
        // .average()
        // .ifPresent(System.out::println);

       List<String> people = Arrays.asList("Alice", "James", "Johnny", "Taylor", "Wario");
       people
            .stream()
            .map(String::toLowerCase)
            .filter(x -> x.startsWith("A") )
            .forEach(System.out::println);

    }
}
