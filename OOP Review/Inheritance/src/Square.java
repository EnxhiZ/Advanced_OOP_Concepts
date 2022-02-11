
public class Square extends Shape {
    double side;

    public Square(double side, String name) {
        super(name);
        this.side = side;
    }

    public double getArea() {
        return this.side * this.side;
    }

    public double getPerimeter() {
        return 4.0 * this.side;
    }

    public String toString() {
        return this.name + ":" + this.side;
    }

    public boolean equals(Object obj) {
        if (obj != null && obj.getClass() == this.getClass()) {
            Square sq = (Square)obj;
            return this.name.equals(sq.name) && this.side == sq.side;
        } else {
            return false;
        }
    }
}
