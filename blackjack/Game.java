package blackJackManagement;

public class Game{
  public static void main (String[] args){

    System.out.println("Hi, let's play Black Jack!");

    System.out.println("What is your name?");

    String name = System.console().readLine();

    Deck deck = new Deck();
    deck.createDeck();
    deck.shuffleDeck();
   
    // Card dealtCard = new Card (deck.deal());
    Hand playerHand = new Hand();
    Hand dealerHand = new Hand();
    Player player = new Player(name, playerHand);
    Dealer dealer = new Dealer();

    System.out.println("Deal to " + name + ":");
      playerHand.addDealtCardToHand(deck.deal());
    System.out.println("Deal to Dealer: ");
      dealerHand.addDealtCardToHand(deck.deal());
    System.out.println("Deal to " + name + ":");
      playerHand.addDealtCardToHand(deck.deal());
    System.out.println("Deal to Dealer: ");
      dealerHand.addDealtCardToHand(deck.deal());

      System.out.println("You have a hand value of "+ playerHand.valueOfHand());
        System.out.println("The cards have been dealt. 'Stick' or 'Twist'?");

        String action = System.console().readLine();

        if(action.equals ("Twist")){
            System.out.println("Deal to " + name + ":");
              playerHand.addDealtCardToHand(deck.deal());
          System.out.println("You have a hand value of "+ playerHand.valueOfHand());
        }

          System.out.println("The dealer has a hand value of "+ dealerHand.valueOfHand());

             if(playerHand.valueOfHand()>21){
                System.out.println("You're Bust! The Dealer wins!");
              }
              else if(dealerHand.valueOfHand()>21){
                System.out.println("Dealer is Bust! You Win!");
              }
              else if(playerHand.valueOfHand()>dealerHand.valueOfHand()){
                System.out.println("You win! Your hand value is greater than the dealers' hand.");
              }
              else{
                System.out.println("You lose! Your hand value is lower than the dealers' hand.");
            }
          }
        }