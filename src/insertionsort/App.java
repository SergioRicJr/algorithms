package insertionsort;
import arrayprinter.ArrayPrinter;

public class App {
    // A cada iteração ele percorre mais elementos
    // A cada iteralção ele pega um elemento e leva ele para o limite?
    public static int[] insertionSort(int[] list) {
        int arraySize = list.length;

        for (int i = 1; i < arraySize; i++) {
            int key = list[i];
            int j = i - 1;
            while (j >= 0 && list[j] > key) {
                list[j+1] = list[j];
                j --;
                list[j+1] = key;
            } 
        }

        return list;
    }
    
    public static void main(String[] args) {
        int[] integers = {8, 4, 5, 1, 9, 3, 2, 6, 12, 5, 2};
        integers = insertionSort(integers);
        ArrayPrinter.printArray(integers);
    }
}
