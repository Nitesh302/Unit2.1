public class smallest {
    public static void main(String[] args) {
        int [] num= {4,5,2};
        int small = num[0];
        for (int i=0; i< num.length;i++) {
            if (num[i] < small) {
                small = num[i];
            }
        }
        System.out.println(small);
    }
}
