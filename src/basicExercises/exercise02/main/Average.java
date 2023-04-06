package basicExercises.exercise02.main;

public class Average {
    /*
     * Author: G_silveira;
     * Função: Programa que imprima a média artimética dos numeros 8,7 e 9 ; e dos numeros 4,5,6 , imprimindo também a média da soma dos seus resultados e a média entre eles;
     * Data: 03/04/2023
     * Input: -
     * Output: Média dos numeros (8,7,9) e (4,5,6), media resultado deles e a soma de suas médias
    */

    public static void main(String[] args) {


        //Way1
//        System.out.println("Média dos seguintes números");
//        System.out.println("Media de 8,9 e 7: " + (7 + 8 + 9) / 3);
//        System.out.println("Media de 4,5 e 6: " + ((4 + 5 + 6) /3));
//        System.out.println("Soma das médias: " + (8 + 5));
//        System.out.println("Médias das Médias: " + ((8 + 5) /2));

        //Way 2
        System.out.println("Média dos seguintes números");
        System.out.println("Media de 8,9 e 7:  " + media01());
        System.out.println("Media de 4,5 e 6:  " + media02());
        System.out.println("Soma das médias:  " + somaMedias());
        System.out.println("Médias das Médias:  " + mediaDasMedias());


    }


    static int media01() {
        return (9 + 8 + 7) / 3;
    }

    static int media02() {
        return (4 + 5 + 6) / 3;
    }

    static int somaMedias() {
        return media01() + media02();
    }

    static float mediaDasMedias() {

        return (float) (media01() + media02())/ 2;
    }


}
