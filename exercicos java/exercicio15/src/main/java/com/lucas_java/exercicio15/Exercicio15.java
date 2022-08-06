/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.lucas_java.exercicio15;
import java.util.Scanner;
/**
 *
 * @author lucas
 */
public class Exercicio15 {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       Double n1,n2,n3, soma;
        System.out.println("Informe o primerio ângulo:");
        n1 =sc.nextDouble();
        System.out.println("Informe o segundo ângulo:");
        n2 =sc.nextDouble();
        System.out.println("Informe o terceiro ângulo:");
        n3 =sc.nextDouble();
        soma = n1 + n2 + n3;
        if(soma==90){
            System.out.println("Esse Triângulo é um triangulo Retangulo");
        }else if(soma>90){
            System.out.println("Esse Triângulo é um triangulo Obtusângulo");
        }else{
            System.out.println("Esse Triângulo é um triangulo Acutângulo:");
        }
    }
}
