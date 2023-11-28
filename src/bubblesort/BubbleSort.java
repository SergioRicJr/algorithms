package bubblesort;

public class BubbleSort {
    public static int[] sort(int[] array) {
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

    public static void showList(int[] list) {
        for (int x: list) {
            System.out.println(x);
        }
    }

    public static void main(String[] args) {
        int[] integers = {8, 4, 5, 1, 9, 3, 2, 6};
        integers = sort(integers);
        showList(integers);
    }
}
