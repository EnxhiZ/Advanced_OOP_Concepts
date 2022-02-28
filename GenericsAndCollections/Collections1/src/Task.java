import java.util.ArrayList;

public class Task {
    public static void main(String[] args){
        Deck d = new Deck();
        // Draw some random cards:
        System.out.println(d.dealCard());
        System.out.println(d.dealCard());

        ArrayList<Card> hand = new ArrayList<>();
        hand.add(d.dealCard());
        hand.add(d.dealCard());
        hand.add(d.dealCard());

        System.out.println("Hand is:"+hand);
        System.out.println("Cards add:"+addCards(hand));


        for(Card card : d) {
            System.out.println(card);
        }

    }

    public static int addCards(ArrayList<Card> hand){
        int totval = 0;
        for (Card card : hand){
            if (card.getValue().toString() == "Ace")
                totval +=1;
            else if (card.getValue().toString() == "Jack")
                totval += 11;
            else if (card.getValue().toString() == "Queen")
                totval +=12;
            else if (card.getValue().toString() == "King")
                totval += 13;
            else
                totval += Integer.valueOf(card.getValue().toString());
        }
        return totval;
    }
}