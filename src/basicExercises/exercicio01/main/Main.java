package basicExercises.exercicio01.main;

import basicExercises.exercicio01.model.Age;

public class Main {

    /*
     * Author: G_silveira;
     * Função: Converter dia, mes e anos vividos em dias totais de vivência;
     * Data: 03/04/2023
     * Input: Ano, mês, dias
     * Output: Dias totais
     * 
     */

    public static void main(String[] args) {

        Age age = new Age();

        System.out.println("Bem vindo ao conversor de Idade; \n " +
                "Iremos converter sua idade em anos, meses e dias e converter em dias de vivência");
        System.out.println("Exemplo: 16 anos, 5 meses e 22 dias");
        System.out.println("Digite respectivamente: ");
        age.conversorDias();




    }


}
