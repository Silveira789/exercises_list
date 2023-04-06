package basicExercises.exercise06;

import java.util.Scanner;

public class Numbers {

//    Author: G_silveira;
//     * Função: Desenvolva um algoritmo em Java que leia um número inteiro e imprima o seu antecessor e seu sucessor.
//     * Data: 04/04/2023
//     * Input: Numero qualquer
//     * Output: Antecessor e sucessor do numero em questão;

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double valor;

        System.out.println("Insira um número qualquer: ");
        valor = scan.nextDouble();

        System.out.println("Antecessor: " + (valor - 1));
        System.out.println("Sucessor: " + (valor + 1));


    }


}
