import static org.junit.Assert.*;
import org.junit.*;
import blackjack.*;

public class CardTest {

  Card card;
  
  @Before 
  public void before(){
    card = new Card(RankType.JACK, SuitType.HEART);
  }

  @Test
    public void canGetSuit() {
      assertEquals(SuitType.HEART, card.getSuit());
    }

    @Test
    public void canGetRank() {
      assertEquals(RankType.JACK, card.getRank());
    }

    @Test
    public void getRankValue() {
      assertEquals(10, card.getRankValue());
    }

    @Test
      public void canPrintCard() {
      card.printCard();
    }

}