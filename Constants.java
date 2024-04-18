//referenced from teacher constants


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
    public static final int GET_GENERATION_NUMBER = 2;
    public static final int GENERATE = 3;
    public static final int CHECK_GENERATIONS = 4;
    public static final int SIM_END = 5;
    public static final int RESEED = 6;                 //run out of gens -> quit = no -> reseed
    public static final int QUIT_PROGRAM = 7;
    
    // Strings                                  //ref tictactoe
    public static final String DIVIDER_STRING = " |---|---|---| ";
    public static final String BOARD_STRING = " | %s | "; //make 20 long
}