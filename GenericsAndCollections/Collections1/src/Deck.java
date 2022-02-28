
import java.util.LinkedList;
import java.util.List;
import java.util.Iterator;

public class Deck implements Iterable<Card>{
    private List<Card> deck;
    private String[] suits = {"Hearts","Clubs","Diamonds","Spades"};

    public Deck() {
        this.deck = new LinkedList<Card>();
        for (String suit: suits){
            for(int i = 2; i <= 10; i++)
                deck.add(new Card<Integer,String>(i, suit));

            deck.add(new Card<String, String>("Jack", suit));
            deck.add(new Card<String, String>("Queen", suit));
            deck.add(new Card<String, String>("King", suit));
            deck.add(new Card<String, String>("Ace", suit));
        }
    }

    public Card dealCard(){
        int draw = (int) (Math.random() * deck.size() - 1);
        Card card = deck.get(draw);
        deck.remove(draw);
        return card;

    }

    public int size(){
        return deck.size();
    }

    @Override
    public Iterator<Card> iterator() {
        DeckIterator deIt = new DeckIterator(this);
        return deIt;
    }
}
