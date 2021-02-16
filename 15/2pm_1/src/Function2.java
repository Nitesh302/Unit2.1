public class Function2 {
    public static void main(String[] args) {
        int[] num = {20,40,56,67,54,34,21};
        System.out.println(middlenum(num,num.length));
    }
    public static int middlenum(int[] num, int length){

       if (length%2==1){
           System.out.println("Odd number of elements");
           return -1;
       }else if (length%2==0){
           int middle = length/2;
           System.out.println(middle);
       }
       return length;
    }

}
