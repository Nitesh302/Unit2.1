public class game {
    public static void main(String[] args) {
        int[] score = {20,30,10,50,4,55};
        int small = score[0];
        for (int i=0; i< score.length;i++){
            if (score[i]<small){
                small = score[i];
            }
        }
        System.out.println("THE SMALLEST ELEMENT OF THE ARRAY IS "+small);
    }
}
