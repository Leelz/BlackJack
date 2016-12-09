import static org.junit.Assert.*;
import org.junit.*;
import blackjack.*;

public class CardTest {

  Card card;
  
  @Before 
  public void before(){
    card = new Card(SuitType.HEART, ValueType.JACK);
  }

  @Test
    public void canGetSUIT() {
      assertEquals(SuitType.HEART, card.getSUIT());
    }

    @Test
    public void canGetVALUE() {
      assertEquals(ValueType.JACK, card.getVALUE());
      System.out.println(card.getValue());
    }


}