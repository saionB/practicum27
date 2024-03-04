import java.util.Random;

public class Main {
  public static void main(String[] args) {

    Object obj = null;
    Random rand = new Random();

    // generate random number from up to but excluding 4
    int n = rand.nextInt(1, 4);

    switch(n) {
      case 1: obj = new Dishwasher("1243023"); break;
      case 2: obj = new Toaster("Ad9201"); break;
      case 3: obj = new Oven("F4231211KL"); break;
    }

    describeIt(obj);
  }

  public static void describeIt(Object something) {
    if (something instanceof Dishwasher) {
      Dishwasher dishwasher = (Dishwasher) something;
      System.out.println("Dishwasher  Model Number: " + dishwasher.getModelNumber());
    } else if (something instanceof Toaster) {
      Toaster toaster = (Toaster) something;
      System.out.println("Toaster  Model Number: " + toaster.getModelNumber());
    } else if (something instanceof Oven) {
      Oven oven = (Oven) something;
      System.out.println("Oven  Model Number: " + oven.getModelNumber());
    } else {
      System.out.println("Unknown object");
    }   
  }  
}
