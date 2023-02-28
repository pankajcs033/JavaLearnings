import java.util.Arrays;
import java.util.List;

import javax.print.event.PrintEvent;

public class generics{
    public static void main(String[] args) {
        String[] strs = {"abc", "bcd", "def", "hij"};
        Integer[] nums = {1, 2, 3, 4};

        System.out.println(convertIntoList(strs));
        System.out.println(convertIntoList(nums));
    }

    public static <T> List<T> convertIntoList(T[] input){
        return Arrays.asList(input);
    }
}