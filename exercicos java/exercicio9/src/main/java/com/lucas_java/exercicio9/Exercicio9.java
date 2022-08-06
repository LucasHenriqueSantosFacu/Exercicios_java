/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.lucas_java.exercicio9;
import java.util.Scanner;
/**
 *
 * @author lucas
 */
public class Exercicio9 {

    public static void main(String[] args) {
         double altura, peso;
        String sexo;
        Scanner sc = new Scanner(System.in);
        System.out.println("Altura: ");
        altura = sc.nextDouble();
        System.out.println("Sexo: F/M");
        sexo = sc.next();

        if (sexo.equals("F")) {
            peso = (62.1 * altura) - 44.7;
        } else {
            peso = (72.7 * altura) - 58;
        }
        System.out.println("Peso ideal: " + String.format("%.2f", peso));

    }
}
