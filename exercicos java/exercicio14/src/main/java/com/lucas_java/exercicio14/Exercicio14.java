/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.lucas_java.exercicio14;
import java.util.Scanner;
/**
 *
 * @author lucas
 */
public class Exercicio14 {

    public static void main(String[] args) {
         int lado;
         Scanner sc = new Scanner(System.in);
        double area, medida, altura;
        System.out.println("Quantos lados tem?");
        lado = sc.nextInt();
        System.out.println("Informe em CM a medida do lado");
        medida = sc.nextDouble();

        if (lado < 3) {
            System.out.println("NÃO É UM POLÍGONO");
        } else if (lado > 5) {
            System.out.println("POLÍGONO NÃO IDENTIFICADO");
        }
        switch (lado) {
            case 3:
                // Considerando raiz de 3 como 1.7
                altura = (medida * 1.7) / 2;
                area = medida * altura / 2;
                System.out.println("TRIÂNGULO");
                System.out.println("Aréa: " + String.format("%.2f", area) + "cm²");
                break;
            case 4:
                System.out.println("QUADRADO");
                area = medida * medida;
                System.out.println("Área: " + String.format("%.2f", area) + "cm²");
                break;
            case 5:
                System.out.println("PENTÁGONO");
                break;
        }
    }
}
