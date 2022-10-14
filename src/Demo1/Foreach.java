package Demo1;

import java.util.ArrayList;
import java.util.Collection;

public class Foreach {
    public static void main(String[] args) {
        /**
         * for的增强形式既可以遍历集合又可以遍历数组
         */
        Collection<String> list=new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");

        /**
         * 注意书写格式
         * for(变量类型 变量名：数组或集合名)
         */
        for(String i:list)
        {
            System.out.println(i);
        }
    }
}
