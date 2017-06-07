package tw.org.marsrover;

public enum Directions {

    N() {
        @Override
        public Directions nextDirection(RotateNintyDegree rotateNintyDegree) {
            return (rotateNintyDegree == RotateNintyDegree.L ? W : E);
        }

    },
    W() {
        public Directions nextDirection(RotateNintyDegree rotateNintyDegree) {
            return (rotateNintyDegree == RotateNintyDegree.L ? S : N);
        }

    },
    S() {
        public Directions nextDirection(RotateNintyDegree rotateNintyDegree) {
            return (rotateNintyDegree == RotateNintyDegree.L ? E : W);
        }

    },
    E() {
        public Directions nextDirection(RotateNintyDegree rotateNintyDegree) {
            return (rotateNintyDegree == RotateNintyDegree.L ? N : S);
        }

    };

    abstract Directions nextDirection(RotateNintyDegree rotateNintyDegree);

    static enum RotateNintyDegree {
        L, R
    }


}



































