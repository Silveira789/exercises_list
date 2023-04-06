package basicExercises.exercicio01.model;

import java.util.Scanner;

public class Age {

    //Atributos
    int ano;
    int mes;
    int dia;


    //Métodos
    public void  conversorDias() {
        Scanner scan = new Scanner(System.in);
        Age age = new Age();
        int resul;

        System.out.println("Ano: ");age.ano = scan.nextInt();
        System.out.println("Mês: ");age.mes = scan.nextInt();
        System.out.println("Dias: ");age.dia = scan.nextInt();

        resul = (age.ano * 365) + (age.mes * 30) + (age.dia);
        System.out.println("Aproximadamente " + resul +" dias de vida." );


    }


}
