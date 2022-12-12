package Bisca;
import java.util.Scanner;

public class Partida {
   
    public static void main (String [] args){
        
        int cartaEscolhida;
        
        
        System.out.println("Bem vindo! Sente-se e vamos jogar Bisca! ");
        System.out.println("Distribuindo cartas ...");
        
        Baralho baralho = new Baralho();
        
        Jogadores jogador1 = new Jogadores();
        System.out.println("Suas Cartas, jogador1 :" + jogador1.imprimirCartasDoJogador());
        
        Jogadores jogador2 = new Jogadores();
        System.out.println( "Suas Cartas, jogador2 :" + jogador2.imprimirCartasDoJogador());
        
        Baralho trunfo = new Baralho();
        System.out.println(trunfo.trunfoDaPartida());
        
        Scanner posicaoCarta = new Scanner(System.in);
        
        System.out.printf("Qual carta você quer jogar jogador1? 1, 2 ou 3?: ");
        cartaEscolhida = posicaoCarta.nextInt();
        System.out.println(jogador1.jogarCarta(cartaEscolhida));
        
        System.out.printf("Qual carta você quer jogar jogador2? 1, 2 ou 3?: ");
        cartaEscolhida = posicaoCarta.nextInt();
        System.out.println(jogador2.jogarCarta(cartaEscolhida));
    }
}