/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poocarro;

/**
 *
 * @author Admin
 */
public class POOCarro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Carro carro01 = new Carro();
        
        carro01.marca = "Toyota";
        carro01.modelo = "Hilux";
        carro01.ano = 2023;
        carro01.acelerar();
        carro01.exebirInfo();   
        
        Carro carro02 = new Carro();
        carro02.marca = "Palio";
        carro02.modelo = "Fiat";
        carro02.ano = 2011;
        carro02.exebirInfo(); 
    }

}
