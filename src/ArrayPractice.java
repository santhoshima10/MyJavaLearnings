import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

public class ArrayPractice {

    public static void main(String[] args){

    //Array copy

        String[] names = {"Test1","Test2","Test3"};

        String[] nameClone = names.clone();

        System.out.println(Arrays.toString(nameClone));

        String[] nameCopy = Arrays.copyOf(names,names.length);

        System.out.println(Arrays.toString(nameCopy));


    }
}
