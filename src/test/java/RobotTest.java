import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RobotTest {



    @Test
    void atOriginFacingNorth() {
        Orientation initialOrientation = Orientation.NORTH;
        GridPosition initialGridPosition = new GridPosition(0, 0);
        Robot robot = new Robot(initialGridPosition, initialOrientation);

        assertEquals(initialOrientation, robot.getOrientation());
        assertEquals(initialGridPosition, robot.getGridPosition());
    }

    @Test
    void atNegativePositionFacingSouth() {
        GridPosition initialGridPosition = new GridPosition(-1, -1);
        Orientation initialOrientation = Orientation.SOUTH;
        Robot robot = new Robot(initialGridPosition, initialOrientation);

        assertEquals(initialOrientation, robot.getOrientation());
        assertEquals(initialGridPosition, robot.getGridPosition());
    }




    @Test
    void changesNorthToEast() {
        GridPosition initialGridPosition = new GridPosition(0, 0);
        Robot robot = new Robot(initialGridPosition, Orientation.NORTH);

        robot.turnRight();

        Orientation expectedOrientation = Orientation.EAST;
        assertEquals(initialGridPosition, robot.getGridPosition());
        assertEquals(expectedOrientation, robot.getOrientation());
    }


    @Test
    void changesEastToSouth() {
        GridPosition initialGridPosition = new GridPosition(0, 0);
        Robot robot = new Robot(initialGridPosition, Orientation.EAST);

        robot.turnRight();

        Orientation expectedOrientation = Orientation.SOUTH;
        assertEquals(initialGridPosition, robot.getGridPosition());
        assertEquals(expectedOrientation, robot.getOrientation());
    }


    @Test
    void changesSouthToWest() {
        GridPosition initialGridPosition = new GridPosition(0, 0);
        Robot robot = new Robot(initialGridPosition, Orientation.SOUTH);

        robot.turnRight();

        Orientation expectedOrientation = Orientation.WEST;
        assertEquals(initialGridPosition, robot.getGridPosition());
        assertEquals(expectedOrientation, robot.getOrientation());
    }


    @Test
    void changesWestToNorth() {
        GridPosition initialGridPosition = new GridPosition(0, 0);
        Robot robot = new Robot(initialGridPosition, Orientation.WEST);

        robot.turnRight();

        Orientation expectedOrientation = Orientation.NORTH;
        assertEquals(initialGridPosition, robot.getGridPosition());
        assertEquals(expectedOrientation, robot.getOrientation());
    }




    @Test
    void changesNorthToWest() {
        GridPosition initialGridPosition = new GridPosition(0, 0);
        Robot robot = new Robot(initialGridPosition, Orientation.NORTH);

        robot.turnLeft();

        Orientation expectedOrientation = Orientation.WEST;
        assertEquals(initialGridPosition, robot.getGridPosition());
        assertEquals(expectedOrientation, robot.getOrientation());
    }


    @Test
    void changesWestToSouth() {
        GridPosition initialGridPosition = new GridPosition(0, 0);
        Robot robot = new Robot(initialGridPosition, Orientation.WEST);

        robot.turnLeft();

        Orientation expectedOrientation = Orientation.SOUTH;
        assertEquals(initialGridPosition, robot.getGridPosition());
        assertEquals(expectedOrientation, robot.getOrientation());
    }


    @Test
    void changesSouthToEast() {
        GridPosition initialGridPosition = new GridPosition(0, 0);
        Robot robot = new Robot(initialGridPosition, Orientation.SOUTH);

        robot.turnLeft();

        Orientation expectedOrientation = Orientation.EAST;
        assertEquals(initialGridPosition, robot.getGridPosition());
        assertEquals(expectedOrientation, robot.getOrientation());
    }


    @Test
    void changesEastToNorth() {
        GridPosition initialGridPosition = new GridPosition(0, 0);
        Robot robot = new Robot(initialGridPosition, Orientation.EAST);

        robot.turnLeft();

        Orientation expectedOrientation = Orientation.NORTH;
        assertEquals(initialGridPosition, robot.getGridPosition());
        assertEquals(expectedOrientation, robot.getOrientation());
    }




    @Test
    void facingNorthIncrementsY() {
        Orientation initialOrientation = Orientation.NORTH;
        Robot robot = new Robot(new GridPosition(0, 0), initialOrientation);

        robot.advance();

        GridPosition expectedGridPosition = new GridPosition(0, 1);
        assertEquals(expectedGridPosition, robot.getGridPosition());
        assertEquals(initialOrientation, robot.getOrientation());
    }


    @Test
    void facingSouthDecrementsY() {
        Orientation initialOrientation = Orientation.SOUTH;
        Robot robot = new Robot(new GridPosition(0, 0), initialOrientation);

        robot.advance();

        GridPosition expectedGridPosition = new GridPosition(0, -1);
        assertEquals(expectedGridPosition, robot.getGridPosition());
        assertEquals(initialOrientation, robot.getOrientation());
    }


    @Test
    void facingEastIncrementsX() {
        Orientation initialOrientation = Orientation.EAST;
        Robot robot = new Robot(new GridPosition(0, 0), initialOrientation);

        robot.advance();

        GridPosition expectedGridPosition = new GridPosition(1, 0);
        assertEquals(expectedGridPosition, robot.getGridPosition());
        assertEquals(initialOrientation, robot.getOrientation());
    }


    @Test
    void facingWestDecrementsX() {
        Orientation initialOrientation = Orientation.WEST;
        Robot robot = new Robot(new GridPosition(0, 0), initialOrientation);

        robot.advance();

        GridPosition expectedGridPosition = new GridPosition(-1, 0);
        assertEquals(expectedGridPosition, robot.getGridPosition());
        assertEquals(initialOrientation, robot.getOrientation());
    }




    @Test
    void movingEastAndNorthFromReadme() {
        Robot robot = new Robot(new GridPosition(7, 3), Orientation.NORTH);

        robot.simulate("RAALAL");

        GridPosition expectedGridPosition = new GridPosition(9, 4);
        Orientation expectedOrientation = Orientation.WEST;

        assertEquals(expectedGridPosition, robot.getGridPosition());
        assertEquals(expectedOrientation, robot.getOrientation());
    }



    @Test
    void movingWestAndNorth() {
        Robot robot = new Robot(new GridPosition(0, 0), Orientation.NORTH);

        robot.simulate("LAAARALA");

        GridPosition expectedGridPosition = new GridPosition(-4, 1);
        Orientation expectedOrientation = Orientation.WEST;

        assertEquals(expectedGridPosition, robot.getGridPosition());
        assertEquals(expectedOrientation, robot.getOrientation());
    }


    @Test
    void movingWestAndSouth() {
        Robot robot = new Robot(new GridPosition(2, -7), Orientation.EAST);

        robot.simulate("RRAAAAALA");

        GridPosition expectedGridPosition = new GridPosition(-3, -8);
        Orientation expectedOrientation = Orientation.SOUTH;

        assertEquals(expectedGridPosition, robot.getGridPosition());
        assertEquals(expectedOrientation, robot.getOrientation());
    }


    @Test
    void movingEastAndNorth() {
        Robot robot = new Robot(new GridPosition(8, 4), Orientation.SOUTH);

        robot.simulate("LAAARRRALLLL");

        GridPosition expectedGridPosition = new GridPosition(11, 5);
        Orientation expectedOrientation = Orientation.NORTH;

        assertEquals(expectedGridPosition, robot.getGridPosition());
        assertEquals(expectedOrientation, robot.getOrientation());
    }

    @Test
    void multipleRobots() {
        GridPosition origin = new GridPosition(0, 0);
        Robot robot1 = new Robot(origin, Orientation.NORTH);
        Robot robot2 = new Robot(origin, Orientation.NORTH);
        Robot robot3 = new Robot(origin, Orientation.NORTH);


        robot1.simulate("LAAA");
        robot2.simulate("LAAA");
        robot3.simulate("LAAA");

        GridPosition expectedGridPosition1 = new GridPosition(-3, 0);
        Orientation expectedOrientation1 = Orientation.WEST;
        assertEquals(expectedGridPosition1, robot1.getGridPosition());
        assertEquals(expectedOrientation1, robot1.getOrientation());

    }

}
