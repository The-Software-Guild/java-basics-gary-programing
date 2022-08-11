import java.util.Random;
import java.util.Scanner;

public class Rock_Paper_Scissors {

    public static void main(String[] args) {
            String playerChoice = RPS_player();
            String compChoice = RPS_comp();
            String winner = Winner(playerChoice, compChoice);
            System.out.println(winner);

    }

    private static String Winner(String playerChoice, String compChoice) {

        String winner = "";
        if (playerChoice == compChoice){
            winner = "we have a tie";
        }else if (playerChoice.equals("rock")  && compChoice.equals("paper")){
            winner = "the winner was comp who played: "+compChoice;
        }else if (playerChoice.equals("paper")  && compChoice.equals("rock")){
            winner = "the winner was Player who played: "+playerChoice;
        }else if (playerChoice.equals("rock")  && compChoice.equals("Scissors")) {
            winner = "the winner was player"+playerChoice;
        }else if (playerChoice.equals("Scissors")  && compChoice.equals("rock")) {
            winner = "the winner was comp who played: "+compChoice;
        }else if (playerChoice.equals("Scissors")  && compChoice.equals("paper")) {
            winner = "the winner was player who played: "+playerChoice;
        }else{
            winner = "the winner was comp who played: "+compChoice;
        }

        return winner;
    }

    private static String RPS_comp() {
        String compChoice ="";
        Random randomizer = new Random();
        int num = randomizer.nextInt(3)+1;
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
        return (playerChoice);
    }



}
