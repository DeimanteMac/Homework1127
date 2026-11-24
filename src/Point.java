

public class Point {
    /** Point koordinatė*/
    private int x;
    private int y;
    /** sukurią pointą su nurodytomis koordinatėmis*/
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

/** geteriai grąžina point koordinates*/
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
/** seteriai nustato naujas koordinates*/
    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;


    }
    /**Atstumas iki koordinačių pradžios*/
    public double distanceFromOrigin() {
        return Math.sqrt(x * x + y * y);
    }
    /**perkelia pointą per nurodytą x ir y kiekį*/
    public void translate(int dx, int dy) {
        setX(getX() + dx);
        setY(getY() + dy);
    }
    /** perrašo x ir y į [] */
    @Override
    public String toString() {
        return "[" + x + ";" + y + "]";
    }
    /**Apskaičiuoja atstumą iki kito taško */
    public double distance(Point p) {
        int dx = x - p.getX();
        int dy = y - p.getY();

        return Math.sqrt(dx * dx + dy * dy);
    }
    /** nustato abi koordinates*/
    public void setLocation(int x, int y) {
        setX(x);
        setY(y);
    }
}
