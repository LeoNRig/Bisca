package Bisca;

import java.util.TreeMap;
import java.util.ArrayList;
import java.util.Map;
import java.util.List;

public class Baralho {
    
    public String[] nipes = {" Ouro","Copas", "Espadas", "Paus"};
    
    boolean imprimirOBaralho;
    
    public List<String> colocandoValoresNasCartasDoBaralho(){
        
        Map<String, Integer> value = new TreeMap<>();
        value.put("2", 0);
        value.put("3", 0);
        value.put("4", 0);
        value.put("5", 0);
        value.put("6", 0);
        value.put("Dama", 2);
        value.put("Valete", 3);
        value.put("Rei", 4);
        value.put("Ás", 11);
        value.put("7", 10);
        
        List<String> cartasDoBaralho = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            for (String key : value.keySet()) {
                cartasDoBaralho.add(key + nipes[i]);
            }
        }
        
        return cartasDoBaralho;
    }
    
    public String imprimirOBaralho(){
        return "Cartas: " + colocandoValoresNasCartasDoBaralho();
    }
    
}

      
