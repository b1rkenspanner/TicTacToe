package tictactoe;
import java.util.Arrays;
import java.util.Scanner;
public class TheUserIsAGameMaster {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter cells: ");
		String moves = sc.next();
		String[] arr = moves.split("");
		System.out.println(Arrays.toString(arr));
		String [][] matrix = new String[3][3];
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				if(i == 0) {
					matrix[i][j] = arr[j];
				}
				else if(i == 1) {
					matrix[i][j] = arr[3+j];
				}
				else if(i==2) {
					matrix[i][j] = arr[6+j];
				}
			}
		}
		System.out.println("---------");
		for(int i = 0; i < 3; i++) {
			System.out.print("| ");

			for(int j = 0; j < 3; j++) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.print("|");
			System.out.println();
		}
		System.out.println("---------");

		
	}

}
