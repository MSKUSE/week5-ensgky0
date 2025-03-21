public class Rectangle {
    Point topLeft;
    int sideA,sideB;

    public Rectangle(int sideA,int sideB,Point topLeft){
        this.sideA=sideA;
        this.sideB=sideB;
        this.topLeft=topLeft;
    }
    public  int area(){
        return sideA*sideB;
    }
    public  int perimeter(){
        return 2*(sideB+sideA);
    }
    public  Point[] corners(){
        Point[] corners=new Point[4];
        corners[0]=topLeft;
        corners[1]=new Point(topLeft.xCord+sideA,topLeft.yCord);/RightTop/
                corners[2]=new Point(topLeft.xCord,topLeft.yCord+sideB);/LeftBottom/
                corners[3]=new Point(topLeft.xCord+sideA,topLeft.yCord+sideB);/RightBottom/
        return  corners;
    }
    public  double diagonal(){
        Point pointA=corners()[0];
        Point pointB=corners()[3];
        return (pointA.distance(pointB));
    }

}
