package gameoflife;

public class EventLoop {
    State state = new State();
    UI ui = new UI();
    int row, col;

    public static void main(String[] args) {
        EventLoop eventLoop = new EventLoop();
        eventLoop.run();
    }

    public void run() {
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
                ui.printBoard(state);
                row = ui.getSeedRow();
                col = ui.getSeedCol();
                if (ui.isLegalSeed(state, row, col)) {
                    state.setGameState(Constants.SEED_GRID);
                } else {
                    ui.printInvalidRowOrColumn();
                }
                
            } else if (gameState == Constants.SEED_GRID) {
                state.setBoardCell(row-1, col-1, 1);
                if (ui.seedContinue()) {
                    state.setGameState(Constants.GET_GRID_SEEDS);
                } else {
                    state.setGameState(Constants.GET_GENERATION_NUMBER);
                }
            }
        }
    }
}
/// mistook eventloop for state lmao ----- finish laterrr