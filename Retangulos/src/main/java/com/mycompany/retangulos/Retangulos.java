/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.retangulos;

import java.util.Scanner;

/**
 *
 * @author Pichau
 */
public class Retangulos {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("--Digite os Dados do Retangulo 1 :-- ");
        System.out.print("--Digite a Base do Retangulo 1 :--");
        double b1 = sc.nextDouble(); 
//LÊ a base do retangulo 1
        System.out.print("--Digite a altura do Retanlgulo 1:--");
        double a1 = sc.nextDouble(); // Lê A ALTURA DO RETANGULO 1 
        
        //calcula a área do retangulo 1 
         double A1 = b1 * a1;
         
        System.out.println("--Digite os Dados do Retangulo 2 :-- ");
        System.out.print("--Digite a Base do Retangulo 2 :--");
        double b2 = sc.nextDouble(); //LÊ a base do retangulo 2
        System.out.print("--Digite a altura do Retanlgulo 2:--");
        double a2 = sc.nextDouble(); // Lê A ALTURA DO RETANGULO 2
        
        double A2 = b2 * a2 ;
        
        
        //Calculo Finais 
        //Calcula a area total
        double AT = A1+A2;
        sc.close ();
        // Visualizar o Resultados ----
        
        System.out.println("\n--Resultados");
        System.out.println ("Área do Retangulo 1 (A1):"+ A1);
        System.out.println ("Area do Retangulo 2 (A2:" + A2);
        System.out.println("Área Total:"+AT);
        
 
                       
         
        
        
        
       
        
    }
}
