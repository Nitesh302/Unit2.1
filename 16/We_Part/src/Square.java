public class Square extends Shape{
   public int side;
   public Square(int side){
       int area=side*side;
       System.out.println(area);
   }

    @Override
    public void CalculatArea() {
        int area=side*side;
        System.out.println(area);
    }
}
