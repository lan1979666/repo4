public class DebugTest {

    public static void main(String[] args) {
    int result = getMax(10,20);
    System.out.println(result);
    System.out.println(getMax(10,20));

    isEvenNumber();//调用方法

     sum(30,40);//调用方法

    }
    public static int getMax(int a,int b){// return 带参数方法
        if(a>b){
            return a;
        }else{
            return b;
        }
    }
    public static void isEvenNumber(){ //单个数据 方法
        int a=6;
        int b=4;
        if(a>b){
            System.out.println(a);
        }else{
            System.out.println(b);
        }
    }
    public static void sum(int a,int b){//多个数据方法
        if(a>b){
            System.out.println(a);
        }else{
            System.out.println(b);
        }
    }


}
