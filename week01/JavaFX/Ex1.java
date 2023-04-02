import java.util.Scanner;

public class Ex1 {
  public static void main(String[] args) {    
    System.out.print (  "Enter total number of items: ");
    Scanner scan = new Scanner(System.in);
    int size = scan.nextInt();
  
    double[] prices = new double[size];
    System.out.print ("Enter the prices for " + size + " items: ");
    for (int i = 0; i < size; i++)
      prices[i] = scan.nextDouble();
  
    // 1 line print
// System.out.println ("The prices: " + Arrays.toString(prices));

    System.out.print ("The prices: ");
    for (int i = 0; i < size; i++)
      System.out.print (prices[i] + " ");
    System.out.println();

    double sum = 0;
    for (int i = 0; i < size; i++)
      sum += prices[i];

    System.out.println ("Sum of all items = " + sum);
    scan.close();
  }
}
