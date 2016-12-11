import static org.junit.Assert.*;
import org.junit.*;
import blackjack.*;
import java.util.*;

public class DeckTest {
  
  Deck deck;
  
  @Before 
  public void before(){
    deck = new Deck(new ArrayList<Card>());
  }

  @Test
    public void canBuildDeck() {
      assertEquals(52, deck.getCards().size());
    }

}