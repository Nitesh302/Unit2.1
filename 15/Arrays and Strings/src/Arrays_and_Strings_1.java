public class Arrays_and_Strings_1 {
    public static void main(String[] args) {
        int [] num = {0,1,1,0,2,3,4,1};
        System.out.println(Zeroc(num, num.length));

    }
    public static int Zeroc (int[] num, int lenth ){
        int count=0;
        for (int i=0; i<=lenth;i++){
            if (i==0) {
                count++;
            }
        }
        return count;
    }
}
