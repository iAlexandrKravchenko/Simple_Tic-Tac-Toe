package tictactoe;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[]ch = str.toCharArray();
        
        System.out.println("---------");
        System.out.println("| " + ch[0]+ " " + ch[1] + " " + ch[2] + " |");
        System.out.println("| " + ch[3]+ " " + ch[4] + " " + ch[5] + " |");
        System.out.println("| " + ch[6]+ " " + ch[7] + " " + ch[8] + " |");
        System.out.println("---------");
                
        char[][] arr = new char[3][3];
        int count = 0;
        for(int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = ch[count];
                count++;
            }
        }
        boolean xWin = false;
        boolean oWin = false;
        boolean hasNull = false;
        boolean impossible = false;
        boolean draw = false;
        
        int countO = 0;
        int countX = 0;
        for (char z : ch){
            if(z == 'X') {
                countX++;
            }
            else if (z == 'O') {
                countO++;
            }
        }
        
        if (arr[0][0] == 'X' && arr[0][1] == 'X' && arr[0][2] == 'X'||
        arr[1][0] == 'X' && arr[1][1] == 'X' && arr[1][2] == 'X' ||
        arr[2][0] == 'X' && arr[2][1] == 'X' && arr[2][2] == 'X'||
        arr[0][0] == 'X' && arr[1][0] == 'X' && arr[2][0] == 'X'||
        arr[0][1] == 'X' && arr[1][1] == 'X' && arr[2][1] == 'X'||
        arr[0][2] == 'X' && arr[1][2] == 'X' && arr[2][2] == 'X'||
        arr[0][0] == 'X' && arr[1][1] == 'X' && arr[2][2] == 'X'||
        arr[0][2] == 'X' && arr[1][1] == 'X' && arr[2][1] == 'X') {
            xWin = true;
        }
        if (arr[0][0] == 'O' && arr[0][1] == 'O' && arr[0][2] == 'O'||
        arr[1][0] == 'O' && arr[1][1] == 'O' && arr[1][2] == 'O' ||
        arr[2][0] == 'O' && arr[2][1] == 'O' && arr[2][2] == 'O'||
        arr[0][0] == 'O' && arr[1][0] == 'O' && arr[2][0] == 'O'||
        arr[0][1] == 'O' && arr[1][1] == 'O' && arr[2][1] == 'O'||
        arr[0][2] == 'O' && arr[1][2] == 'O' && arr[2][2] == 'O'||
        arr[0][0] == 'O' && arr[1][1] == 'O' && arr[2][2] == 'O'||
        arr[0][2] == 'O' && arr[1][1] == 'O' && arr[2][1] == 'O') {
            oWin = true;
        }
        if (xWin == false && oWin == false) {
            for (char x : ch) {
                if (x == '_') {
                    hasNull = true;
                }
            }
        }
        if (Math.abs(countX - countO) > 1 || xWin == true && oWin == true) {
            impossible = true;
        }
        if (xWin == false && oWin == false && hasNull == false && impossible == false) {
            draw = true;
        }
        
        
        if (xWin == true && oWin == false && hasNull == false && impossible == false){
            System.out.println("X wins");
        }
        else if (xWin == false && oWin == true && hasNull == false && impossible == false){
            System.out.println("O wins");
        }
         else if (xWin == false && oWin == false && hasNull == true && impossible == false){
            System.out.println("Game not finished");
        }
        else if (xWin == false && oWin == false && hasNull == false && impossible == true || xWin == true && oWin == true){
            System.out.println("Impossible");
        }
         else {
            System.out.println("Draw");
        }
        
       
    }
}
