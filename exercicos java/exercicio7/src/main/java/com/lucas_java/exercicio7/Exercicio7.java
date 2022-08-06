/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.lucas_java.exercicio7;
import java.util.Scanner;
/**
 *
 * @author lucas
 */
public class Exercicio7 {

    public static void main(String[] args) {
          double n1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe um valor");
        n1 = sc.nextDouble();
        if (n1 % 2 == 0) {
            n1 += 5;
        } else {
            n1 += 8;
        }
        System.out.println("Resultado: " + n1);

    }
}
