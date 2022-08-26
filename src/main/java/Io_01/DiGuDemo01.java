package Io_01;
/*
递归案例，求阶乘5的结果
阶乘：5！=5*4*3*2*1
 */
public class DiGuDemo01 {
    public static void main(String[] args) {
        int result = jc(5);
        System.out.println(result);
    }
 public static int jc(int n){
        if(n==1){
            return 1;
        }else{
            return n*jc(n-1);
        }
   }

}
