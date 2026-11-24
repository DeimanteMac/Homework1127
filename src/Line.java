public class Line {
    /** Pradžios ir pabaigos pointai*/
    private Point p1;
    private Point p2;
/** objektas be pradinių parametrų*/
    public Line() {
    }
/** grąžina pradžios ir pabaigos pointus*/
    public Point getP1() {
        return p1;
    }

    public Point getP2() {
        return p2;
    }
/**sukuria atkarpą iš dviejų pointų*/
    public Line(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }
    /**nustato naujus pointus*/
    public void setP1(Point p1) {
        this.p1 = p1;
    }

    public void setP2(Point p2) {
        this.p2 = p2;
    }
    /** perrašo p1,p2 į [] */
    @Override
    public String toString() {
        return "[" + p1 + ";" + p2 + "]";
    }
/**Apskaičiuoja atkarpos ilgį tarp pointų*/
    public double length() {
        return p1.distance(p2);
        }
}
