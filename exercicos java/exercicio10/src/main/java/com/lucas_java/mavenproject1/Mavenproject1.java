/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.lucas_java.mavenproject1;
import java.util.Scanner;
/**
 *
 * @author lucas
 */
public class Mavenproject1 {

    public static void main(String[] args) {
         double l1, l2, l3;
        String tipo;
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe os três lados do triângulo: ");
        l1 = sc.nextDouble();
        l2 = sc.nextDouble();
        l3 = sc.nextDouble();
        if (!(l1 + l2 > l3 && l2 + l3 > l1 && l1 + l3 > l2)) {
            throw new RuntimeException("Não é um triângulo");
        }

        if (l1 == l2 && l2 == l3) {
            tipo = "Equilátero";
        } else if (l1 == l2 || l1 == l3 || l2 == l3) {
            tipo = "Isósceles";
        } else {
            tipo = "Escaleno";
        }

        System.out.println("Tipo: " + tipo);

    }
}
