package blackjack;
import java.util.*;

public class Deck {

  private ArrayList<Card> deck;


  public Deck(ArrayList<Card> deck) {
     this.deck = deck;
     buildDeck();
   }

  public void buildDeck() {
    for(SuitType suit : SuitType.values())  {
      for (RankType rank : RankType.values()) {
          deck.add(new Card(rank, suit));
      }
    }
  }

public void shuffle() {
 Collections.shuffle(deck);
}

public Card dealCard() {
    Card dealtCard = deck.remove(0);
    return dealtCard;
}

public void printDeck() {
    for (Card card : deck){
      System.out.println(card.getRank() + " of " + card.getSuit());
    }
  }

  public int deckSize(){
      return deck.size();
    }

}