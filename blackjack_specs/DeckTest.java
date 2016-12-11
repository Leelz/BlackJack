import static org.junit.Assert.*;
import org.junit.*;
import blackjack.*;
import java.util.*;

public class DeckTest {
  
  Deck deck;
  Player player;
  
  @Before 
  public void before(){
    deck = new Deck(new ArrayList<Card>());
    player = new Player("Snoop", new Hand());
  }

  @Test
    public void canBuildDeck() {
      assertEquals(52, deck.getCards().size());
    }

    @Test
    public void deckCanShuffle() {
      deck.printDeck();
      deck.shuffle();
      deck.printDeck();
    }

    @Test
      public void canDealCard() {
        deck.dealCard(player);
        assertEquals(1, player.getHandValue());
      }

    // @Test
    //   public void deckRemovesCardFromPackWhenDealing() {
    //     deck.drawCard();
    //     assertEquals(51, deck.sizeOfDeck());
    //   }

}