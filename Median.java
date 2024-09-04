import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author prabha
 */
public class Median {

    public static void main(String[] args) {
        int x = 5;
        int y = 8;
        int z = 3;
        int extra = x;
        int dum = 0;

        int value11 = 0;
        if (x < y) {
            for (int i = 0; i <= z; i++) {
                value11 = x + 1;
                if( value11 == y){
                    dum = value11;
                    break;
                }
                x = value11;

                // value =0;
            }
            dum = value11;

            for (int i = 0; i <= z; i++) {
                int value1 = value11 - 1;

                value11 = value1;
                // value =0;
            }
         //   dum = value11;

        }


        int value = 0;
        if (x > y) {
            for (int i = 0; i < z; i++) {
                value = x - 1;
//                if( value == y){
//                    dum = value;
//                    break;
//                }
                x = value;

                // value =0;
            }
            dum = value;

            for (int i = 0; i < z; i++) {
                int value1 = value + 1;

                value = value1;
                // value =0;
            }
            dum = value;

        }

        System.out.println(dum);

    }
}
