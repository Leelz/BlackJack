package blackjack;

import java.util.*;

public class Card {

  private RankType rank;
  private SuitType suit; //Ace = 1, Jack-King = 11-13
  private int value;

//Constructor
  public Card(RankType rank, SuitType suit, int value) {
    this.rank = rank;
    this.suit = suit;
    this.value = value;
  }

  public RankType getRank() {
    return this.rank;
  }

  public SuitType getSuit() {
    return this.suit;
  }

  public int getValue() {
      return value;
    }

}