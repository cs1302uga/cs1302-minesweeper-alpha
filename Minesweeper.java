/* Minesweeper.java
 * 
 * Copyright © 2018 Michael E. Cotterell and the University of Georgia. This work is licensed under a 
 * Creative Commons Attribution-NonCommercial-NoDerivatives 4.0 International License to students and 
 * the public.
 */

package cs1302.p1;

import java.io.File;

/**
 * This class represents a Minesweeper game.
 *
 * @author YOUR NAME <YOUR EMAIL>
 */
public class Minesweeper {

    /**
     * Constructs an object instance of the {@link Minesweeper} class using the
     * information provided in <code>seedFile</code>. Documentation about the 
     * format of seed files can be found in the project's <code>README.md</code>
     * file.
     *
     * @param seedFile the seed file used to construct the game
     */
    public Minesweeper(File seedFile) {

	// TODO implement

    } // Minesweeper


    /**
     * Constructs an object instance of the {@link Minesweeper} class using the
     * <code>rows</code> and <code>cols</code> values as the game grid's number
     * of rows and columns respectively. Additionally, the number of positions
     * in the grid that will be set as a mine should equal the ceiling of 
     * <code>2.0 * rows * cols / 3.0</code>, casted to an <code>int</code>. These
     * mine positions should be assigned randomly.
     *
     * @param rows the number of rows in the game grid
     * @param cols the number of cols in the game grid
     */
    public Minesweeper(int rows, int cols) {

	// TODO implement

    } // Minesweeper
    

    /**
     * Starts the game and execute the game loop.
     */
    public void run() {

	// TODO implement

    } // run


    /**
     * The entry point into the program. This main method does implement some
     * logic for handling command line arguments. If two integers are provided
     * as arguments, then a Minesweeper game is created and started with a 
     * grid size corresponding to the integers provided and with a number of 
     * squares containing mines, placed randomly, as determined by the overloaded
     * constructor. If a single word string is provided as an argument then it is 
     * treated as a seed file and a Minesweeper game is created and started using 
     * the information contained in the seed file. If none of the above applies, 
     * then a usage statement is displayed and the program exits gracefully. 
     *
     * @param args the shell arguments provided to the program
     */
    public static void main(String[] args) {

	/*
	  The following switch statement has been designed in such a way that if
	  errors occur within the first two cases, the default case still gets
	  executed. This was accomplished by special placement of the break
	  statements.
	*/

	Minesweeper game = null;

	switch (args.length) {

        // random game
	case 2: 

	    int rows, cols;

	    // try to parse the arguments and create a game
	    try {
		rows = Integer.parseInt(args[0]);
		cols = Integer.parseInt(args[1]);
		game = new Minesweeper(rows, cols);
		break;
	    } catch (NumberFormatException nfe) { 
		// line intentionally left blank
	    } // try

	// seed file game
	case 1: 

	    String filename = args[0];
	    File file = new File(filename);

	    if (file.isFile()) {
		game = new Minesweeper(file);
		break;
	    } // if
    
        // display usage statement
	default:

	    System.out.println("Usage: java Minesweeper [FILE]");
	    System.out.println("Usage: java Minesweeper [ROWS] [COLS]");
	    System.exit(0);

	} // switch

	// if all is good, then run the game
	game.run();

    } // main


} // Minesweeper
