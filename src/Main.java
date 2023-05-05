import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
    task1();
    }


    public static int[] generateRandomArray () {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;

    }
        public static void task1 () {

            int[] arr = generateRandomArray();

            
            System.out.println(Arrays.toString(arr));

            System.out.println("Домашняя работа № 9 ");
            System.out.println(" Задание № 1");

            int[] arr1 = generateRandomArray();
            int sum = 0;
            for (int index = 0; index < arr1.length; index++) {
                sum += arr1[index];
                System.out.println(sum);
            }
            System.out.println("Сумма трат за месяц составила " + sum +" рублей");

            System.out.println(" Задание № 2");
            int[] arr_2 = generateRandomArray();
            int maxWeight = -1;
// Объявляем переменную с максимальным весом
// Значение переменной меньше любого элемента в массиве
            for (int i = 0; i < arr_2.length; i++) {
// Сравниваем maxWeight с каждым элементом массива
                if (arr_2[i] > maxWeight) {
                    // Если значение элемента массива больше, чем maxWeight
                    maxWeight = arr_2[i];
                    // Записать значение в переменную
                }
            }
            System.out.println(maxWeight);

            int[] arr_3 = generateRandomArray();
            int minWeight = -1;
// Объявляем переменную с максимальным весом
// Значение переменной меньше любого элемента в массиве
            for (int i = 0; i < arr_2.length; i++) {
// Сравниваем maxWeight с каждым элементом массива
                if (arr_3[i] < minWeight) {
                    // Если значение элемента массива больше, чем maxWeight
                    minWeight = arr_3[i];
                    // Записать значение в переменную
                }
            }
            System.out.println(minWeight);

            System.out.println(" Задание № 3");

            int[] arr2 = generateRandomArray();
            double sum2 = 0;
            double averageMean2 = 0;
            for ( int i   = 0;   i  < arr2.length;  i  ++) {
                sum2  += arr1[i];
                System.out.println(sum2);
                averageMean2 = sum2/30;
            }
            System.out.println("Средняя сумма трат за месяц составила " + averageMean2  +" рублей");

            System.out.println(" Задание № 4");

            char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
            for ( int i   = reverseFullName.length-1; i>=  0;     i  --) {
                System.out.print(reverseFullName[i] + " ");
                }







        }


    }




