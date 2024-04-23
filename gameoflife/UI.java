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
        state.getBoardSeed(row-1, col-1) == Constants.UNPOPULATED;
    }
    
    public int getSeedRow() {
        int row = 0;
        while (true) {
            
        }
    }
}