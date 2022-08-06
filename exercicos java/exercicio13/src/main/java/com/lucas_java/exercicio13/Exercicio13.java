/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.lucas_java.exercicio13;
import java.util.Scanner;
/**
 *
 * @author lucas
 */
public class Exercicio13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lado;
        double area, medida, altura;
        System.out.println("Quantos lados tem?");
        lado = sc.nextInt();
        System.out.println("Informe em CM a medida do lado");
        medida = sc.nextDouble();

        switch (lado) {
            case 3:
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
