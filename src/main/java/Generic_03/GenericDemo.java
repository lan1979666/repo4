package Generic_03;

public class GenericDemo {
    public static void main(String[] args) {
        //多态创建对象，确定变量类型
        Generic<String> g1=new GenericImpl<String>();
        g1.show("林青霞");

        Generic<Integer> g2=new GenericImpl<Integer>();
        g2.show(30);

    }
}
