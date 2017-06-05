import org.junit.Test;

import static javafx.scene.input.KeyCode.M;
import static junit.framework.TestCase.assertEquals;


public class MarsRoverTest {

    @Test
    public void shouldTurnWestFromNorthForInputL(){
        MarsRover marsRover= new MarsRover(0,0,Directions.NORTH);
        marsRover.setDirections(Directions.Rotation.L,null);
        assertEquals(Directions.WEST,marsRover.getDirection());
    }
    @Test
    public void shouldTurnNorthFromWestForInputR(){
        MarsRover marsRover= new MarsRover(0, 0, Directions.WEST);
        marsRover.setDirections(Directions.Rotation.R,null);
        assertEquals(Directions.NORTH,marsRover.getDirection());
    }
    @Test
    public void shouldBeInTheSameDirectionForCommandM(){
        MarsRover marsRover= new MarsRover(0, 0, Directions.WEST);
        marsRover.setDirections(null,"M");
        assertEquals(Directions.WEST,marsRover.getDirection());
    }
    @Test
    public void shouldBeInThePositionForAxisCoordination(){
        MarsRover marsRover= new MarsRover(0, 0, Directions.WEST);
        marsRover.setDirections(null,"M");
        assertEquals(Directions.WEST,marsRover.getDirection());
    }
    @Test
    public void shouldBeMovedForwardForMInTheGivenDirection(){
        MarsRover marsRover= new MarsRover(1, 2, Directions.NORTH);
        marsRover.setDirections(null,"M");
        assertEquals(3,marsRover.getYAxis());
    }




}
