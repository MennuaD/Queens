import java.util.Scanner;

public class Queen {
    private int queens;
    private int scale = 0;
    private String[][] board;
    static int row;
    static int col;
    Scanner r = new Scanner(System.in);

    public void queenSolution(){
        System.out.println("What is the scale of your board?");
        scale = r.nextInt();
        board = new String[scale][scale];
        row = 0;
        col = 0;


    }

    public boolean inRow(){
        for(int i = 0; i <= scale - 1; i ++){

        }
        return true;
    }

    public boolean inColumn(){
        for(int i = 0; i <= scale - 1; i ++){

        }
        return true;
    }

    public boolean inDiagonal(){
        int[] diagonal1Start;
        int[] diagonal1End;
        int[] diagonal2Start;
        int[] diagonal2End;
        if (row < col){
            diagonal1Start = new int[]{row - row, col - row};
            diagonal1End = new int[]{row + (7 - col), col + (7 - col)};
            diagonal2Start = new int[]{row - (7 - col), col + (7 - col)};
            diagonal2End = new int[]{row + (7 - row), col - (7 - row)};
        }
        else if(col == row){
            diagonal1Start = new int[]{0, 0};
            diagonal1End = new int[]{7, 7};
        }
        for(int i = )
        return true;
    }
}
