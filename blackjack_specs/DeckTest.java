import static org.junit.Assert.*;
import org.junit.*;
import blackjack.*;
import java.util.*;

public class DeckTest {
  
  Deck deck;
  
  @Before 
  public void before(){
    deck = new Deck();    
  }

  @Test
    public void canBuildDeck() {
      assertEquals(52, deck.deckSize());
    }

    @Test
    public void deckCanShuffle() {
      deck.printDeck();
      deck.shuffle();
      deck.printDeck();
    }

    @Test
      public void canRemoveCardFromDeck() {
        deck.dealCard();
        assertEquals(51, deck.deckSize());
      }

}