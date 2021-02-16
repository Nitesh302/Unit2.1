public class Function2 {
    public static void main(String[] args) {
        int[] num = {20,40,56,67,54,34,21};
        System.out.println(middlenum(num,num.length));
    }
    public static int[] middlenum(int[] num, int length){
        int[]a;
        if (length%2==0){
            a=new int[2];
            a[0]= num[(length/2)-1];
            a[1]=num[length/2];
        }else {
            a=new int[1];
            a[0]=num[length/2];
        }
        return a;

    }

}
