package Demo1;

import java.util.ArrayList;
        import java.util.Collection;
        import java.util.Scanner;

public class CollectionDemo {
    public static void main(String[] args) {
        /**
         * 集合的练习
         */
        Collection<String> list=new ArrayList<>();
        Scanner in=new Scanner(System.in);
        while (true)
        {
            System.out.println("是否要输入？");
            System.out.println("(yes)or(no)");
            String index=in.nextLine();
            if(index.equals("yes"))
            {
                System.out.println("请输入：");
                String Date=in.nextLine();
                /**
                 * 集合的添加
                 */
                list.add(Date);
            }else if(index.equals("no"))
            {
                break;
            }else {
                System.out.println("输入有误请重新输入！");
            }
        }
        /**
         * 集合的展示
         */
        System.out.println(list);
        //判断集合是否为空
        System.out.println(list.isEmpty());
        /**
         * 集合的清空
         */
        list.clear();

        System.out.println(list.isEmpty());

        System.out.println(list);

        /**
         * 集合的连接
         */
        Collection<String> a=new ArrayList<>();
        a.add("1");
        a.add("2");
        a.add("3");
        a.add("4");
        Collection<String> b=new ArrayList<>();
        b.add("5");
        b.add("6");
        b.add("7");
        b.add("8");

        a.addAll(b);
        System.out.println(a);

    }
}
