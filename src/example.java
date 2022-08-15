import java.util.*;


public class example {

    public static ArrayList<Integer> randomNumbers(int range) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < range; i++) {
            numbers.add(random.nextInt(1000));
        }
        return numbers;
    }
    public static int[] arrayRandomNumbers(int range) {
        int[] numbers = new int[range];
        Random random = new Random();
        for(int i = 0; i < numbers.length; i ++) {
            numbers[i] = random.nextInt(1000);
        }
        return numbers;
    }

    public static void collectionSortMethod(ArrayList<Integer> numbers) {
        System.out.println("Before");
        System.out.println(numbers);

        System.out.println("After");
        Collections.sort(numbers);
        System.out.println(numbers);
    }

    public static void bubbleSort(int[] numbers) {
        System.out.println("Before");
        System.out.println(Arrays.toString(numbers));
        for(int i = 0; i < numbers.length; i++) {
            for(int j = 0; j < numbers.length - 1; j++) {
                if(numbers[j + 1] < numbers[j]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
        System.out.println("After");
        System.out.println(Arrays.toString(numbers));
    }
    public static void main(String[] args) {
/*        collectionSortMethod(randomNumbers(50000000));
//        bubbleSort(arrayRandomNumbers(50000000));*/
    }
}
