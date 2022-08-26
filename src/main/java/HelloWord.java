
public class HelloWord {
    public static void main(String[] args) {
      /*StringBuilder sb =new StringBuilder();
      sb.append("hello");
      sb.append("world");
      sb.append("java");

      String s=sb.toString();
      System.out.println(s);*/

      String s ="hello";
      StringBuilder sb=new StringBuilder(s);
      System.out.println(s);

      StringBuilder sb1 =new StringBuilder();
      sb1.append("hello");
      sb1.append("wodld");
      sb1.append("java");
      sb1.append(100);
      sb1.reverse();
      System.out.println(sb1);

      String a= sb1.toString();
      System.out.println(a);


      String c ="hello";
      StringBuilder vg= new StringBuilder(c);
      System.out.println(c);


    }


}



















