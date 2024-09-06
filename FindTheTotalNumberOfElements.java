import java.util.Arrays;
import java.util.List;

/**
 * @author prabha
 */
public class FindTheTotalNumberOfElements {
    public static void main(String[] args) {

        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
        List<String> myList1 = Arrays.asList("11");
        Long count =  myList.stream().count();
        Long count1 =  myList1.stream().count();
        System.out.println(count);
        System.out.println(count1);
    }
}
