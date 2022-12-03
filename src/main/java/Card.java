
/**
 * Card
 */
public class Card {
    private String num;
    private String naipe;
    private int valor;

    public Card(String num, String naipe) {
        this.num = num;
        this.naipe = naipe;
        this.valor = this.calcValor();
    }

    @Override
    //construtor
    public String toString() {
        return this.num + this.naipe;
    }

    public String getNum() {
        return this.num;
    }

    public String getNaipe() {
        return this.naipe;
    }

    public int getValor() {
        return this.valor;
    }
// cartas que possuem valores
    private int calcValor() {
        int result;
        switch (this.num) {
        case "A":
            result = 11;
            break;
        case "K":
            result = 4;
            break;
        case "Q":
            result = 2;
            break;
        case "J":
            result = 3;
            break;
        case "7":
            result = 10;
            break;
        default:
            result = 0;
            break;
        }

        return result;
    }

    @Override
    //comparação de objetos de class
    public boolean equals (Object move) {
        if(move instanceof Card ) {
            return this.toString().equals(((Card)move).toString());
        }

        return false;
    }

}
