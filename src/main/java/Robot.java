class Robot {

    private Orientation currentOrientation;
    private GridPosition currentGridPosition = new GridPosition(0,0);

    public Robot(GridPosition initialGridPosition, Orientation initialOrientation){
        this.currentOrientation = initialOrientation;
        this.currentGridPosition.setX(initialGridPosition.getX());
        this.currentGridPosition.setY(initialGridPosition.getY());

    }

    public void turnRight(){
        switch (this.currentOrientation){
            case Orientation.EAST :
                this.currentOrientation = Orientation.SOUTH;
                break;
            case Orientation.WEST :
                this.currentOrientation = Orientation.NORTH;
                break;
            case Orientation.NORTH :
                this.currentOrientation = Orientation.EAST;
                break;
            case Orientation.SOUTH :
                this.currentOrientation = Orientation.WEST;
                break;
        }
    }

    public void turnLeft(){
        switch (this.currentOrientation){
            case Orientation.EAST :
                this.currentOrientation = Orientation.NORTH;
                break;
            case Orientation.WEST :
                this.currentOrientation = Orientation.SOUTH;
                break;
            case Orientation.NORTH :
                this.currentOrientation = Orientation.WEST;
                break;
            case Orientation.SOUTH :
                this.currentOrientation = Orientation.EAST;
                break;
        }

    }

    public void advance(){
        switch (this.currentOrientation){
            case Orientation.EAST :
                this.currentGridPosition.setX(this.currentGridPosition.getX() + 1);
                break;
            case Orientation.WEST :
                this.currentGridPosition.setX(this.currentGridPosition.getX() - 1);
                break;
            case Orientation.NORTH :
                this.currentGridPosition.setY(this.currentGridPosition.getY() + 1);
                break;
            case Orientation.SOUTH :
                this.currentGridPosition.setY(this.currentGridPosition.getY() - 1);
                break;
        }
    }

    public Orientation getOrientation(){
        return this.currentOrientation;
    }

    public GridPosition getGridPosition(){
        return this.currentGridPosition;
    }

    //test case "RAALAL"
    public void simulate(String directions){
        char[] actions = directions.toCharArray();
        for (char act: actions){
            switch (act){
                case 'R':
                    turnRight();
                    break;
                case 'A':
                    advance();
                    break;
                case 'L':
                    turnLeft();
                    break;
            }
        }
    }

}
