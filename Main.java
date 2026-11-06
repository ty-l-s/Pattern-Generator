
// Tyler Skibo
// 10/28/2026
// This class contains various methods that create patterns with characters

import java.util.Scanner;


public class Main {
     public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Patterns myPatterns = new Patterns();
       
        while (true) {
            String input = scan.nextLine();
            if (input.contains("stars")){
                int rows = (int)(Math.random()*10)+2;
                myPatterns.stars(rows);
            }
            else if (input.contains("triangle")){
                int rows = (int)(Math.random()*10)+2;
                myPatterns.triangle(rows);
            }
            else if (input.contains("odds")){
                int start = 9;
                myPatterns.odds(start);
            }
            else if (input.contains("eo")){
                int maxE = 4;
                myPatterns.eo(maxE);
            }
            else if (input.contains("pyramid")){
                int rows = 6;
                myPatterns.pyramid(rows);
            }
            else {
                System.out.println("not a valid command");
            }
       }
       
    }
}
