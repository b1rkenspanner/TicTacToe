package tictactoe;

import java.util.Scanner;

public class WhatsUpOnTheField {
    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        char[][] arr = new char[3][3];
        System.out.println("Enter cells: ");
        String cells = sc.nextLine();
        int k = 0;
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                    arr[i][j] = cells.charAt(k);
                    k++;
            }
        }
        int countX = 0;
        int countO = 0;
        int empty = 0;
        System.out.println("---------");
        for (int i = 0; i < arr.length; i++){
            System.out.print("| ");
            for (int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
                if (arr[i][j] == 'X') {
                    countX++;
                }
                if (arr[i][j] == 'O') {
                    countO++;
                }
                if (arr[i][j] == '_') {
                    empty++;
                }
            }
            System.out.println("|");
        }
        System.out.println("---------");

        boolean xWin = false;
        boolean oWin = false;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length - 2; j++) {
                //horizontal
                if (arr[i][j] == 'X' && arr[i][j + 1] == 'X' && arr[i][j + 2] == 'X') {
                    xWin = true;
                }
                if (arr[i][j] == 'O' && arr[i][j + 1] == 'O' && arr[i][j + 2] == 'O') {
                    oWin = true;
                }
                //diagonal
                if (arr[0][0] == 'X' && arr[1][1] == 'X' && arr[2][2] == 'X') {
                    xWin = true;
                }
                if (arr[0][0] == 'O' && arr[1][1] == 'O' && arr[2][2] == 'O') {
                    oWin = true;
                }
                if (arr[0][2] == 'X' && arr[1][1] == 'X' && arr[0][2] == 'X') {
                    xWin = true;
                }
                if (arr[0][2] == 'O' && arr[1][1] == 'O' && arr[0][2] == 'O') {
                    oWin = true;
                }
            }
        }
        //vertical
        for (int i = 0; i < arr.length-2; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == 'X' && arr[i + 1][j] == 'X' && arr[i + 2][j] == 'X') {
                    xWin = true;
                }
                if (arr[i][j] == 'O' && arr[i + 1][j] == 'O' && arr[i + 2][j] == 'O') {
                    oWin = true;
                }
            }
        }

        if (xWin && oWin || Math.abs(countX - countO) >= 2) {
            System.out.println("Impossible");
        } else if (xWin) {
            System.out.println("X wins");
        } else if (oWin) {
            System.out.println("O wins");
        } else if (!xWin && !oWin && empty == 0) {
            System.out.println("Draw");
        } else {
            System.out.println("Game not finished");
        }

        //System.out.println("X: " + countX + " O: " + countO);
    }
}
