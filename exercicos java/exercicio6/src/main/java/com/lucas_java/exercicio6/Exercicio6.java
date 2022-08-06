/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.lucas_java.exercicio6;
import java.util.Scanner;
/**
 *
 * @author lucas
 */
public class Exercicio6 {

    public static void main(String[] args) {
        double n1, n2, n3, maior = 0, meio = 0, menor = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe três números");
        n1 = sc.nextDouble();
        n2 = sc.nextDouble();
        n3 = sc.nextDouble();

        if (n3 < n2 && n2 < n1) {
            maior = n1;
            meio = n2;
            menor = n3;
        } else if (n2 < n3 && n3 < n1) {
            maior = n1;
            meio = n3;
            menor = n2;
        } else if (n1 < n3 && n3 < n2) {
            maior = n2;
            meio = n3;
            menor = n1;
        } else if (n3 < n1 && n1 < n2) {
            maior = n2;
            meio = n1;
            menor = n3;
        } else if (n1 < n2 && n2 < n3) {
            maior = n3;
            meio = n2;
            menor = n1;
        } else if (n2 < n1 && n1 < n3) {
            maior = n3;
            meio = n1;
            menor = n2;
        }
        System.out.println(maior + " | " + meio + " | " + menor);
    }
}
