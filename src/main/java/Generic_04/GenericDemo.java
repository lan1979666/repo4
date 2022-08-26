package Generic_04;

import java.util.ArrayList;
import java.util.List;

public class GenericDemo {
    public static void main(String[] args) {
        //类型通配符:<?>
        List<?> list1=new ArrayList<Object>();
        List<?> list2=new ArrayList<Number>();
        List<?> list3=new ArrayList<Integer>();

        //类型通配符上线：<?extends 类型>
        List<?extends Integer> list15=new ArrayList<Integer>();
        List<?extends Number> list4=new ArrayList<Number>();
        List<?extends Number> list5=new ArrayList<Integer>();
        List<?extends Object> list6=new ArrayList<Number>();
        List<?extends Object> list7=new ArrayList<Object>();
        List<?extends Object> list8=new ArrayList<Integer>();


        //类型通配符下限：<?super 类型>
        List<?super Object> list9=new ArrayList<Object>();
        List<?super Number> list10=new ArrayList<Object>();
        List<?super Number> list11=new ArrayList<Number>();
        List<?super Integer> list12=new ArrayList<Object>();
        List<?super Integer> list13=new ArrayList<Number>();
        List<?super Integer> list14=new ArrayList<Integer>();
    }
}
