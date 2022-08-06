/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.lucas_java.exercicoabc;
import java.util.Scanner;
/**
 *
 * @author lucas
 */
public class ExercicoABC {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1, num2 ,num3,soma;
        System.out.println("Infrome o Primerio Numero:");
        num1 =sc.nextDouble();
        System.out.println("Informe o segundo nuemero:");
        num2 = sc.nextDouble();
        System.out.println("Informe o terceiro numero:");
        num3 = sc.nextDouble();
        soma =num1 +num2;
        if(soma > num3){
            System.out.println("O terceiro nuemro e menor que a soma dos dois primerios!");
        }
    }
}
