/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.equacao;

import java.util.Scanner;

/**
 *
 * @author Pichau
 */
public class Equacao {

    public static void main(String[] args) {
        double a,b,c,delta , x1 ,x2 ; 
        Scanner sc =  new Scanner (System.in);
        System.out.println("Digite o valor de a:");
            a = sc.nextDouble();
            System.out.println("Digite o valor de b :");
                b =sc.nextDouble();
                 System.out.println("Digite o valor de c :");
                 c = sc.nextDouble();
                    delta = (b*b)- 4* a* c;
                    x1 = (- b  + Math.sqrt(delta))/(2*a);
                         System.out.println("O valor de X1 é" + x1);
                         x2 = (-b + Math.sqrt(delta)) /  ( 2*a);
                              System.out.println("O Valor de X2 é :" + x2);
sc.close();                         
                    
                    
                
            
    }

    }

