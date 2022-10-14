package StreamTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StreamDemo1 {
    public static void main(String[] args) {
        List<String> l=new ArrayList<>();
//        l.add("杨尔翔");
//        l.add("党诣");
//        l.add("王志宇");
//        l.add("张可");
//        l.add("杨儿翔");
        Collections.addAll(l,"杨尔翔","党诣","王志宇","张可");

        System.out.println(l);
        List<String> l_Copy=new ArrayList<>();
//        List<String> l_Copy2=new ArrayList<>();
//
//        for (String s : l) {
//            if(s.startsWith("张"))
//            {
//                l_Copy.add(s);
//            }
//            if(s.endsWith("翔"))
//            {
//                l_Copy2.add(s);
//            }
//        }
//
//        System.out.println(l_Copy);
//
//        System.out.println(l_Copy2);

        //Stream流的写法

        l.stream().filter(s->s.startsWith("张")).filter(s->s.length()==2).forEach(s-> System.out.println(s));
        System.out.println(l);
    }
}
