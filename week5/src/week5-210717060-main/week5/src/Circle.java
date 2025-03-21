public class Circle {
    int radius;
    Point center;

    public Circle(Point p, int r) {
        center = p;
        radius = r;
    }

    public double area() {
        return (Math.PI * Math.pow(radius, 2));
    }

    public double perimeter() {
        return (Math.PI * 2 * radius);
    }

    public boolean intersect(Circle p2) {
        System.out.println(this.radius + p2.radius);
        System.out.println(this.center.distance(p2.center));
        return (this.radius + p2.radius > this.center.distance(p2.center));


    }
}
}

