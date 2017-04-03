import java.util.concurrent.ThreadLocalRandom;

public class AddAPennyThread extends Thread {
  private PiggyBank bank;

  public AddAPennyThread( PiggyBank bank ) {
    this.bank = bank;
  }
  
  public void run() {
    int newBalance = bank.getBalance() + 1;

    try {
      Thread.sleep( 5 );
    } catch( InterruptedException e ) {
      System.out.println( "Interrupted" );
    }

    bank.setBalance( newBalance );
  }
}