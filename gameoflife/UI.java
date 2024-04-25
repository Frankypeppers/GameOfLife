package gameoflife;

import java.util.Scanner;
import java.util.*;

public class UI {

    Scanner scanner;

    public UI() {
        scanner = new Scanner(System.in);
    }

    public boolean isLegalSeed(State state, int row, int col) {
        return 1 <= row &&row <= Constants.GRID_SIZE && 
        1 <= col && col <= Constants.GRID_SIZE &&
        state.getBoardCell(row-1, col-1) == Constants.UNPOPULATED;
    }
    
    
    public int getSeedRow() {
        int row = 0;
        while (true) {
            System.out.printf(Constants.GET_SEEDS_X);
            try {
                row = scanner.nextInt();
                if (row <1 || row > Constants.GRID_SIZE) {
                    printInvalidRowOrColumn();
                    System.out.println();
                    scanner.nextLine();
                } else {
                    return row;
                }
            } catch (InputMismatchException error) {
                printInvalidRowOrColumn();
                System.out.println();
                scanner.next();
            }
        }
    }

    public int getSeedCol() {
        int col = 0;
        while (true) {
            System.out.printf(Constants.GET_SEEDS_X);
            try {
                col = scanner.nextInt();
                if (col <1 || col > Constants.GRID_SIZE) {
                    printInvalidRowOrColumn();
                    System.out.println();
                    scanner.nextLine();
                } else {
                    return col;
                }
            } catch (InputMismatchException error) {
                printInvalidRowOrColumn();
                System.out.println();
                scanner.next();
            }
        }
    }

    public boolean reSeed() {
        System.out.println(Constants.RESEED_ASK);
        String yesOrNo = scanner.next();
        return yesOrNo.equals("Y") || yesOrNo.equals("y");
    }
    
    public boolean seedContinue() {
        System.out.println(Constants.SEED_CONTINUE);
        String yesOrNo = scanner.next();
        return yesOrNo.equals("Y") || yesOrNo.equals("y");
    }

    public void printBoard(State state) {
        System.out.println(Constants.DIVIDER_STRING);
        for (int row = 0; row < Constants.GRID_SIZE; row++) {
            System.out.printf(Constants.BOARD_STRING, state.getBoardCell(row, 0),
            state.getBoardCell(row, 1),state.getBoardCell(row, 2),state.getBoardCell(row, 3),
            state.getBoardCell(row, 4),state.getBoardCell(row, 5),state.getBoardCell(row, 6),
            state.getBoardCell(row, 7),state.getBoardCell(row, 8),state.getBoardCell(row, 9),
            state.getBoardCell(row, 10),state.getBoardCell(row, 11),state.getBoardCell(row, 12),
            state.getBoardCell(row, 13),state.getBoardCell(row, 14),state.getBoardCell(row, 15),
            state.getBoardCell(row, 16),state.getBoardCell(row, 17),state.getBoardCell(row, 18),
            state.getBoardCell(row, 19));
            System.out.println();
            System.out.println(Constants.DIVIDER_STRING);
        }
    }

    public void printInvalidRowOrColumn() {
        System.out.println(Constants.INVALID_SEED_XY);
    }

    public void printInvalidSeed(int row, int col) {
        System.out.printf(Constants.INVALID_SEED, row, col);
    }

    public void printFinish(State state) {
        System.out.printf(Constants.FINISH);
    }
}