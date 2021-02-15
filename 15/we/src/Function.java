public class Function {
    public static void main(String[] args) {
        Function function = new Function();
        boolean isDivisible = function.isDivisible(10);
        if (isDivisible){
            System.out.println("Is divisible");
        }else {
            System.out.println(" Not Divisible");
        }
    }
    public boolean isDivisible(int num){

        if (num%5==0){
            return true;
        }
        return false;
    }
}
