class GridPosition {

    private int x;

    private int y;

    GridPosition(final int x, final int y) {
        this.x = x;
        this.y = y;
    }

    public boolean setX(final int x){
        this.x = x;
        return true;
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public boolean setY(final int y){
        this.y = y;
        return true;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + x;
        result = prime * result + y;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        } else if (obj == null || getClass() != obj.getClass()) {
            return false;
        } else if (x != ((GridPosition) obj).x || y != ((GridPosition) obj).y) {
            return false;
        } else {
            return true;
        }
    }
}
