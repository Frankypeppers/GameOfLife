package gameoflife;
//This code was provided as starter code by my teacher.
//altered to be unique to my program

public class EventLoop {
    State state = new State();
    UI ui = new UI();
    int row, col;
    int generations;
    public static void main(String[] args) {
        EventLoop eventLoop = new EventLoop();
        eventLoop.run();
    }

    public void run() {
        System.out.print('\u000C');
        while (state.getGameState() != Constants.QUIT_PROGRAM) {
            int gameState = state.getGameState();
            if (gameState == Constants.STANDBY) {
                state.setGameState(Constants.GET_GRID_SEEDS);
                for (int i = 0; i <= 19; i++) {
                    for (int j = 0; j <= 19; j++) {
                        state.setBoardCell(i, j, 0);
                    }
                }
            } else if (gameState == Constants.GET_GRID_SEEDS) {
                System.out.print('\u000C');
                ui.printBoard(state);
                row = ui.getSeedRow(state.getPopulation());
                col = ui.getSeedCol(state.getPopulation());
                if (ui.isLegalSeed(state, row, col)) {
                    state.setGameState(Constants.SEED_GRID);
                } else {
                    ui.printInvalidRowOrColumn();
                }
                
            } else if (gameState == Constants.SEED_GRID) {
                state.setBoardCell(row-1, col-1, state.getPopulation());
                if (ui.seedContinue()) {
                    state.setGameState(Constants.GET_GRID_SEEDS);
                } 
            } else if (gameState == Constants.GET_GENERATION_NUMBER) {
                ui.printBoard(state);
                generations = ui.getGenerations();
                return;
            }
        }
    }
}