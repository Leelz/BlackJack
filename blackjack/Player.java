package blackjack;
import java.util.*;

public class Player {

  private String name;
  private Hand hand;

//Constructor
  public Player(String name, Hand hand) {
    this.name = name;
    this.hand = hand;
  }

  public String getName() {
    return this.name;
  }

  public void dealCardToHand(Card card) {
      hand.canDealCardToHand(card);
    }

  public int handSize(){
      return hand.getCards().size();
    }

  public int getHandValue() {
    return hand.getValue();
  }

}