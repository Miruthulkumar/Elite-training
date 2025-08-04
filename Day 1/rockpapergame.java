import java.util.Scanner;

public class rockpapergame {
    public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    System.out.print("Player 1 Enter Rock/Paper/Scissors : ");
    String player1 = scan.nextLine();
    System.out.print("Player 2 Enter Rock/Paper/Scissors : ");
    String player2 = scan.nextLine();


    
    if(player1.equals(player2)){
        System.out.println("Draw Try again!");
    }
    else if ((player1.equals("rock") && player2.equals("scissors")) ||
                   (player1.equals("scissors") && player2.equals("paper")) ||
                   (player1.equals("paper") && player2.equals("rock"))) {
            System.out.println("Player 1 wins!");
        } else if ((player2.equals("rock") && player1.equals("scissors")) ||
                   (player2.equals("scissors") && player1.equals("paper")) ||
                   (player2.equals("paper") && player1.equals("rock"))) {
            System.out.println("Player 2 wins!");
        } else {
            System.out.println("Invalid input! Please enter Rock, Paper, or Scissors.");
        }
        scan.close();
    
    
}
}