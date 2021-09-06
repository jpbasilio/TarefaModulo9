package com.jpsilva;
/**
 * Exercício: Ler do console um Valor, colocar esse valor em uma
 * variável do tipo primitivo e converter essa variável para o tipo
 * wrappers e imprimir novamente no console.
 * @author joao
 */

import java.util.Locale;
import java.util.Scanner;

public class Exercise {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);

        double N = leitor.nextDouble();
        System.out.println(N);

        Double N2 = N;
        System.out.println(N2);
    }
}
