public class Triangle{

  private Point v1;
  private Point v2;
  private Point v3;

  public static void main(String[] args){
    Triangle a = new Triangle(0,1,1,0,0,0);
    System.out.println(a.classify());
  }

  public Triangle(Point a, Point b, Point c){
    v1 = a;
    v2 = b;
    v3 = c;
  }

  public Triangle(double x1, double y1,double x2, double y2,double x3, double y3){
    v1 = new Point(x1,y1);
    v2 = new Point(x2,y2);
    v3 = new Point(x3,y3);
  }

  public double getPerimeter(){
    return (v1.distanceTo(v2)+v2.distanceTo(v3)+v1.distanceTo(v3));
  }

  public double getArea(){
    double s1 = v1.distanceTo(v2);
    double s2 = v2.distanceTo(v3);
    double s3 = v1.distanceTo(v3);
    double s = (s1+s2+s3)/2;
    return Math.sqrt(s*(s-s1)*(s-s2)*(s-s3));
  }

  public String classify(){
      double s1 = Math.round(v1.distanceTo(v2)*10000)/10000.0;
      double s2 = Math.round(v2.distanceTo(v3)*10000)/10000.0;
      double s3 = Math.round(v1.distanceTo(v3)*10000)/10000.0;
      if (s1 == s2 && s2 == s3){
        return "equilateral";
      }
      else if(s1!=s2 && s2!=s3 && s1!=s3){
        return "scalene";
      }
      else{
        return "isosceles";
      }
  }

  public String toString(){
    return ("v1("+v1.getX()+", "+v1.getY()+") "+"v2("+v2.getX()+", "+v2.getY()+") "+"v3("+v3.getX()+", "+v3.getY()+")");
  }

  public void setVertex(int index, Point newP){
    if (index == 0){
      v1 = newP;
    }
    if (index == 1){
      v2 = newP;
    }
    if (index == 2){
      v3 = newP;
    }
  }
}
