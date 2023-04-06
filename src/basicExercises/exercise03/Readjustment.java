package basicExercises.exercise03;

import java.util.Scanner;

public class Readjustment {

//    Author: G_silveira;
//     * Função: 3. Informar um saldo e imprimir o saldo com reajuste de 1%;
//     * Data: 04/04/2023
//     * Input: Ano, mês, dias
//     * Output: Dias totais

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double saldo;

        System.out.println("Informe o saldo para o reajuste: ");
        saldo = scan.nextDouble();
        System.out.println("O valor em questão obteve reajuste de 1%, totalizando: " + (saldo - (saldo * 0.1 )));


    }


}
