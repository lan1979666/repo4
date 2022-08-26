
public class StringBuilderTest {

    public static void main(String[] args) {
        String str = "abc";
        System.out.println(str);
        str += "123";
        System.out.println(str);


        StringBuilder sbi = new StringBuilder();
        sbi.append("abc");
        System.out.println(sbi);
        sbi.append("123");
        System.out.println(sbi);

        new StringBuilder(str);
    }

}
