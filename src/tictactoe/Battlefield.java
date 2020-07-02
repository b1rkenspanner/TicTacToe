package tictactoe;

public class Battlefield {
    public static void main(String[] args) {
        final char[] ticTacs = {'X', 'O'};
        for (int i=0; i < 3; i++) {
            for (int j=0; j < 3; j++) {
                System.out.printf("%s ", ticTacs[(int)Math.round(Math.random())]);
            }
            System.out.println();
        }
    }
}
