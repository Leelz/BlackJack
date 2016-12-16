package blackjack;
import java.util.*;

public class Player {

  String name;
  Hand hand;

//Constructor
  public Player(String name, Hand hand) {
    this.name = name;
    this.hand = hand;
  }

  public String getName() {
    return this.name;
  }

  public String getHand() {
    return this.hand;
  }

  public int handSize(){
    return hand.getHand().size();
  }

  public int getHandValue() {
    return hand.getValue();
  }

}