package arrays;
import java.util.*;
/**
 * Class DoubleWord - пример удаления дубликатов строк
 * @author dimCher
 * @since 31.05.2016.
 * @param: arr - исходный массив строк.
 * @param: count - целое число,счетчик
 */
public class DobArrayTest {
    String [] arr ={"I","va","li","ke","ja","ke","va","li"};
    int count = 0;
    /**метод ShowArr
     * выводит в консоль исходный массив
     * */
    void showArr(){
        System.out.printf("base array:");
        System.out.println(Arrays.toString(arr)+"\n");
    }
    /**метод arrAlg
     * выводит в консоль алгоритм собствееной работы,
     * если элемент вложенного цикла(j) равен элементу
     * основного цикла(i),счетчик инкрементируем.
     * Если элемент вложенного цикла(j)равен элементу
     * основного цикла(i),счетчик инкрементируем и при этом
     * значение уже встречалось (счетчик = 1)
     * присваиваем j значение null
     * */
    void arrAlg() {
        System.out.println("Алгоритм работы метода");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == (arr[i])) {
                    count++;
                }
                if (arr[j] == (arr[i]) && count > 1) {
                    String tmp = arr[j];
                    arr[j] = arr[arr.length - 1];
                    arr[arr.length - 1] = tmp;
                    arr[arr.length - 1] = null;
                    count = 0;
                    System.out.println(Arrays.toString(arr));
                    break;
                }
            }
        }
    }
    /**метод arrFormat
     * выводит в консоль конечный результат
     * если элемент вложенного цикла(j) равен null,- 
     * кидаем j  в конец массива.
     * */
    void arrFormat() {
        System.out.printf("\nКонечный результат:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == null) {
                    if ((j + 1) <= arr.length - 1) {
                        String b = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = b;
                    }
                }

            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
