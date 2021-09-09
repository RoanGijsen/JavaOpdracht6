import java.util.Scanner;
import java.util.Arrays;

public class Opdracht6 
{
	public static void main(String[] args)
	{
		
	@SuppressWarnings("resource")
	Scanner sc = new Scanner(System.in);
	
	// getting the input required
	System.out.println("Zeg iets");
    String s = sc.nextLine();
    
    // Converting input string to character array
    char charArray[] = s.toCharArray();
    Arrays.sort(charArray);

    // Returning new sorted string
    
    String alfabetisch = String.valueOf(charArray);
    System.out.println("dit is nu alfabetisch " + alfabetisch);  
	}
	 
    
        
}
