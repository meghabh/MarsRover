package tw.org.marsrover;

import java.util.Scanner;

class MarsRover {
    static Directions direction;
    Coordinates coordinations;
    Plateau plateau;

    MarsRover(int xAxis, int yAxis, Directions directions, Plateau plateau) {
        this.direction = directions;
        this.plateau = plateau;
        exceptionTest(xAxis, yAxis);
        coordinations = new Coordinates(xAxis, yAxis);

    }

    public static void main(String[] args) {
        System.out.println("Enter the uppercoordinates of plateau");
        Scanner in = new Scanner(System.in);
        Plateau plateau = new Plateau(in.nextInt(), in.nextInt());
        System.out.println("Enter the initial position and commands to move  marsover");
        while (in.hasNextLine()) {
            int xAxis = in.nextInt();
            int yAxis = in.nextInt();
            String direction = in.next();
            Directions dir = Directions.valueOf(direction);
            MarsRover marsRover = new MarsRover(xAxis, yAxis, dir, plateau);
            marsRover.setPosition(in.next());
            System.out.print(marsRover.coordinations.getXAxis() + " " + marsRover.coordinations.getYAxis() + " " + marsRover.getDirection());
           // if (in.hasnextLine().equals("")) {
              //  break;
            // }

            }
        }

    Exception exceptionTest(int xAxis, int yAxis) {
        if (xAxis > plateau.getUpperxCoordinate() || xAxis < plateau.getLowerXCoordinate() || yAxis > plateau.getUpperYCoordinate() || yAxis < plateau.getLowerYCoordinate())
            throw new IndexOutOfBoundsException();
        return null;
    }


    public void setPosition(String commands) {
        for (char ch : commands.toCharArray()) {
            if (ch == 'L')
                direction = direction.nextDirection(Directions.RotateNintyDegree.L);
            if (ch == 'R')
                direction = direction.nextDirection(Directions.RotateNintyDegree.R);
            if (ch == 'M') {
                setCoordinates(coordinations.xAxis, coordinations.yAxis);
            }
        }
    }

    private void setCoordinates(int xAxis, int yAxis) {
        exceptionTest(xAxis, yAxis);
        if (direction == Directions.N)
            coordinations.yAxis = yAxis + 1;
        if (direction == Directions.S)
            coordinations.yAxis = yAxis - 1;
        if (direction == Directions.E)
            coordinations.xAxis = xAxis + 1;
        if (direction == Directions.W)
            coordinations.xAxis = xAxis - 1;

    }

    public Directions getDirection() {
        return direction;
    }

}
