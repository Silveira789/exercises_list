package basicExercises.exercise05;

import java.text.DecimalFormat;
import java.util.Scanner;

public class SalarioMinimo {

//    Author: G_silveira;
//     * Função: Crie um algoritmo que leia o valor do salário mínimo e o valor do salário de um usuário,
//calcule a quantidade de salários mínimos esse usuário ganha e imprima o resultado.
//     * Data: 04/04/2023
//     * Input: Valor do salário;
//     * Output: Quantidade de salario minimo, valor do resultado arrendadado;

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("#,##0.00");


        //Salario Minimo em 2023 - PEC 22/12/2022
        final double salarioMinimo = 1320;
        double salario = 0;
        //String result = String.format("%.2f", salario);
        double quantSalMin;

        System.out.println("Digite a valor do salário: ");
        salario = scan.nextDouble();
        quantSalMin = (salario / salarioMinimo);
        System.out.println("Quantidade de Salário(s) minimo(s): " + decimalFormat.format(quantSalMin));
        System.out.println("Resultado: " + quantSalMin);
        System.out.println("Arredondando: " + Math.round(quantSalMin));


    }




}
