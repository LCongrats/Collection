package MapDemo;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class MapDemo1 {
    public static void main(String[] args) {
        Map<Character,Integer> maps=new HashMap<>();
//        maps.put("鸿星尔克",3);
//        maps.put("Jordan",2);
//        maps.put("李宁",1);
//        maps.put("枸杞",100);
//        System.out.println(maps);
        String[] sap={"A","B","C","D"};

        StringBuilder sb=new StringBuilder();
        Random r=new Random();

        for (int i = 0; i < 80; i++) {
            sb.append(sap[r.nextInt(sap.length)]);
        }
        System.out.println(sb);
        for (int i = 0; i < sb.length(); i++) {
            char c=sb.charAt(i);
            //maps.containsKey(c)判断是否含有c键
            if(maps.containsKey(c))
            {
                //maps.get() 返回的是value的值
                maps.put(c,maps.get(c)+1);
            }else {
                maps.put(c,1);
            }
        }

        System.out.println(maps);

    }}
