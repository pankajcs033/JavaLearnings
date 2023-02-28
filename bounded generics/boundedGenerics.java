import java.util.Arrays;
import java.util.List;

public class boundedGenerics {

    public static void main(String[] args) {
        Double[] dobs = {10.2, 11.1, 22.2};
        Integer[] nums = {1, 2, 3, 4};

        System.out.println(convertIntoList(dobs));
        System.out.println(convertIntoList(nums));
    }

    public static <T extends Number> List<T> convertIntoList(T[] input){
        return Arrays.asList(input);
    }
}
