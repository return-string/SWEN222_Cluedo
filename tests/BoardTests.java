package tests;
import static org.junit.Assert.*;
import game.Board;
import game.Card;
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
	
	public void test1_createBoard() {
		Board b = new Board();
	}

	// Not really tests, more just debugging methods
	public void test2_getMoves(){
		Board b = new Board();
		Map<Coordinate, String> moves = b.possibleMoves(new Coordinate(5,8), 6);
		printMoves(moves);
	}

	public void test3_getMoves2(){
		Board b = new Board();
		Map<Coordinate, String> moves = b.possibleMoves(new Coordinate(9,0), 4);
		printMoves(moves);
	}
	
	//=============== Actual Tests ========================
	
	@Test
	public void test4_getMoves3(){
		Board b = new Board();
		Map<Coordinate, String> moves = b.possibleMoves(new Coordinate(4, 6), 1);
		Map<Coordinate, String> expected = new HashMap<Coordinate, String>();
		printMoves(moves);
		assertEquals("Enter the study", moves.get(new Coordinate(4,5)));
		String distanceTo = moves.get(new Coordinate(4,7));
		assertTrue(distanceTo.contains("6 steps away from ball room"));
		assertTrue(distanceTo.contains("10 steps away from dining room"));
		assertTrue(distanceTo.contains("22 steps away from library"));
		assertTrue(distanceTo.contains("19 steps away from conservatory"));
		assertTrue(distanceTo.contains("18 steps away from lounge"));
		assertTrue(distanceTo.contains("18 steps away from hall"));
		assertTrue(distanceTo.contains("16 steps away from billiard room"));
	}

	/** Tests if the possibleMoves map includes an occupied square.	 */
	@Test
	public void test5_testOccupied1(){
		Board b = new Board();
		Coordinate occupied = new Coordinate(4, 7);
		Map<Coordinate, String> moves1 = b.possibleMoves(new Coordinate(4, 8), 1);
		assertTrue(moves1.containsKey(occupied));
		b.toggleOccupied(occupied);
		Map<Coordinate, String> moves2 = b.possibleMoves(new Coordinate(4, 8), 1);
		assertFalse(moves2.containsKey(occupied));
	}

	/** Tests if the possibleMoves map reflects the constraint of not moving through
	 * a through an occupied square. */
	@Test
	public void test6_testOccupied2(){
		Board b = new Board();
		Coordinate occupied = new Coordinate(4, 7);
		Map<Coordinate, String> moves1 = b.possibleMoves(new Coordinate(4, 8), 1);
		assertTrue(moves1.containsKey(occupied));
		b.toggleOccupied(occupied);
		Map<Coordinate, String> moves2 = b.possibleMoves(new Coordinate(4, 8), 1);
		assertFalse(moves2.containsValue("Enter the kitchen"));
	}


	@Test
	public void test5_testOccupied3(){
		Board b = new Board();
		Coordinate occupied = new Coordinate(9, 1);
		b.toggleOccupied(occupied);
		Map<Coordinate, String> moves = b.possibleMoves(new Coordinate(9, 0), 1);
		assertFalse(moves.containsKey(occupied));
	}

	@Test
	public void test6_testOccupied4(){
		Board b = new Board();
		Coordinate occupied = new Coordinate(9, 1);
		b.toggleOccupied(occupied);
		Map<Coordinate, String> moves = b.possibleMoves(new Coordinate(9, 0), 2);
		assertFalse(moves.containsValue("Enter the kitchen"));
	}
	

	private void printMoves(Map<Coordinate, String> moves) {
		for(Coordinate coord : moves.keySet()){
			System.out.printf("%s : %s\n", coord.toString(), moves.get(coord));
		}
	}
}
