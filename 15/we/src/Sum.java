public class Sum {
    public static void main(String[] args) {
        int limit=20;
        int sum=0;
        for (int i=0;i<=limit;i++){
            if (i%5==0){
                sum = sum + i;
            }
        }
        System.out.println("sum is = " + sum);
    }
}
