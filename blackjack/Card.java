package blackjack;

import java.util.*;

public class Card {

  private ValueType value;
  private SuitType suit; //Ace = 1, Jack-King = 11-13

//Constructor
  public Card(ValueType a_value, SuitType a_suit) {
    this.value = a_value;
    this.suit = a_suit;
  }

  public ValueType getValue() {
    return this.value;
  }

  public HandType getSuit() {
    return this.suit;
  }

}