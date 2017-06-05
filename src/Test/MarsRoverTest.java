import org.junit.Test;

import static junit.framework.TestCase.assertEquals;


public class MarsRoverTest {
    @Test
    public void shouldTurnWestFromNorthForInputL(){
        MarsRover marsRover= new MarsRover(0,0,Directions.NORTH);
        marsRover.setDirections(Directions.Rotation.L);
        assertEquals(Directions.WEST,marsRover.getDirection());
    }
    @Test
    public void shouldTurnNorthFromWestForInputR(){
        MarsRover marsRover= new MarsRover(0, 0, Directions.WEST);
        marsRover.setDirections(Directions.Rotation.R);
        assertEquals(Directions.NORTH,marsRover.getDirection());
    }



}
