import java.util.Random;
import java.util.Scanner;

public class Rock_Paper_Scissors {

    public static void main(String[] args) {
        Boolean PlayAgain = true;
        while (PlayAgain) {
            Scanner rounds = new Scanner(System.in);
            System.out.println("Please enter how many rounds you'd like 1-10: ");
            int i = 0;
            String Rounds = rounds.nextLine();
            try {
                i = Integer.parseInt(Rounds);
            } catch (Exception e) {
                System.out.println("please enter int");
                System.exit(0);
            }
            if (i < 1 || i > 10) {
                System.out.println("please make sure value is within range");
                System.exit(0);
                i = 0;
            }
            int k = 0;
            int tie_num = 0;
            int comp_wins = 0;
            int player_wins = 0;
            while (k < i) {
                String playerChoice = RPS_player();
                String compChoice = RPS_comp();
                String winner = Winner(playerChoice, compChoice);

                if (winner.equals("tie")) {
                    System.out.println("it was a tie");
                    tie_num = tie_num + 1;
                } else if (winner.equals("comp")) {
                    System.out.println("the computer won this round");
                    comp_wins = comp_wins + 1;
                } else {
                    System.out.println("player wins this round");
                    player_wins = player_wins + 1;
                }

                k++;
            }
            System.out.println("player wins: " + player_wins);
            System.out.println("computer wins: " + comp_wins);
            System.out.println("Ties: " + tie_num);

            if (player_wins > comp_wins) {
                System.out.println("the player was the overall winner with " + player_wins + " wins");
            } else {
                System.out.println("the computer was the overall winner with " + comp_wins + " wins");
            }

            System.out.println("do you want to play again press: \n 1. for yes \n 2. for no");
            Scanner y = new Scanner(System.in);
            String play = y.nextLine();
            if (play.equals("1")){
                PlayAgain = true;
            } else if (play.equals("2")) {
                PlayAgain = false;
            }else {
                System.out.println("we'll take that as no");
                PlayAgain = false;
            }

        }
    }

    private static String Winner(String playerChoice, String compChoice) {

        String winner = "";
        if (playerChoice == compChoice){
            winner = "tie";
        }else if (playerChoice.equals("rock")  && compChoice.equals("paper")){
            winner = "comp";
        }else if (playerChoice.equals("paper")  && compChoice.equals("rock")){
            winner = "Player";
        }else if (playerChoice.equals("rock")  && compChoice.equals("Scissors")) {
            winner = "player";
        }else if (playerChoice.equals("Scissors")  && compChoice.equals("rock")) {
            winner = "comp";
        }else if (playerChoice.equals("Scissors")  && compChoice.equals("paper")) {
            winner = "player";
        }else{
            winner = "comp";
        }

        return winner;
    }

    private static String RPS_comp() {
        String compChoice ="";
        Random randomizer = new Random();
        int num = randomizer.nextInt(3)+1;;
        System.out.println(num);
        switch (num){
            case 1:
                compChoice = "rock";
                break;
            case 2:
                compChoice = "paper";
                break;
            case 3:
                compChoice = "Scissors";
                break;
            default:
                System.out.println("please enter a valid input");
        }
        System.out.println(compChoice);
        return compChoice;
    }

    private static String RPS_player(){
        System.out.println("Please choose rock, paper or scissors by entering the number:\n 1. rock \n 2. paper \n 3. Scissors");
        Scanner Choice = new Scanner(System.in);
        String num = Choice.nextLine();
        String playerChoice = "";
        switch (num){
            case "1":
                playerChoice = "rock";
                break;
            case "2":
                playerChoice = "paper";
                break;
            case "3":
                playerChoice = "Scissors";
                break;
            default:
                System.out.println("please enter a valid input");
        }
        System.out.println(playerChoice);
        return (playerChoice);
    }



}
