package Bisca;

public class Partida {

    public static void main (String [] args){

        System.out.println("Bem vindo! Sente-se e vamos jogar Bisca! ");
        System.out.println("Distribuindo cartas ...");

        Baralho baralho = new Baralho();
        System.out.println(baralho.imprimirOBaralho());

        Jogadores jogador = new Jogadores();
        System.out.println(jogador.imprimirCartasDoJogador());

        Baralho trunfo = new Baralho();
        System.out.println(trunfo.trunfoDaPartida());

        System.out.println(jogador.imprimirCartaSelecionada());
        System.out.println(jogador.imprimirCartasDoJogador());
    }
}