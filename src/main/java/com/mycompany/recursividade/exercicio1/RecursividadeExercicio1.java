/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.recursividade.exercicio1;


public class RecursividadeExercicio1 {

    public static void main(String[] args) {
        
        int resultado = soma(50);
        System.out.println("A soma de 0 a 50 é: " + resultado);
        
    }
    
    public static int soma(int n) {
        
        if (n == 0) {
            
            return 0;
            
        } else {
            
            return n + soma(n- 1);
            
        }
    }
}
