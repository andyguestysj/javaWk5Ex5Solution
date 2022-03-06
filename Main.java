import java.util.Scanner;

class Main {
  public static void main(String[] args) {   

    Numeric asNumeric = new Numeric();
    English asEnglish = new English();
    Stars asStars = new Stars();
    French asFrench = new French();

    System.out.println("Enter a number between 1 and 5");

    String inputString;
    Scanner scanner = new Scanner(System.in);    
    inputString = scanner.nextLine();
    inputString = inputString.toLowerCase();

    int number;
    try {
      number = Integer.parseInt(inputString);
    }
    catch (NumberFormatException e)
    {
      number = 1;
    }
       
    scanner.close();   

    System.out.println("Output");

    asNumeric.print(number);
    asStars.print(number);
    asEnglish.print(number);
    asFrench.print(number);



    }

}