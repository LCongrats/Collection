package StreamTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class StreamApi {
    public static void main(String[] args) {

        List<String> names=new ArrayList<>();

        Collections.addAll(names,"干扰1","干扰2","干扰3","干扰4","杨尔翔","党诣","王志宇","张可");

        Stream<String> namesStream=names.stream();

        //Stream取前几个的长度用Stream的limit
        //namesStream.limit(4).forEach(s-> System.out.println(s));

        //Stream跳过前几个的长度用Stream的Skip
        //namesStream.skip(2).forEach(s-> System.out.println(s));


    }

}
