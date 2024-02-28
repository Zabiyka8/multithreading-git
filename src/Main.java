import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

//TODO: Задача 1. Параллельный поиск в массиве:
// Создайте массив целых чисел.
// Создайте два потока для поискаfg
// Разделите его на две части.
// Создайте два потока для поиска максимального и минимального элементов в этих частях.
// Верните результаты поиска.

        int count = 11;
        int[] array = new int[count];
        for (int i = 0; i < count; i++) {
            array[i] = (int) (Math.random() * 100);
        }

        int[] firstArray = Arrays.copyOfRange(array, 0, count / 2);
        int[] secondArray = Arrays.copyOfRange(array, count / 2, count);

        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(firstArray));
        System.out.println(Arrays.toString(secondArray));

        Thread threadMin = new Thread(new MinThread(firstArray, "firstArray"));
        threadMin.start();

        Thread threadMax = new Thread(new MaxThread(firstArray, "firstArray"));
        threadMax.start();

        threadMin = new Thread(new MinThread(secondArray, "secondArray"));
        threadMin.start();

        threadMax = new Thread(new MaxThread(secondArray, "secondArray"));
        threadMax.start();
    }
}