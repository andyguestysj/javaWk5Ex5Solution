public class French extends Printer {

  String[] numbers = {"zero", "un", "deux", "trois", "quatre", "cinq"};

  public void print(int x){
    if (x<0 || x>5) {
      x = 1;
    }
    System.out.println(numbers[x]);
  }
}