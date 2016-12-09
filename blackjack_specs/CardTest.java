import static org.junit.Assert.*;
import org.junit.*;
import blackjack.*;

public class CardTest {

  Card card;
  
  @Before 
  public void before(){
    card = new Card(RankType.JACK, SuitType.HEART, 10);
  }

  @Test
    public void canGetSuit() {
      assertEquals(SuitType.HEART, card.getSuit());
    }

    @Test
    public void canGetRank() {
      assertEquals(RankType.JACK, card.getRank());
      System.out.println(card.getRank());
    }

    @Test
    public void canGetValue() {
      assertEquals(10, card.getValue());
      System.out.println(card.getValue());
    }


}