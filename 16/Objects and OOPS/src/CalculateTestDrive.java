import java.util.Scanner;

public class CalculateTestDrive {
    public static void main(String[] args) {
        Calculate calculate = new Calculate();
        System.out.println("Enter your choice");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println("Enter th number");
        int a= sc.nextInt();
        int b= sc.nextInt();
        if (s.equals("+")){
            int result = calculate.Add(a,b);
            System.out.println(result);
        }else if (s.equals("-")){
            int result = calculate.Sub(a,b);
            System.out.println(result);
        }else if (s.equals("*")){
            int result = calculate.multi(a,b);
            System.out.println(result);
        }else if (s.equals("/")){
            int result = calculate.Div(a,b);
            System.out.println(result);
        }
    }
}
