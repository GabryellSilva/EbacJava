package EBACJava.Modulo03.Exercicios.Array;

import static EBACJava.Modulo03.Domain.Publica.marcaDoConsole;

public class ExemploDeBubbleSortDinamico {
    public static void main(String[] args) {
        exemploDeArray();
        declaracaoDeArray();
        arrayBidimensional();
    }

    public static void arrayBidimensional() {
        marcaDoConsole();
        System.out.println("ArrayBidimensional");
            int[][] array1 = { {1,2,3}, {4,5,6}};
            int[][] array2 = { {7,8,9}, {10,11,12}};

        System.out.println("Valores de array1 passados na linha são:");
        outputArray(array1);
        System.out.println("");
        marcaDoConsole();
        System.out.println("Valores de array2 passados na linha são:");
        outputArray(array2);

    }

    private static void outputArray(int[][] array1) {
        //for pelas linhas
        for (int linha = 0; linha < array1.length; linha++){
            //for pelas colunas
            for (int coluna = 0; coluna < array1[linha].length; coluna++){
                System.out.printf("%d ", array1[linha][coluna]);
            }
        }

    }

    public static void declaracaoDeArray() {
        System.out.println("Declaração de Array");

        //[] são inseridos em uma variavel que referencia um array
        int[] a = new int[4];

        // outra maneira de declaração de Array
        int[] b;
        b = new int[10];

        //declarando varios Arrays
        int[] r = new int[44], k = new int[77];

        marcaDoConsole();

        //inicia valores em um Array de declaração
        int[] iniciandoValores = {1,2,3,4,5,6};

        //Declara um array de inteiro
        int[] meuArray;

        //Aloca memoria para 10 inteiros
        meuArray = new int[10];

        // inicializa o primeiro elemento
        meuArray[0] = 100;
        meuArray[1] = 454;
        meuArray[2] = 35;
        meuArray[3] = 643;
        meuArray[4] = 12;
        meuArray[5] = 352;
        meuArray[6] = 44;
        meuArray[7] = 213;
        meuArray[8] = 361;
        meuArray[9] = 11;


        System.out.println(meuArray[9]);
        System.out.println(meuArray[2]);
    }

    public static void exemploDeArray() {
        int[] arrayUm = {12, 3, 5, 68, 69, 856, 45, 98, 450, 1567};
        int[] arrayDois = {56, 69, 41, 8, 9, 17, 23, 24};

        if(arrayUm.length > 8){
            marcaDoConsole();
            System.out.println("Tamanho do ArrayUm - maior que 8");
        } else {
            System.out.println("Tamanho do ArrayUm - menor que 8");
        }
        System.out.println("\nTamanho do ArrayUm = "+ arrayUm.length);
    }
}
