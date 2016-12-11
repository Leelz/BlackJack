import static org.junit.Assert.*;
import org.junit.*;
import blackjack.*;
import java.util.*;

public class PlayerTest {

  Player player;
  Hand hand;
  Card card;
  
  @Before 
  public void before(){
    hand = new Hand();
    player = new Player("Snoop", new Hand());
    card = new Card(RankType.JACK, SuitType.HEART);
  }

  @Test
   public void hasName() {
     assertEquals("Snoop", player.getName());
   }

   @Test
     public void canAddCardAndGetValue() {
       player.addCardToHand(card);
       assertEquals(1, player.getHandValue());
   }

}