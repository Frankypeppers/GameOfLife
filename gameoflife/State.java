package gameoflife;

public class State {
    private int generations = -1;
    private int gameState = Constants.STANDBY;
    private int[][] board = new int[Constants.GRID_SIZE][Constants.GRID_SIZE];
    
    int xSeed = 0;
    int ySeed = 0;

    public boolean isFinished() {
        if (generations == 0) {
            return true;
        } else {
            return false;
        }
    }
    
    public int getXSeed() {
        return xSeed;
    }
    
    public int getYSeed() {
        return ySeed;
    }
    
    public int getGameState() {
        return this.gameState;
    }
    
    public void setGameState(int gameState) {
        this.gameState = gameState;
    }
    
    public int getGenerations() {
        return generations;
    }
    
    public int getBoardCell (int row, int col) {
        return this.board[row][col];
    }
    
    public void setBoardCell (int row, int col, int value) {
        this.board[row][col] = value;
    }
}
