public class Day {
    public static void main(String[] args) {
        String day = "Monday";
        switch (day){
            case "Monday":
                System.out.println("Mon");
                break;
            case "Tuesday":
                System.out.println("Tues");
                break;
            case "Wednesday":
                System.out.println("Wed");
                break;
            case  "Thursday" :
                System.out.println("Thu");
                break;
            case "Friday":
                System.out.println("Fri");
                break;
            case "Saturday":
                System.out.println("Sat");
                break;
            case "Sunday":
                System.out.println("Sun");
                break;
            case "":
                System.out.println("Not a day");
                break;
        }
    }
}
