package lv.rvt;

import java.util.*;

public class App 
{
    public static void main( String[] args ) {
        Scanner scanner = new Scanner(System.in);
        printTriangle(3);

    }
    
    public static void printTriangle(int size) {
        for(int i = 0; i <= size; i++){
            System.out.println("");
            printStars(i);
        }
        
    }

    public static void printStars(int size) {
        for(int j = 0; j <= size; j++){
            System.out.print("*");
        }
        
    }
}

  
