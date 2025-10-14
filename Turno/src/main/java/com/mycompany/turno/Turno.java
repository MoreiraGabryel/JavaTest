/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.turno;

import java.util.Scanner;

/**
 *
 * @author Pichau
 */
public class Turno {

    public static void main(String[] args) {
        String turno;
        double horasTrabalhadas,valorHora,salario;
        try (Scanner sc = new Scanner (System.in)) {
            System.out.println("Escreva o seu turno de trabalho \n N para Noturno\n D para diurno\n V para vespertino:");
            turno = sc.nextLine();
            System.out.println("Digite a quantidade de horas trabalhadas:");
            horasTrabalhadas = sc.nextDouble();
            if (turno.equalsIgnoreCase("N")){
                valorHora = 45.00;
            }else {
                valorHora = 37.50 ;
            }
            salario = horasTrabalhadas * valorHora;
            System.out.println("Seu Salário é de :R$"+salario);
        }
                
        
    }
}
