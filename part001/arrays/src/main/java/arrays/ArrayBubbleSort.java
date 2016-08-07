package arrays;
import java.util.*;
/**
 * Class ArrayBubleSort - пример выполнения сортировки пузырьком
 * @author dimCher
 * @since 28.05.2016.
  */
public class ArrayBubbleSort {
    /**
     * метод arrFill()- заполняет массив сначала по порядку,
     * а затем перемешивает элементы массива для наглядной демонстрации
     * сортировки.
     * @param: arr - одномерный массив целых чисел с размером 10 элементов
     * @param: rndm - экземпляр класса Random- генератора псевдослучайных чисел
     * */
        public  int[] arrFill() {
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = i;
            }
        Random rndm = new Random();
        for (int i = arr.length - 1; i > 0; i--) {
            int j = rndm.nextInt(i);
            int k = arr[i];
            arr[i] = arr[j];
            arr[j] = k;
        }
        return arr;
    }
    /**
     * Метод bubbleSort()- реализует пузырьковую сортировку
     * Сравниваем элементы попарно,если они имеют неправильный порядок,то меняем их местами
     **/
    public int[] bubbleSort(int[] arr){
            for(int i = arr.length-1 ; i > 0 ; i--){
                for(int j = 0 ; j < i ; j++){
                    if( arr[j] > arr[j+1] ){
                        int t = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = t;
            }
        }
    }
        return arr;
}

}



