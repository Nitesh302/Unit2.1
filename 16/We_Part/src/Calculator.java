public class Calculator {
    public int add(int a, int b){
        System.out.println("Addition of "+a+ " and "+b+" is "+(a+b));
        return a+b;
    }
    public double add(double a, double b){
        System.out.println("Addition of "+a+ " and "+b+" is "+(a+b));
        return a+b;
    }
    public void  calculateArea(int length, double breadth){
        double area =length*breadth;
        System.out.println("Area of rectangle is " +area);
    }
}
