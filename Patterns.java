// Class Author: Tyler Skibo
// Date Created: 10/28/2026
// General Description: This class contains various methods that create patterns with characters

public class Patterns {
    
    //precondition: input must be a non-zero non-negative integer
    //postcondition: a pattern of stars (*) will be printed out, where the first row has one * 
    //and every row after has two more stars than the row before it, the amount of rows is the inputted int
    public void stars(int rows){
        int i = 1;
        while (i <= rows){
            System.out.print("*");
            int t = 1;
            while(t < i){
                System.out.print("**");
                t++;
            }
            System.out.println("");
            i++;
        }
    }

    //preconditon: input must be a non-zero non-negative integer
    //postcondition: a pattern if numbers will be printed out, where the first row has one 1, 
    //the second row has two 2s, and so on for the amount of rows inputted
    public void triangle(int rows){
        int i = 1;
        while (i <= rows){
            int t = 1;
            while(t <= i){
                System.out.print(i);
                t++;
            }
            System.out.println("");
            i++;
        }
    }

    //preconditon: input must be a non negative odd integer
    //post condition: a pattern if numbers starting with the inputted int will be printed
    //each row has 9 nine, 7 sevens, and so on, only printing rows with odd numbers
    public void odds(int start){
        for (int i = start; i > 0; i-=2){
            for (int t = 0; t < i; t++){
                System.out.print(i);
            }
            System.out.println("");
        }
    }
   
    //preconditon: input must be a non negative integer 
    //post condition: a pyramid of Es and Os will be printed where the middle rows has the amount of Es inputted
    //rows alternate between Es and Os
    public void eo(int maxE){
        int rows = maxE*2 - 1;
        if (!(maxE % 2 == 0)){
            String start = "E";
            for (int i = 1; i <= rows/2 + 1; i++){
                for (int t = 1; t <= i; t++){
                System.out.print(start);
            }
            System.out.println("");
            if (start.equals("O")){
                start = "E";
            }
            else if (start.equals("E")){
                start = "O";
            }
            }
            for (int l = 1; l <= rows/2 +1; l++){
                for (int t = rows/2; t >= l; t--){
                System.out.print(start);
            }
            System.out.println("");
            if (start.equals("O")){
                start = "E";
            }
            else if (start.equals("E")){
                start = "O";
            }
        }
        }
        if (maxE % 2 == 0) {
            String start = "O";
            for (int i = 1; i <= rows/2 + 1; i++){
                for (int t = 1; t <= i; t++){
                System.out.print(start);
            }
            System.out.println("");
            if (start.equals("O")){
                start = "E";
            }
            else if (start.equals("E")){
                start = "O";
            }
            }
            for (int l = 1; l <= rows/2 +1; l++){
                for (int t = rows/2; t >= l; t--){
                System.out.print(start);
            }
            System.out.println("");
            if (start.equals("O")){
                start = "E";
            }
            else if (start.equals("E")){
                start = "O";
            }
        }
        }
        
    }

    //precondition: input must be a non negative integer
    //postcondition: a pattern of numbers where the amout of numbers in each row decrease to form a upside dwon pyramid
    public void pyramid(int rows){
        for (int i = 1; i <= rows ; i++){
            
                for (int l = 1; l < i; l++){
                    System.out.print(" ");
                }
                for (int t = 1; t <= ((rows - i)*2) +1; t++){
                System.out.print(i);
                }
                for (int s = 0; s > i; s++){
                    System.out.print(" ");
                }

            System.out.println("");
        }
    }
}

