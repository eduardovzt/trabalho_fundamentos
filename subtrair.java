package com.mycompany.trabalho_fundamentos;

import java.util.Scanner;

public class somar {

    public static void main(String[] args) {

    int num1, num2;

    Scanner leitor = new Scanner(System.in);

    System.out.println("Informe 2 numeros para fazer a subtracao");
    num1 = leitor.nextInt();
    num2 = leitor.nextInt();
    int resultado = num1 - num2;

        System.out.println("O resultado da subtracao eh: "+resultado);

   }
}
