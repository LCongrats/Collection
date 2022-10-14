package StreamTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class StreamEmployee {

    public static double allmoney;
    public static double allmoney2;
    public static void main(String[] args) {
        List<Employee> list1=new ArrayList<>();
        list1.add(new Employee("党诣","男",50000,4000,null));
        list1.add(new Employee("袁智深","男",60000,10000,null));
        list1.add(new Employee("王志宇","男",30000,5000,"考过四级"));
        list1.add(new Employee("张可","男",70000,1000,null));

        Stream<Employee>s1=list1.stream();

        List<Employee> list2=new ArrayList<>();
        list2.add(new Employee("刘振宏","男",80000,4000,null));
        list2.add(new Employee("王泽轩","男",60000,5000,null));
        list2.add(new Employee("张鑫同","男",50000,7000,null));
        list2.add(new Employee("张翰冰","男",40000,6000,null));
        list2.add(new Employee("杨凯","男",100000,1000,null));


        Stream<Employee>s2=list2.stream();

        PrefectEmployee a=list1.stream().max((e1,e2)->Double.compare(e1.getBouns()+e1.getSalary(), e2.getBouns())+e2.getSalary()).map(s->new PrefectEmployee(s.getName(),s.getSex())).get();
        System.out.println(a);
        //Employee b=list2.stream().max((e1,e2)->Double.compare(e1.getBouns()+e1.getSalary(), e2.getBouns())+e2.getSalary()).get();

        list1.stream().sorted((c,b)->Double.compare(c.getBouns()+c.getSalary(),b.getBouns()+b.getSalary())).skip(1).limit(list1.size()-2).forEach(e->{
            allmoney+=(e.getBouns()+e.getSalary());
        });

        System.out.println("开发一部的平均工资为："+(allmoney/list1.size()-2));

        Stream<Employee> list3=Stream.concat(s1,s2);
        list3.sorted((c,b)->Double.compare(c.getBouns()+c.getSalary(),b.getBouns()+b.getSalary())).skip(1).limit(list1.size()-2).forEach(e->{
            allmoney2+=(e.getBouns()+e.getSalary());
        });
        System.out.println("两部总计平均工资为："+(allmoney2/ list1.size()+list2.size()-2));

    }
}
