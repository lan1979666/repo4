public class MethodTest{
    public static void main(String[] srga) {
        int[] arr = {11, 23, 56, 88, 12};
        System.out.println(getMax(arr));
        int number = getMax(arr);
        System.out.println(number);


    }
    public static int getMax(int[] arr){
        int max =0;
        for(int x=1; x<arr.length;x++){
            if(max<arr[x]){
                max=arr[x];
            }
        }
        return max;
    }

}





