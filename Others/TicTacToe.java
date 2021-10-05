import java.util.Scanner;
import java.util.List;
import java.util.Random;
import java.util.Arrays;
import java.util.ArrayList;


public class TicTacToe {

    static ArrayList<Integer> playerPositions = new ArrayList<Integer>();
    static ArrayList<Integer> cpuPositions = new ArrayList<Integer>();

    public static void main(String[] args) {

    //2D Array of chars
    //char uses single quotes
      char [][] gameBoard = {
                            {' ', '|', ' ', '|', ' '},
                            {'-', '+', '-', '+', '-'},
                            {' ', '|', ' ', '|', ' '},
                            {'-', '+', '-', '+', '-'},
                            {' ', '|', ' ', '|', ' '}
                
      }; 
            
      

      while(true) {
              Scanner scan = new Scanner(System.in);

              System.out.println("Enter your placement (1-9): ");

              int playerPos = scan.nextInt();
              
              //not overwriting positions:
              while(playerPositions.contains(playerPos) || cpuPositions.contains(playerPos)){
                        System.out.println("Position taken.");
                        playerPos = scan.nextInt();
              }

              placePiece(gameBoard, playerPos, "player");

              //random positioning:
              Random rand = new Random();
              int cpuPos = rand.nextInt(9) + 1;
              
              //not overwriting positions:
              while(playerPositions.contains(cpuPos) || cpuPositions.contains(cpuPos)) {
                        cpuPos = rand.nextInt(9) + 1;
              }

              placePiece(gameBoard, cpuPos, "cpu");

              printGameBoard(gameBoard);

              String result = checkWinner();
              System.out.println(result);
              

        }
    

      

    }

    public static void printGameBoard(char[][] gameBoard) {

          //print out the gameBoard using two for loops
              //for each row inside of the gameBoards
              for(char[] row : gameBoard) {
                //for each char inside of the row
                  for(char c : row) {
                    System.out.print(c);
                  }
                  System.out.println();
              } 

    }

    public static void placePiece(char[][] gameBoard, int position, String user) {

      //set symbol sign to default X:
      char symbol = ' ';

      if(user.equals("player")){
          symbol = 'X';
          playerPositions.add(position);
      } else if(user.equals("cpu")){
          symbol = 'O';
          cpuPositions.add(position);
      }

           //switching empty space with X:
      switch(position) {
        //[row][column]
          case 1: 
              gameBoard[0][0] = symbol;
              break;
          case 2: 
              gameBoard[0][2] = symbol;
              break;
          case 3: 
              gameBoard[0][4] = symbol;
              break;
          case 4: 
              gameBoard[2][0] = symbol;
              break;
          case 5: 
              gameBoard[2][2] = symbol;
              break;
          case 6: 
              gameBoard[2][4] = symbol;
              break;
          case 7: 
              gameBoard[4][0] = symbol;
              break;
          case 8: 
              gameBoard[4][2] = symbol;
              break;
          case 9: 
              gameBoard[4][4] = symbol;
              break;
          default:
              break;
      }
    }

    public static String checkWinner() {


      //all winning positions
        List topRow = Arrays.asList(1, 2, 3);
        List middleRow = Arrays.asList(4, 5, 6);
        List bottomRow = Arrays.asList(7, 8, 9);
        List leftColumn = Arrays.asList(1, 4, 7);
        List middleColumn = Arrays.asList(2, 5, 8);
        List rightColumn = Arrays.asList(3, 6, 9);
        List diagonal1 = Arrays.asList(1, 5, 9);
        List diagonal2 = Arrays.asList(5, 5, 3);
        
        List<List> winningConditions = new ArrayList<List>();
        winningConditions.add(topRow);
        winningConditions.add(middleRow);
        winningConditions.add(bottomRow);
        winningConditions.add(leftColumn);
        winningConditions.add(middleColumn);
        winningConditions.add(rightColumn);
        winningConditions.add(diagonal1);
        winningConditions.add(diagonal2);

        for(List l : winningConditions) {
          if(playerPositions.containsAll(l)){
            return "Congratz. You won!";
          } else if(cpuPositions.containsAll(l)){
            return "CPU won! Sorry :(";
          } //if the board is full it's a draw
          else if(playerPositions.size() + cpuPositions.size() == 9){
            return "CAT";
          }
        }

        return "";
    }

}