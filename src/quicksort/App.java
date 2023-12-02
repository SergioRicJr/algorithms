package quicksort;
import arrayprinter.ArrayPrinter;

public class App {
    // é recursivo
    // PEGA UM PIVO E comeca a colocar tudo que é menor de um lado e tudo que é maior para o outro lado
    // assim o pivo ja estara em sua posicao
    // funciona com duas barras que sinalizam oq é maior ou menor que o pivo
    // o array é dividido entre maior e menor que o pivo, e o quicksort se aplica em cada parte de novo 
    // o pivo vai ter 0 como padrao no inicio
    // public static int[] quickSort(int[] list, Integer start, Integer end) {
    
    
        //     int initialStart = (start != null) ? start : 0;
    //     System.out.println(initialStart);
    //     if (end == null) {
    //         end = list.length - 1;
    //     }
    //     if (initialStart < end) {
    //         int pivot = partition(list, initialStart, end);
    //         quickSort(list, initialStart, pivot-1);
    //         quickSort(list, pivot+1, end);
    //     }
    //     return list;
    // }

    // public static int partition(int[] list,Integer start, Integer end) {
    //     int pivot = list[end];
    //     int min_bar = start;
    //     for (int max_bar=0; max_bar < (end) - 1; max_bar++) {
    //         if (list[max_bar] <= pivot) {
    //             int aux = list[max_bar];
    //             list[max_bar] = list[min_bar];
    //             list[min_bar] = aux; 
    //             min_bar = min_bar + 1;
    //         }
    //     }
    //     int aux = list[min_bar];
    //     list[min_bar] = list[end];
    //     list[end] = aux;

    //     return min_bar;
    // }

    private static int dividir(int[] vetor, int inicio, int fim) {
        int pivo, pontEsq, pontDir = fim;
        pontEsq = inicio + 1;
        pivo = vetor[inicio];

        while(pontEsq <= pontDir) {
            /* Vai correr o vetor ate que ultrapasse o outro ponteiro
            ou ate que o elemento em questão seja menor que o pivô. */
                while(pontEsq <= pontDir && vetor[pontEsq] <= pivo) {
                pontEsq++;
            }

            /* Vai correr o vetor ate que ultrapasse o outro ponteiro
            que o elemento em questão seja maior que o pivô. */
                while(pontDir >= pontEsq && vetor[pontDir] > pivo) {
                pontDir--;
            }

            /* Caso os ponteiros ainda nao tenham se cruzado, significa que valores
            menores e maiores que o pivô foram localizados em ambos os lados.
            Trocar estes elementos de lado. */
                if(pontEsq < pontDir) {
                trocar(vetor, pontDir, pontEsq);
                pontEsq++;
                pontDir--;
            }
        }

        trocar(vetor, inicio, pontDir);
        return pontDir;
    }

    private static void trocar(int[] vetor, int i, int j) {
        int temp = vetor[i];
        vetor[i] = vetor[j];
        vetor[j] = temp;
    }


    public static void ordenarVetorDeInteiros(int[] vetor) {
        quickSort(vetor, 0, vetor.length - 1);
    }
    
    private static void quickSort(int[] vetor, int inicio, int fim) {
        if(fim > inicio) {
            //Chamada da rotina que ira dividir o vetor em 3 partes.
            int indexPivo = dividir(vetor, inicio, fim);
            /* Chamada recursiva para redivisao do vetor de elementos menores
            que o pivô. */
            quickSort(vetor, inicio, indexPivo - 1);
            /* Chamada recursiva para redivisao do vetor de elementos maiores
            que o pivô. */
            quickSort(vetor, indexPivo + 1, fim);
        }
    }
    
      


    public static void main(String[] args) {

        int vetor[] = {24, 66, 87, 43, 11, 27};
       
        ordenarVetorDeInteiros(vetor);
        ArrayPrinter.printArray(vetor);
    }
}