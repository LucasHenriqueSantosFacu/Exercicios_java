/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.lucas_java.exercicio3;
import java.util.Scanner;
/**
 *
 * @author lucas
 */
public class Exercicio3 {

    public static void main(String[] args) {
        double a, b, c,delta;
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe A");
        a = sc.nextDouble();
        if (a == 0) {
            throw new RuntimeException("Se A é 0 não é equação do 2º grau");   
        }
        
        System.out.println("Informe B");
        b = sc.nextDouble();
        System.out.println("Informe C");
        c = sc.nextDouble();

        delta = ((Math.pow(b, 2)) - (4 * a * c)) / (2 * a);

        if (delta < 0) {
            System.out.println("A equação não possui raízes reais");
            throw new RuntimeException("A equação não possui raízes reais");
        } else if (delta == 0) {
            System.out.println("A equação possui apenas uma raiz real");
        } else if (delta > 0) {
            System.out.println("A equação possui duas raízes reais");
        }
    }
}
