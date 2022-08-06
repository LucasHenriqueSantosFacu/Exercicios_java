/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.lucas_java.exercicio5;
import java.util.Scanner;
/**
 *
 * @author lucas
 */
public class Exercicio5 {

    public static void main(String[] args) {
            int numero;

        Scanner sc = new Scanner(System.in);
        System.out.println("Informe um número");
        numero = sc.nextInt();
        if (numero > 0) {
            numero *= 2;
        } else if (numero < 0) {
            numero *= 3;
        }
        System.out.println("Resultado: " + numero);
    }
    
}
