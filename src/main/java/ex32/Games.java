package ex32;

import java.util.concurrent.ThreadLocalRandom;

public class Games {

    public static int diff1(){
        int randomNum = ThreadLocalRandom.current().nextInt(1, 10 + 1);
        return randomNum;
    }

    public static int diff2(){
        int randomNum = ThreadLocalRandom.current().nextInt(1, 100 + 1);
        return randomNum;
    }

    public static int diff3(){
        int randomNum = ThreadLocalRandom.current().nextInt(1, 1000 + 1);
        return randomNum;
    }
}
