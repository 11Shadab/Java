import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args)
    {
        List<Integer> arrl = new ArrayList<>();
        arrl.add(10);
        arrl.add(20);
        arrl.add(30);
        arrl.add(1);
        arrl.add(2);
 
        System.out.println(arrl);
        arrl.remove(1);

        arrl.remove(1);
 
        // Printing the updated ArrayList
        System.out.println(arrl);
    }
}
