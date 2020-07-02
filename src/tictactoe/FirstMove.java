package tictactoe;

import java.util.*;
public class FirstMove
{
	public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        char[][] matrix = new char[3][3];
        System.out.print("Enter the cells:");
        String str = sc.nextLine();
        creatField(matrix,str);
        printField(matrix);
        while (valid(matrix, sc) != true);
        printField(matrix);
    }
    
    public static void creatField(char[][] field , String str1) {
        int n = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (n < str1.length()) {
                    field[i][j] = str1.charAt(n);
                   // System.out.println(str1.charAt(n));
                    n++;
                }
            }
        }
    }
    
    public static void printField(char[][] field) {
        System.out.println("---------");
        for (int i = 0; i < 3; i++) {
            System.out.print("|" + " ");
            for (int j = 0; j < 3; j++) {
                System.out.print(field[i][j] + " ");
            }
            System.out.print("|" + " ");
            System.out.println();
        }
        System.out.println("---------");
    }
    
    public static boolean valid(char[][] field, Scanner sc) {
        int line = 0;
        int column = 0;
        int x = 0;
        int y = 0;
        System.out.println("Enter the coordinates : ");
        if (sc.hasNextInt()) {
            x = sc.nextInt();
            y = sc.nextInt();

        } else {
            System.out.println("You should enter numbers!");
            return false;
        }
        if(x > 3 && y > 3 || x <= 3 && y > 3 || x > 3 && y <= 3) {
            System.out.println("Coordinates should be from 1 to 3!");
            return false;
        }
        column = x - 1;
        line = 3 -  y;
        if (field[line][column] == 'X' || field[line][column] == 'O') {
            System.out.println("This cell is occupied! Choose another one!");
            return false;
        }

        else if(field[line][column] == '_') {
        	field[line][column] = 'X';
        }
        return true;
    }

}
