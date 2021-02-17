import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<String>strings=new ArrayList<>();
        strings.add("Mintu");
        strings.add("Nitesh");
        strings.add("Saunath");
        for (int i=0;i<strings.size();i++) {
            System.out.println(strings.get(i));
        }
    }
}
