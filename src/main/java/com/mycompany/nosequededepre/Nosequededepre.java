/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.nosequededepre;

/**
 *
 * @author Eric Rodriguez
 */
public class Nosequededepre {
    

            public static void ordenar(){
        for (int a = 0; a < 3; a++) {
            for (int y = 1; y < 1; y++) {
                if(toyota[y].getAllo()>toyota[y].getAllo()){
                    temp=toyota[y-1];
                    toyota[y]=toyota[y-1];
                }
            }
            
        }
    }
            public static void presentar(){
                for (int i = 0; i < 3; i++) {
                    System.out.println("El modelo es"+toyota[i].getModelo());
                    System.out.println("El año del vehiculo es: "+toyota[i].getAllo());
                    System.out.println("El tamaño del baul es: "+toyota[i].getTam_baul());
                }
            }
    public static Turismo  toyota[] = new Turismo[3];
    public static Turismo temp= new Turismo();
    public static void main(String[] args) {
 
        toyota[0]=new Turismo();
        toyota[0].setModelo("Yaris");
        toyota[0].setAllo(2018);
        toyota[0].setTam_baul(3);
        
        toyota[0]=new Turismo();
        toyota[0].setModelo("Corolla");
        toyota[0].setAllo(2020);
        toyota[0].setTam_baul(3);
    
        toyota[0]=new Turismo();
        toyota[0].setModelo("Tercel");
        toyota[0].setAllo(2008);
        toyota[0].setTam_baul(1);
        
        presentar();
        ordenar();
        System.out.println("---------------Ordenando----------------");
        presentar();
    }
}

