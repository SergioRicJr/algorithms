package bubblesort;
import arrayprinter.ArrayPrinter;

public class App {
    // Percorre toda a lista comparando número e o próximo e trocando eles de lugar
    // percorre toda a lista na mesma quantidade que seu length
    public static int[] bubbleSort(int[] array) {
        int arraySize = array.length;
        int temp = 0;
        
        for (int x = 0; x < (arraySize - 1); x++) {
            for (int y = 0; y < (arraySize - 1); y++) {
                if(array[y] > array[y+1]){  
                    temp = array[y];  
                    array[y] = array[y+1];  
                    array[y+1] = temp;  
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
