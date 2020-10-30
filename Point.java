public class Point{

  private double x;
  private double y;

  public Point(double nx, double ny){
  x = nx;
  y = ny;
  }

  public Point(Point p){
  x = p.x;
  y = p.y;
  }

  public double getX(){
    return x;
  }

  public double getY(){
    return y;
  }

  public double distanceTo(Point other){
    return Math.sqrt((this.y-other.y)*(this.y-other.y)+(this.x-other.x)*(this.x-other.x));
  }

  public boolean equals(Point other){
    return (this.x==other.x && this.y==other.y);
  }
}
