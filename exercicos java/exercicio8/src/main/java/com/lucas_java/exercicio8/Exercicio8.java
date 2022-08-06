/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.lucas_java.exercicio8;
import java.util.Scanner;
/**
 *
 * @author lucas
 */
public class Exercicio8 {

    public static void main(String[] args) {
        int numero;
        int lista[] = new int[5];
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe cinco números");
        for (int i = 0; i <= 4; i++) {
            numero = sc.nextInt();
            lista[i] = numero;
        }

        for (int i = 0; i <= 4; i++) {
           
           
            System.out.println(lista[i]);
        }
    }
}
