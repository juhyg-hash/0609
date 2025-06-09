import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main (String[] args){
        int[] numbers = {1,2,3,4,5};


        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);
        System.out.println(numbers[3]);
        System.out.println(numbers[4]);





        for(int i = 0; i < numbers.length ; i++) {
            System.out.println(numbers[i]);
        }
        //주로 이구조로 사용
        //내리차림으로 해보기
        for(int i = numbers.length-1; i >= 0; i--){
            System.out.println(numbers[i]);
        }

//        System.out.println(Arrays.toString(numbers));
        System.out.println(numbers.length);



    }
}