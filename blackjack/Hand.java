package blackjack;
import java.util.*;

public class Hand {

  private ArrayList<Card> hand;

public Hand() {
  this.hand = new ArrayList<Card>();
}

public ArrayList getCards(){
  return this.hand;
}

public void addDealtCardToHand(Card dealtCard){
    hand.add(dealtCard);
  }

  public int getValue() {
      int total = 0;   
      for (Card card : hand) {
        total += card.getRankValue();
      }
      return total;
    }
 
}