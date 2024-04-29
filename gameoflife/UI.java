package gameoflife;

import java.util.Scanner;
import java.util.*;

//code referenced from my teacher for a tictactoe program -- retains similar setup
// altered in a way thats unique for my program
public class UI {

    Scanner scanner;

    public UI() {
        scanner = new Scanner(System.in);
    }

    public boolean isLegalSeed(State state, int row, int col) {
        return 1 <= row &&row <= Constants.GRID_SIZE && 1 <= col && col <= Constants.GRID_SIZE && state.getBoardCell(row-1, col-1) == 0;
    }
    
    public String getPopOrUnpop(int population) {
        if (population == 1) {
            return "\u25A0";
        } else {
            return " " ;
        }
    }
    
    public int getGenerations() {
        int generations = 0;
        while (true) {
            System.out.printf(Constants.GET_GENERATIONS);
            try {
                generations = scanner.nextInt();
                if (generations < 1 || generations > Constants.MAX_GENS) {
                    printInvalidGens();
                    System.out.println();
                    scanner.nextLine();
                } else {
                    return generations;
                }
            } catch (InputMismatchException error) {
                printInvalidGens();
                System.out.println();
                scanner.next();
            }
        }
    }
    
    public int getSeedRow(int population) {
        int row = 0;
        while (true) {
            System.out.printf(Constants.GET_SEEDS_X);
            try {
                row = scanner.nextInt();
                if (row < 1 || row > Constants.GRID_SIZE) {
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

    public int getSeedCol(int population) {
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
    
    public void printInvalidGens() {
        System.out.printf(Constants.MAXMIN_GENS);
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
            System.out.printf(Constants.BOARD_STRING,getPopOrUnpop(state.getBoardCell(row, 0)),
            getPopOrUnpop(state.getBoardCell(row, 1)),getPopOrUnpop(state.getBoardCell(row, 2)),
            getPopOrUnpop(state.getBoardCell(row, 3)),getPopOrUnpop(state.getBoardCell(row, 4)), 
            getPopOrUnpop(state.getBoardCell(row, 5)),getPopOrUnpop(state.getBoardCell(row, 6)),
            getPopOrUnpop(state.getBoardCell(row, 7)),getPopOrUnpop(state.getBoardCell(row, 8)),
            getPopOrUnpop(state.getBoardCell(row, 9)),getPopOrUnpop(state.getBoardCell(row, 10)),
            getPopOrUnpop(state.getBoardCell(row, 11)),getPopOrUnpop(state.getBoardCell(row, 12)),
            getPopOrUnpop(state.getBoardCell(row, 13)),getPopOrUnpop(state.getBoardCell(row, 14)),
            getPopOrUnpop(state.getBoardCell(row, 15)),getPopOrUnpop(state.getBoardCell(row, 16)),
            getPopOrUnpop(state.getBoardCell(row, 17)),getPopOrUnpop(state.getBoardCell(row, 18)),
            getPopOrUnpop(state.getBoardCell(row, 19)));
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