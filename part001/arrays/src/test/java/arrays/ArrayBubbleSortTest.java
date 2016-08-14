package arrays;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;
import org.junit.Test;
import java.util.Arrays;
import arrays.ArrayBubbleSort;
/**
 * Class ArrayBubleSort - пример выполнения сортировки пузырьком
 * @author dimCher
 * @since 28.05.2016.
  */
public class ArrayBubbleSortTest {
	
	
   @Test
   public void arrayBubleSortTester(){
   ArrayBubbleSort testArray = new ArrayBubbleSort();
   int[] rndm = new int[]{2,4,5,1,9,7,6,3,8};
   int[] exp = new int[]{1,2,3,4,5,6,7,8,9};
   
   
		testArray.bubbleSort(rndm);
		
		
		assertThat(Arrays.toString(rndm), is(Arrays.toString(exp)));
   }
}



