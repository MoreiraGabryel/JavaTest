/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.raizes;

import java.util.Scanner;

/**
 *
 * @author Pichau
 */
public class Raizes {

    public static void main(String[] args) {
        double b,a,c;
        Scanner sc= new Scanner(System.in);
        System.out.println("Digite o valor de a");
        a = sc.nextDouble();
        System.out.println("Digite o valor de b");
        b = sc.nextDouble();
        System.out.println("Dgite o valor de c");
        c = sc.nextDouble();
        if (a==0){
            System.out.println("Não é uma equação do Segundo Grau");
        } else{
        double delta = b*b -4*a*c;
        if (delta < 0){
            System.out.println("Não existem raízes reais");
        } else if (delta==0){
        double raiz = -b  /(2*a);
        System.out.println("Existe uma raiz real:"+raiz);
        } else {
                double raiz1 = (-b + Math.sqrt(delta))/(2*a);
                double raiz2 = (-b - Math.sqrt(delta)) /(2*a);
                System.out.println("Existem duas raizes reais,"+raiz1+"e,"+raiz2);
                }
        sc.close();
                }
    }
}
