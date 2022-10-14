package StreamTest;

import java.util.*;
import java.util.stream.Stream;

public class StreamDemo2 {
    /*获取Stream的方法*/
    public static void main(String[] args) {
        /*Collection集合获取流*/
        Collection<String> list=new ArrayList<>();

        Stream<String> listStream= list.stream();

        /*Map集合获取流*/

        Map<String,Integer> maps=new HashMap<>();

        Stream<String> keyStream=maps.keySet().stream();

        Stream<Integer> valueStream=maps.values().stream();

        Stream<Map.Entry<String,Integer>> keyandvalueStream=maps.entrySet().stream();

        /*数组获取Stream的方法*/

        String[] zimu={"A","B","C","D"};

        Stream<String> zimuStream= Arrays.stream(zimu);
    }
}
