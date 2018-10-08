package academy.learnProgramming;

import static academy.learnProgramming.Config.printConfig;
import static java.lang.Math.min;

public class StaticImports {

    public static void main (String[] args) {

        int min = min(5,7);

        System.out.println("minimum value of 5& 7 = " + min);

        printConfig();
    }
}
