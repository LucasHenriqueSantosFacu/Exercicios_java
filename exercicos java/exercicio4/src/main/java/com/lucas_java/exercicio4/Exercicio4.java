/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.lucas_java.exercicio4;
import java.util.Scanner;
/**
 *
 * @author lucas
 */
public class Exercicio4 {
    
    public static void main(String[] args) {
        int a, b, c = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe dois números inteiros");
        a = sc.nextInt();
        b = sc.nextInt();

        if (a == b) {
            c = a + b;
        } else {
            c = a * b;
        }
        System.out.println("Resultado: " + c);
    }
}
