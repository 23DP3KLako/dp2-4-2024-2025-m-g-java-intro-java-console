package lv.rvt;

import java.util.*;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number: ");
        int fa = Integer.valueOf(scanner.nextLine());
        int factorial = 1;
        
        

        for ( i = 1; i <= fa; i++) {
            factorial = factorial * i;
        }
    
    System.out.println("Factorial: " + fa);
    }
 
}

  
