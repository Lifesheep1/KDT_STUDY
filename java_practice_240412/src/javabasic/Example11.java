package javabasic;

public class Example11 {
    /**
     * 주어진 정수 배열에서 최댓값과 최솟값을 찾아 출력하는 프로그램을 작성하세요.
     */
    public static void main(String[] args) {
        int[] arr = {1,24,6,7,8,1};

        Example11 obj = new Example11();
        obj.printNumber(arr);
    }
    public void printNumber(int[] arr) {
        int max = arr[0];
        int min = arr[0];

        for(int i = 0; i< arr.length; i++){
            if(max<arr[i]){
                max = arr[i];
            }
            if(min>arr[i]){
                min = arr[i];
            }
        }
        System.out.println("최대값은 "+ max);
        System.out.println("최소값은 "+ min);
    }
}
