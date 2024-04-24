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
                
            }
        }
    }
}
/// mistook eventloop for state lmao ----- finish laterrr