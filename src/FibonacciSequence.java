/**
 * Created by joe on 1/3/17.
 */
public class FibonacciSequence {

    public static void fibonacciClassic(int counter){

        int i = 1;
        int k = 1;
        countingMechanism(i,k, counter);
    }

    public static void fibonacciModified(int startingValue, int counter){
        int i = startingValue;
        int k = (int)Math.round(i/2);
        countingMechanism(i,k,counter);

    }

    public static void countingMechanism(int i, int k,int counter){

        int h = 0;
        int j = 0;
        System.out.println(i);
        System.out.println(k);

        while(j < counter){
            h = i + k;
            i = k;
            k = h;
            if(h % 15 == 0){
                System.out.println("FizzBuzz");
            }
            else if(h % 5 == 0){
                System.out.println("Buzz");
            }
            else if(h % 3 == 0){
                System.out.println("Fizz");
            }
            else {
                System.out.println(h);
            }
            j++;
        }
    }

    //this was done just to show it could be
    public static void fibForLoop(int counter){
        int i = 1;
        int k = 1;
        int h = 0;
        System.out.println(k);
        for(i = 1; i <= counter; i = i + k){
            h = i;
            i = k;
            k = h;
            System.out.println(h);
        }
    }

    //done to show what can go wrong
    public static void fibPowerOfTwo(int counter){
        int i = 1;
        int k = 1;
        System.out.println(k);
        for(int j = 0; j <= counter;j++){
            System.out.println(i);
            i += k;
            k = i;
        }
    }

    //TODO: this doesn't work.
    public static void fibBackwards(int startingValue){

        System.out.println(startingValue);

        int i = startingValue;
        int k = (int)Math.round(i/2);
        int h = 0;
        while(i > 0){
            System.out.println(k);
            i = i - k;
            h = i;
            k = h;
        }
    }

}
