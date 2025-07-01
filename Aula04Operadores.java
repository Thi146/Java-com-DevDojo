package academy.devdojo.maratonajava.maratonajava;

import java.sql.SQLOutput;

public class Aula04Operadores {
    public static void main(String[] args) {
        // +-/*
        int numero1 = 10;
        int numero2 = 20;
        double resultado = numero1 / (double) numero2;
        System.out.println(resultado);

        // %
        int resto = 20 % 2;
        System.out.println(resto);

        // < > <= >== == !=
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezIgualDez = 10 == 10;
        boolean isDezDiferenteDeDez = 10 != 10;
        System.out.println ("isDezMaiorQueVinte " +isDezMaiorQueVinte);
        System.out.println ("isDezMenorQueVinte " +isDezMenorQueVinte);
        System.out.println ("isDezIgualVinte " +isDezIgualVinte);
        System.out.println ("isDezIgualDez " +isDezIgualDez);
        System.out.println ("isDezDiferemteDeDez " +isDezDiferenteDeDez);

        //&& (AND) || (OR) !
        int idade = 35;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = idade > 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;

        System.out.println("isDentroDaLeiMaiorQueTrinta" +isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta" +isDentroDaLeiMenorQueTrinta);

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlaystation = 5000F;
        boolean isPlaystation5Compravel = valorTotalContaCorrente > valorPlaystation || valorTotalContaPoupanca > valorPlaystation;
        System.out.println("isPlaystation5Compravel" + isPlaystation5Compravel);

        // = += -= *= /= %=
        double bonus = 1800; //1800
        bonus =+ 1000; //2800
        bonus -= 1000; //1800
        bonus *= 2;
        bonus /= 2;
        bonus %= 2;
        System.out.println(bonus);

        //
        int contador = 0;
        contador += 1; //contador = contador + 1 ;
        contador++;
        contador--;
        ++contador;
        --contador;
        int contador2 = 0;
        System.out.println(contador);

    }
}