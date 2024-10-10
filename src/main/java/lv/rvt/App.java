package lv.rvt;

import java.util.*;

public class App 
{
    public static void main( String[] args ){
        Scanner scanner = new Scanner(System.in);
        int sk = 0;
        int sum = 0;

        while (true) {
            System.out.println("Give a number");
            int num = Integer.valueOf(scanner.nextLine());

            if (num == 0) {
                break;
            }

            if (num > 0 || num < 0) {
                sk = sk + 1;
                sum = sum + num;
            }


        }
       
        if (sk != 0) {

            System.out.println("Number of numbers: " + sk);
            System.out.println("Sum of number: " + sum);
        }
       
    }
 
}

  
