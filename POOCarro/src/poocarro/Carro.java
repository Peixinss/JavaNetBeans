/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poocarro;

/**
 *
 * @author Admin
 */
public class Carro {
    String marca;
    String modelo;
    int ano;
    double velocidadeAtual = 0;
    boolean motorLigado = false;
    
    void acelerar(){
        System.out.println("Estamos Acelerando o Carro!");
    }
    void exebirInfo(){
        System.out.printf(" \n Marca: %s \n Modelo: %s \n Ano: %d\n ",marca, modelo, ano);
    }
    
        
}
