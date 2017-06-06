
public class TestMarsRover extends MarsRover{
    public TestMarsRover(int xAxis, int yAxis, Directions directions) {
        super(xAxis, yAxis, directions);
    }

    @Override
    public boolean equals(Object obj) {
        MarsRover marsRover = (MarsRover)obj;
        if((this.coordinations.getXAxis()  == marsRover.coordinations.getXAxis()) && (this.coordinations.getYAxis()  == marsRover.coordinations.getYAxis()) && (this.direction==marsRover.direction))
            return true;
        return false;

    }
}
