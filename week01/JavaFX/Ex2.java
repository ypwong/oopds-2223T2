import java.util.ArrayList;
import java.util.Scanner;

public class Ex2 {
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);
    
    ArrayList<String> words = new ArrayList<>();

    String word;
    boolean zero_entered = false;
    do {
      System.out.print ("Enter a word (0 to end): ");
      word = input.next();
      if (word.equals("0"))
        zero_entered = true;
      else
        words.add (word);    
    } while (!zero_entered);

    // 1 line print
    // System.out.println ("You entered: " + words);
    
    System.out.print ("You entered: ");
    for (int i = 0; i < words.size(); i++)
      System.out.print (words.get(i) + " "); 
    System.out.println ();
      
    boolean ascending = true;
    boolean duplicate = false;
    for (int i = 0; i < words.size()-1; i++) {
      if (words.get(i).compareTo(words.get(i+1)) > 0)
        ascending = false;
      
      for (int j = i+1; j < words.size(); j++)
        if (words.get(i).equals(words.get(j)))
          duplicate = true;
    }
  
    System.out.println ("Ascending: " + ascending);
    System.out.println ("Duplicate: " + duplicate);
    input.close();
  }
  
}
