import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * @author prabha
 */
public class FindFirstElement {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("First","Second");

        Optional firstElement  = list.stream().findFirst();

        System.out.println(firstElement.get());

    }
}
