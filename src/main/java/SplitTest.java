public class SplitTest {

    public static void main(String[] args) {
        String str = "刘俊k刘欢123";
        System.out.println(str.charAt(0));
        System.out.println(str.charAt(1));
        //根据分割符，分割成数组返回
        String[] split = str.split("k");
        System.out.println(split[0]);
        System.out.println(split[1]);
        //根据下标截取字符串
        String substring = str.substring(0, 2);
        System.out.println(substring);

        String a = new String("abc");
        String b = new String("abc");
        System.out.println(a==b);
        System.out.println(a.equals(b));

    }


}
