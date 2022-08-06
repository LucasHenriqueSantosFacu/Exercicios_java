/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.lucas_java.exercico2;
import java.util.Scanner;
/**
 *
 * @author lucas
 */
public class Exercico2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sexo,nome,estado;
        Double temp;
        
        System.out.println("Informe seu nome:");
        nome =sc.nextLine();
        System.out.println("Informe seu sexo F/M");
        sexo =sc.nextLine();
        System.out.println("Informe o seu estado civil:");
        estado =sc.nextLine();
        if(sexo.equals("F")){
            if(estado.equals("casada")){
                System.out.println("Informe o tempo de casamento: ");
                temp =sc.nextDouble();
                System.out.println("Resultados Informados"+ nome+" "+sexo+" "+estado+" "+temp);
            }
        }else{
          System.out.println("Resultados Informados"+ nome+" "+sexo+" "+estado);   
        }
    }
}
