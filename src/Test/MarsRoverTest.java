import org.junit.Test;
import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;


public class MarsRoverTest {

    @Test
    public void shouldTurnWestFromNorthForInputL(){
        MarsRover marsRover= new MarsRover(0,0,Directions.NORTH);
        marsRover.setPosition("L");
        assertEquals(Directions.WEST,marsRover.getDirection());
    }
   @Test
    public void shouldTurnNorthFromWestForInputR(){
        MarsRover marsRover= new MarsRover(0, 0, Directions.WEST);
        marsRover.setPosition("R");
    }
    @Test
    public void shouldBeInTheSameDirectionForCommandM(){
        MarsRover marsRover= new MarsRover(0, 0, Directions.WEST);
        marsRover.setPosition("M");
        assertEquals(Directions.WEST,marsRover.getDirection());
    }
   @Test
    public void shouldBeMovedForwardForMInTheGivenDirection(){
        MarsRover marsRover= new MarsRover(1, 2, Directions.NORTH);
        marsRover.setPosition("LMLMLMLM");
       assertEquals(1,marsRover.coordinations.getXAxis());
       assertEquals(2,marsRover.coordinations.getYAxis());
    }
    @Test
    public void shouldSpinAndMoveForFourTimes(){
        MarsRover marsRover= new MarsRover(1, 2, Directions.NORTH);
        marsRover.setPosition("LMLMLMLM");
        TestMarsRover marsRover1=new TestMarsRover(1,2,Directions.NORTH);
        assertTrue(marsRover1.equals(marsRover));
    }
    @Test(expected = IndexOutOfBoundsException.class)
    public void shouldThrowAnExceptionForOutOfRangeInputPosition(){
        MarsRover marsRover= new MarsRover(5, 6, Directions.NORTH);
    }
    @Test(expected = IndexOutOfBoundsException.class)
    public void shouldThrowAnExceptionForMarsRoverIfItMovesOutOfRange(){
        MarsRover marsRover= new MarsRover(0, 1, Directions.NORTH);
        marsRover.setPosition("MMMMMM");

    }
    }
