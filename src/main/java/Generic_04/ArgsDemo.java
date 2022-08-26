package Generic_04;

/*
泛型可变参数
 */
public class ArgsDemo {
    public static void main(String[] args) {
        System.out.println(sum(10, 20, 30, 40));
        System.out.println(sum1(10, 20, 30, 40));

    }

    public static int sum(int... a) {
        int sum = 0;
        for (int i : a) {
            sum += i;
        }
        return sum;
    }

    public static int sum1(int b, int... a) {
        int sum1 = 0;
        for (int i : a) {
            sum1 += i;
        }
        return sum1;
    }
}
