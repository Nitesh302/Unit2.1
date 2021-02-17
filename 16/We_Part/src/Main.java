import java.util.Scanner;

public class Main {
    static boolean isPrime(int n)
    {


        if (n <= 1)
        {
            return false;
        }


        for (int i = 2; i < n; i++)
        {
            if (n % i == 0)
            {
                return false;
            }
        }
        return true;
    }


    static int findSum(int arr[], int n)
    {

        int sum = 0;

        for (int i = 0; i < n - 1; i++)
        {
            for (int j = i + 1; j < n; j++)
            {
                if (isPrime(j - i))
                {

                    sum = sum + Math.abs(arr[i] - arr[j]);
                }
            }
        }
        return sum;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.nextLine();
        int[] arr = new int[n];
        for (int i=0;  i<n; i++){
            arr[i]= scanner.nextInt();
            System.out.println(findSum(arr, n));
        }
    }
}
