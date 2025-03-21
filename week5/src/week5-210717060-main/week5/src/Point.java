public  class Point {
    int xCord,yCord;

    public  Point(){
    }
    public Point(int x,int y){
        xCord=x;
        yCord=y;
    }
    public  Point(int coord){
        xCord=coord;
        yCord=coord;

    }

    public double distance(Point p){
        return  Math.sqrt(Math.pow((this.xCord-p.xCord),2)+Math.pow((this.yCord-p.yCord),2));
    }


}


