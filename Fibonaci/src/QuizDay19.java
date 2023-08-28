import java.awt.*;
import java.util.Arrays;
import java.util.stream.Stream;

class QuizDay19{
    public static void main(String[] args) {
        int[] ar = {1,2,3,4,5,6};

        Integer re = Arrays.stream(ar).map(i->i).reduce(0,(a, b)->a+b);
        System.out.println(re);

        System.out.println("******************************");
        for (int i: ar){
            System.out.println(i);
        }

    }
}