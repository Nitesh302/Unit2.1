public class Rectangle extends Shape {
 public int length;
 public int breadth;
 public Rectangle(int length,int breadth){
     int area=length*breadth;
     System.out.println(area);
 }

    @Override
    public void CalculatArea() {
        int area=length*breadth;
        System.out.println(area);
    }
}
