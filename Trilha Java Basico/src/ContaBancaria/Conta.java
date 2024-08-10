/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ContaBancaria;

import java.util.Scanner;

/**
 *
 * @author digol
 */
public class Conta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        int numero;
        String agencia, nomeCliente;
        double saldo;
        
        System.out.println("Por favor, digite o número da Conta!");
        numero = ler.nextInt();
        
        System.out.println("Agora digite o número da Agência.");
        agencia = ler.next();
        
        System.out.println("Por favor, agora digite seu Nome!");
        nomeCliente = ler.next();
        
        System.out.println("Por fim, digite o seu saldo.");
        saldo = ler.nextDouble();
        
        System.out.printf("\nOlá %s, obrigado por criar uma conta em nosso banco"
                + " sua agência é %s, conta %d, e seu saldo %2f já está disponivel pra saque\n", 
                nomeCliente, agencia, numero, saldo);
    }
    
    }
    

