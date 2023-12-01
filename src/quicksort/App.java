package quicksort;
import arrayprinter.ArrayPrinter;

public class App {
    // é recursivo
    // PEGA UM PIVO E comeca a colocar tudo que é menor de um lado e tudo que é maior para o outro lado
    // assim o pivo ja estara em sua posicao
    // funciona com duas barras que sinalizam oq é maior ou menor que o pivo
    // o array é dividido entre maior e menor que o pivo, e o quicksort se aplica em cada parte de novo 
    // o pivo vai ter 0 como padrao no inicio
    public static int[] quickSort(int[] list, Integer start, Integer end) {
        // int initialStart = (start != null) ? start : 0;

        if (end == null) {
            end = list.length - 1;
        }
        if (start < end) {
            int pivot = partition(list, start, end);
            quickSort(list, start, pivot-1);
            quickSort(list, pivot+1, end);
        }

        return list;
    }

    public static int partition(int[] list,Integer start, Integer end) {
        int pivot = list[end];
        int i = start;
        for (int j=0; j < end; j++) {
            if (list[j] <= pivot) {
                int aux = list[j];
                list[j] = list[i];
                list[i] = aux; 
                i = i++;
            }
        }
        int aux = list[i];
        list[i] = list[end];
        list[end] = aux;

        return i;
    }
    
    public static void main(String[] args) {
        int[] integers = {8, 4, 5, 1, 9, 3, 2, 6, 12, 5, 2};
        integers = quickSort(integers, 0, null);
        ArrayPrinter.printArray(integers);
    }
}