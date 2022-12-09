import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;
    

public class Baralho {
    public static final int Tamanho = 40;
    private ArrayList <Card> baralho;
    private Card trunfoCard;
    
    public Baralho() {
        baralho = new ArrayList <Card> (Tamanho);
        shuffle();
        trunfoCard = baralho.get(0);
    }

    private void shuffle() {
         Random rnd = new Random();
         for(int i = Tamanho - 1; i > 0; --i){
             trocarCard(i, rnd.nextInt(i));
             }
         
             trocarCard(0, rnd.nextInt(baralho.Tamanho() - 1 ));    
    }

    private void trocarCard(int index1, int index2) {
                Card primeiroCard = baralho.get(index1);
    }

  
    }
    
      
    
}
