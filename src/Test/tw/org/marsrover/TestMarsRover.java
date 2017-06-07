package tw.org.marsrover;

import tw.org.marsrover.Directions;
import tw.org.marsrover.MarsRover;
import tw.org.marsrover.Plateau;

public class TestMarsRover extends MarsRover {
    public TestMarsRover(int xAxis, int yAxis, Directions directions, Plateau plateau) {
        super(xAxis, yAxis, directions, plateau);
    }

    @Override
    public boolean equals(Object obj) {
        MarsRover marsRover = (MarsRover) obj;
        if ((this.coordinations.getXAxis() == marsRover.coordinations.getXAxis()) && (this.coordinations.getYAxis() == marsRover.coordinations.getYAxis()) && (this.direction == marsRover.direction))
            return true;
        return false;

    }
}
