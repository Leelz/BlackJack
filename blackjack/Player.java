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

  public int getHandValue() {
    return hand.getValue();
  }

  public void addCardToHand(Card card) {
      hand.addDealtCardToHand(card);
    }

}