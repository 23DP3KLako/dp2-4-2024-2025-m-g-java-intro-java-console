package lv.rvt;

import java.util.*;

public class App 
{
    public static void main( String[] args ) {
        Scanner scanner = new Scanner(System.in);
        printStars(4);
        printStars(4);
        printStars(4);
        printStars(4);

    }
    
    public static void printStars(int number) {
        for(int i = 0; i < number; i++){
            System.out.print("*");
        }
        System.out.println("");
    }
}

  
