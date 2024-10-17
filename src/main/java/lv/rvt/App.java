package lv.rvt;

import java.util.*;

public class App 
{
    public static void main( String[] args ) {
        divisibleByThreeInRange(2, 10);
     
        
    }

    public static void divisibleByThreeInRange(int begining, int end) {
        for (int i = begining; i<= end; i++ ) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }
 
}

  
