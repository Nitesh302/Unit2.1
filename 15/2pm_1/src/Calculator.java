public class Calculator {
    public static void main(String[] args) {
        int a=4;
        int b=5;
        System.out.println(Add(a,b));
        System.out.println(Sub(a,b));
        System.out.println(Div(a,b));
        System.out.println(Mulit(a,b));

    }
    public static int Add(int a, int b){
        System.out.print("The Sum of "+a+"+"+b+" is ");
        return a+b;
    }
    public static  int Sub(int a,int b){
        System.out.print("The Difference "+a+"-"+b+" is ");
        return a-b;
    }public static  int Div(int a,int b){
        System.out.print("The Difference "+a+"/"+b+" is ");
        return a/b;
    }public static  int Mulit(int a,int b){
        System.out.print("The Difference "+a+"*"+b+" is ");
        return a*b;
    }

}
