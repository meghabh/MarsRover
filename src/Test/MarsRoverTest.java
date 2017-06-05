import org.junit.Test;

import static junit.framework.TestCase.assertEquals;


public class MarsRoverTest {
    @Test
    public void shouldTurnWestFromNorthForInputL(){
        MarsRover marsRover= new MarsRover();
        assertEquals("North",marsRover.turnToLeft("East"));

    }

    @Test
    public void shouldTurnNorthFromWestForInputM(){
        MarsRover marsRover= new MarsRover();
        assertEquals("North",marsRover.turnToRight("West"));

    }

}
