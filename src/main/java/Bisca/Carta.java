package Bisca;

import java.util.List;

public class Carta {

    static Carta Topo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    private String face;
    private String naipe;
    private int valor;

    public Carta(String face, String naipe, int calcValor) {
        this.face = face;
        this.naipe = naipe;
        this.valor = this.calcValor();
    }

    @Override
    //construtor
    public String toString() {
        return this.face + this.naipe;
    }

    public String pegarFace() {
        return this.face;
    }

    public String pegarNaipe() {
        return this.naipe;
    }

    public int pegarValor() {
        return this.valor;
    }
// cartas que possuem valores
    private int calcValor() {
        int resultado;
        switch (this.face) {
        case "As":
            resultado = 11;
            break;
        case "Rei":
            resultado = 4;
            break;
        case "Dama":
            resultado = 2;
            break;
        case "Valete":
            resultado = 3;
            break;
        case "7":
            resultado = 10;
            break;
        default:
            resultado = 0;
            break;
        }

        return resultado;
    }

    @Override
    //comparação de objetos de class
    public boolean equals (Object move) {
        if(move instanceof Carta ) {
            return this.toString().equals(((Carta)move).toString());
        }

        return false;
    }

}