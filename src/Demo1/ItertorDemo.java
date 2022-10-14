package Demo1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ItertorDemo {
    public static void main(String[] args) {
        /**
         * 迭代器章节的练习
         */
        Collection<String> list=new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");

        /**
         * 定义迭代器
         */

        Iterator<String> it = list.iterator();

        /**
         * 输出迭代器中的内容
         */

        while(it.hasNext())
        {
            String a=it.next();
            System.out.println(a);
        }

    }
}
