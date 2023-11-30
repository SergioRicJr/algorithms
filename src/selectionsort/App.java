package selectionsort;

import arrayprinter.ArrayPrinter;

public class App {
    // Procura o menor item da lista e leva para a primeira posição
    // A cada iteração ele busca o menor número e leva ao menor indice disponível
    public static int[] selectionSort(int[] list) {
        int arraySize = list.length;
        
        for (int j = 0; j < (arraySize - 1); j++) {
            int min_index = j;
            for (int i = j; i < arraySize; i++) {
                if (list[i] < list[min_index]) {
                    min_index = i;
            }
            if (list[j] > list[min_index]) {
                int aux = list[j];
                list[j] = list[min_index];
                list[min_index] = aux; 
            }
        }
        }
        
        return list;
    }
    public static void main(String[] args) {
        int[] integers = {8, 4, 5, 1, 9, 3, 2, 6, 12, 5, 2};
        int[] list = selectionSort(integers);
        ArrayPrinter.printArray(list);
    }
}
