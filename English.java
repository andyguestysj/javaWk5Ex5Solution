public class English extends Printer {

  public void print(int x){
    switch(x){
      case 1:
              System.out.println("One");
              break;
      case 2:
              System.out.println("Two");
              break;
      case 3:
              System.out.println("Three");
              break;
      case 4:
              System.out.println("Four");
              break;
      case 5:
              System.out.println("Five");
              break;
      default:
              System.out.println("oops");
              break;
    }
  }

}