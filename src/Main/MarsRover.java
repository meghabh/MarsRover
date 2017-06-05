
public class MarsRover {
    String[] directions;
    MarsRover(){
        directions=new String[]{"North","West","South","East"};
    }
    public String turnToLeft(String direction) {
        for(int directionCount=0;directionCount<4;){
            if(directions[directionCount]==direction)
            {
                if(directionCount==3)
                    return directions[0];
            }
            return directions[++directionCount];

        }
        return null;
    }

    public String turnToRight(String direction) {
        for(int directionCount=0;directionCount<4;directionCount++){
               int directionRef=directionCount;
            if(directionCount==3)
                return directions[0];
            if(directions[directionCount]==direction)
                return directions[--directionRef];


        }
        return null;

    }
}
