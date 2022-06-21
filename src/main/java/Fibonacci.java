import java.util.Arrays;

public class Fibonacci {

    public static String answer (int loopType, int n){
        return Arrays.toString(calculate(loopType,n));
    }

    public static int[] calculate (int loopType,int n){
        int[] answer = new int[n];
        switch (loopType){
            case 1:
                answer = fibonacciFor(n);
                break;
            case 2:
                answer = fibonacciWhile(n);
                break;
            case 3:
                answer = fibonacciDoWhile(n);
        }
        return answer;
    }



    public static int[] fibonacciFor(int a) {
        int[] array = new int[a + 1];
        array[0] = 0;
        array[1] = 1;
        if (a<2)
            return array;
        for (int i = 2; i < array.length; i++) {
            array[i] = array[i - 1] + array[i - 2];
        }
        return array;
    }



    public static int[] fibonacciWhile(int n) {
        int[] arr1 = new int[n];
        int i = 2;
        arr1[0] = 0;
        arr1[1] = 1;
        while (i < n) {
            arr1[i] = arr1[i - 1] + arr1[i - 2];
            i++;
        }
        return arr1;
    }

    public static int[] fibonacciDoWhile(int n) {
        int[] arr1 = new int[n];
        int i = 2;
        arr1[0] = 0;
        arr1[1] = 1;
        do {
            arr1[i] = arr1[i - 1] + arr1[i - 2];
            i++;
        } while (i < 15);
        return arr1;
    }
}
