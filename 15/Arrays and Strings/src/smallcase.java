public class smallcase {
    public static void main(String[] args) {
        String str = "MasAI SchooL";
        for (int i=0; i<str.length();i++){
            if (Character.isLowerCase(str.charAt(i))){
                System.out.print(str.charAt(i));
            }
        }
    }
}
