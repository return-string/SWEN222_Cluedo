package tests;
import static org.junit.Assert.*;
import game.Board;
import game.CardImpl;
import game.Coordinate;
import game.Game;
import game.Player;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;
/** Tests covering the Board classes 
 * 
 * @author Badi James
 *
 */
public class BoardTests {

	private void printMoves(Map<Coordinate, String> moves) {
		for(Coordinate coord : moves.keySet()){
			System.out.printf("%s : %s\n", coord.toString(), moves.get(coord));
		}
	}

}
