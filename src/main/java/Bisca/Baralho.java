package Bisca;

import java.util.ArrayList;
import java.util.Random;


public class Baralho {
    public static int Tamanho = 40;
    private ArrayList <Carta> Baralho;
    public String[] nipes = {"Ouro","Copas", "Espadas", "Paus"};
    public String[] faces = {"As", "2", "3", "4", "5", "6", "7", "Valete", "Dama","Rei"};

private void EmbaralharOBaralho() {
         Random Embaralhar = new Random();
         for(int i = Tamanho - 1; i > 0; --i){
             trocarCarta(i, Embaralhar.nextInt(i));
             
             }
             
    }

    private void trocarCarta(int i, int nextInt) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
      
