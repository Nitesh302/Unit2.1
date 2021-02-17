public class Triangle {
    int base;
    int side1;
    int side2;
    public Triangle(int base, int side1, int side2){
        this.base=base;
        this.side1= side1;
        this.side2=side2;
    }
    public int CalculatePerimeter(){
        int perimeter= base*side1*side2;
        return perimeter;
    }
}
