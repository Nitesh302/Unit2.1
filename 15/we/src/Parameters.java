 public class Parameters {
    public static void main(String[] args) {
        int[] marks= {20,30,40,50,60};
        float average = average(marks, marks.length);
        System.out.println("The average is "+ average);
    }
    public static  float average(int[] mark, int length){
        int sum =0;
        for (int i=0; i<length;i++){
            sum +=mark[i];
        }
        float average = sum/length;
        return average;
    }
}

