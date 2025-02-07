package EBACJava.Modulo03.Exercicios.Array;

public class ExemploDeBubbleSortFixo {
    public static void main(String[] args) {
        int[] array = {1, 5, 6, 8, 12, 24};
        int aux = 0;
        int i = 0;

        System.out.println("Array desordenado");
        for (i = 0; i < array.length; i++) {
            System.out.printf("" + array[i]);
        }

        System.out.println("");
        for (i = 0; i < array.length; i++) {
            for (int j = 0; j < 4; j++) {
                if (array[j] > array[j + 1]) {
                    aux = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = aux;
                }
            }
        }
        System.out.println("Vetor organizado");
        for (i = 0; i < array.length; i++) {
            System.out.printf(" " +array[i]);
        }
    }
}