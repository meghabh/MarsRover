import org.junit.Test;

import static junit.framework.TestCase.assertEquals;


public class MarsRoverTest {
    @Test
    public void shouldTurnWestFromNorthForInputL(){
        MarsRover marsRover= new MarsRover(Directions.SOUTH);
        marsRover.setDirections(Directions.Rotation.L);
        assertEquals(Directions.EAST,marsRover.getDirection());
    }



}
