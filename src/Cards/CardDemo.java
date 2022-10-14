package Cards;

import java.util.*;

public class CardDemo {

    /**
     * 定义牌
     */
    public static List<card> allCard=new ArrayList<>();

    static {
        //定义牌的大小
        String[] size={"A","J","Q","K","2","3","4","5","6","7","8","9","10"};
        //定义牌的花色
        String[] color={"♥","♠","♦","♣"};

        //定义牌的实际大小
        int index=0;

        for (String s : size) {
            index++;
            for (String s1 : color) {
                card c=new card(s1,s,index);
                allCard.add(c);
            }
        }
        card a=new card("大王","",++index);
        card b=new card("小王","",++index);
        /**
         * 调用Collection的API添加大小王进入
         */
        Collections.addAll(allCard,a,b);

        System.out.println("新牌"+allCard);
    }
    public static void main(String[] args) {
        /**
         * 打乱牌的顺序
         */
        Collections.shuffle(allCard);
        System.out.println("打乱后的牌："+allCard);
        /**
         * 用集合定义三个玩家
         */
        List<card> zhao=new ArrayList<>();
        List<card> wang=new ArrayList<>();
        List<card> liu=new ArrayList<>();

        for (int i = 0; i < allCard.size()-3 ; i++) {
            card c=allCard.get(i);
            if(i%3==0)
            {
                zhao.add(c);
            }
            if(i%3==1)
            {

                wang.add(c);
            }
            if(i%3==2)
            {
                liu.add(c);
            }
        }

        //得到最后的底牌
        System.out.println("底牌为："+allCard.subList(allCard.size()-3,allCard.size()));
        //给玩家的牌排序

        sortCards(zhao);
        sortCards(wang);
        sortCards(liu);

        System.out.println("赵老板的牌："+zhao);
        System.out.println("王老板的牌："+wang);
        System.out.println("刘老板的牌："+liu);

    }

    private static void sortCards(List<card> zhao) {
        Collections.sort(zhao, (o1, o2)-> o1.getIndex()- o2.getIndex());
    }
}
