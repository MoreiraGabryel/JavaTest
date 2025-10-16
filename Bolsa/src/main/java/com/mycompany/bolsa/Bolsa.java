/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bolsa;

import java.util.Scanner;

/**
 *
 * @author Pichau
 */
public class Bolsa {

    public static void main(String[] args) {
        double valorBolsa;
        int tempoEstagio;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digie o valor da Bolsa:");
        valorBolsa = sc.nextDouble();
        System.out.println("Digite o tempo de estágio em meses:");
        tempoEstagio = sc.nextInt();
        sc.close();
        int criterio = 24;
        if (
            (valorBolsa >=750.00 && valorBolsa <= 950.00)
            &&
            (tempoEstagio>= criterio)
            ){
        System.out.println("\nParticipara do treinamento");
    }else{
            System.out.println("\nNão participará");
            }
        }
    }

