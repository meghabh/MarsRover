package tw.org.marsrover;

/**
 * Created by meghah on 6/7/17.
 */
public class Plateau {
    int maxXvalue, maxYValue;

    public Plateau(int maxXvalue, int maxYvalue) {
        this.maxXvalue = maxXvalue;
        this.maxYValue = maxYvalue;
    }

    public int getUpperxCoordinate() {
        return this.maxXvalue;
    }

    public int getUpperYCoordinate() {
        return this.maxYValue;
    }

    public int getLowerXCoordinate() {
        return 0;
    }

    public int getLowerYCoordinate() {
        return 0;
    }

}
