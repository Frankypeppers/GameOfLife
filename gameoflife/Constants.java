//referenced from teacher constants
package gameoflife;

public class Constants
{
    //grid size - make bigger maybe(?)
    public static final int GRID_SIZE = 20;
    
    //valid box values
    public static final int POPULATED = 1;      // Indicates whether a box is populated
    public static final int UNPOPULATED = -1;   // Indicated whether a box is unpopulated
    
    //sim states
    public static final int STANDBY = 0;
    public static final int GET_GRID_SEEDS = 1;
    public static final int SEED_GRID = 2;
    public static final int GET_GENERATION_NUMBER = 3;
    public static final int GENERATE = 4;
    public static final int CHECK_GENERATIONS = 5;
    public static final int SIM_END = 6;
    public static final int RESEED = 7;                 //run out of gens -> quit = no -> reseed
    public static final int QUIT_PROGRAM = 8;
    
    // Strings                                  //ref tictactoe
    public static final String DIVIDER_STRING = " |---|---|---|---|---|---|---|---|---|---|---|---|---|---|---|---|---|---|---|---| ";
    public static final String BOARD_STRING = " | %s | %s | %s | %s | %s | %s | %s | %s | %s | %s | %s | %s | %s | %s | %s | %s | %s | %s | %s | %s | ";
    public static final String GET_SEEDS_X = "What row do you want to seed? ";
    public static final String GET_SEEDS_Y = "What column do you want to seed? ";
    public static final String INVALID_SEED_XY = "Your row or column must be 1-20";
    public static final String INVALID_SEED = "You cannot seed row %d column %d. Try again";
    public static final String SEED_DONE = "Are you done seeding? Y/N";
    public static final String GET_GENERATIONS = "How many generations do you want to run?";
    public static final String GENERATE_FINISH = "Generations finished";
    public static final String QUIT_ASK = "Would you like to quit?";
    public static final String RESEED_ASK = "Would you like to reseed?";
    public static final String SEED_CONTINUE = "Would you like to continue seeding? Y/N ";
    public static final String FINISH = "Thanks for playing!";
}
