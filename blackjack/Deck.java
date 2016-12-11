package blackjack;
import java.util.*;

public class Deck {

  private ArrayList<Card> deck;

public Deck(ArrayList<Card> deck) {
  this.deck = deck;
  buildDeck();
}

public ArrayList getCards(){
  return deck;
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

// public Card DrawCard() {
//   int cardPosition = shuffles.nextInt(Deck.size());
// return Deck.remove(cardPosition);
// }

// public int TotalCardsLeft() {
//   return Deck.size();
// }

}