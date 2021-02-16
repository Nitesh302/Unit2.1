public class Functions1 {
    public static void main(String[] args) {

        int[] num = {20,80,90,40,30,60,21};
        System.out.println(amallest(num, num.length));
    }
    public static int amallest(int[] num, int length){
        int small = num[0];
        for (int i=0; i< num.length;i++){
            if (num[i]<small){
                small = num[i];
            }
        }
        return small;
    }
}
