import static org.junit.Assert.*;
import org.junit.*;
import blackjack.*;
import java.util.*;

public class GameTest {
  
  Game game;
  
  @Before 
  public void before(){
    game = new Game(new ArrayList<Card>());
  }

  @Test
    public void canBuildDeck() {
      assertEquals(52, game.getCards().size());
    }

}