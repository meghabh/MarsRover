import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

public class MarsRoverTest {

    @Test
    public void shouldTurnWestFromNorthForCommandL() {
        Plateau plateau=new Plateau(5,5);
        MarsRover marsRover = new MarsRover(0, 0, Directions.NORTH,plateau);
        marsRover.setPosition("L");
        assertEquals(Directions.WEST, marsRover.getDirection());
    }

    @Test
    public void shouldTurnNorthFromWestForCommandR() {
        Plateau plateau=new Plateau(5,5);
        MarsRover marsRover = new MarsRover(0, 0, Directions.WEST,plateau);
        marsRover.setPosition("R");
        assertEquals(Directions.NORTH, marsRover.getDirection());
    }

    @Test
    public void shouldBeInTheSameDirectionForCommandM() {
        Plateau plateau=new Plateau(5,5);
        MarsRover marsRover = new MarsRover(0, 0, Directions.WEST,plateau);
        marsRover.setPosition("M");
        assertEquals(Directions.WEST, marsRover.getDirection());
    }

    @Test
    public void shouldBeInTheSamePositionForSeriesOfFourSameCommand() {
        Plateau plateau=new Plateau(5,5);
        MarsRover marsRover = new MarsRover(1, 2, Directions.NORTH,plateau);
        marsRover.setPosition("LMLMLMLM");
        assertEquals(1, marsRover.coordinations.getXAxis());
        assertEquals(2, marsRover.coordinations.getYAxis());
    }

    @Test
    public void shouldTurnAndMoveForwardForSeriesOfCommands() {
        Plateau plateau=new Plateau(5,5);
        MarsRover marsRover = new MarsRover(1, 2, Directions.NORTH,plateau);
        marsRover.setPosition("LMLMLMLM");
        TestMarsRover testmarsRover = new TestMarsRover(1, 2, Directions.NORTH,plateau);
        assertTrue(testmarsRover.equals(marsRover));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void shouldThrowAnExceptionForOutOfRangeInputPosition() {
        Plateau plateau=new Plateau(5,5);
        MarsRover marsRover = new MarsRover(5, 6, Directions.NORTH,plateau);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void shouldThrowAnExceptionForMarsRoverIfItMovesOutOfRange() {
        Plateau plateau=new Plateau(5,5);
        MarsRover marsRover = new MarsRover(0, 1, Directions.NORTH,plateau);
        marsRover.setPosition("MMMMMM");

    }
}
