package bubblesort;
import arrayprinter.ArrayPrinter;

public class App {
    public static int[] bubbleSort(int[] array) {
        int arraySize = array.length;
        int temp = 0;
        for (int x = 0; x < arraySize; x++) {
            for (int y = 1; y < (arraySize-x); y++) {
                if(array[y-1] > array[y]){  
                    temp = array[y-1];  
                    array[y-1] = array[y];  
                    array[y] = temp;  
                }  
            }
            
        } 
        return array;
    }

    public static void main(String[] args) {
        int[] integers = {8, 4, 5, 1, 9, 3, 2, 6};
        integers = bubbleSort(integers);
        ArrayPrinter.printArray(integers);
    }
}
