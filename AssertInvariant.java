import java.util.Random; 

public final class AssertInvariant {
    public static void main(String... arguments) {
      Random random = new Random();
      int randomNumber = random.nextInt(5);
      AssertInvariant number = new AssertInvariant(randomNumber);
      number.processMethod();
      
    }

    private int randomNumber;

    public AssertInvariant(int randomNumber) {
        this.randomNumber = randomNumber;
    }

    public void processMethod() {
        switch(randomNumber) {
            case 0:
                System.out.println("Amount is: " + randomNumber);
            break;
          
            case 1:
                System.out.println("Amount is: " + randomNumber);
            break;
          
            case 2:
                System.out.println("Amount is: " + randomNumber);
              break;
          
            default:
               assert false : ("Number should not be bigger than 2. Current number is: " + randomNumber);
          }
    }
}
  