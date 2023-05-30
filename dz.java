package Algorithms;

public class dz {
    public static void main(String[] args) {
        int[] arr={11,5,27,23,88,23,323,3,7,219};
        System.out.println(findSumThreeNumber(3, 6, 2));
        System.out.println(findMaxNumber(arr));
    }

    public static int findSumThreeNumber(int a, int b, int c) {
        return a + b + c;
    }
    public static int findMaxNumber(int[]arr){
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(max<arr[i]){
                max=arr[i];
            }
        }
        return max;
    }
}
