package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        int nMinusOne = 1;
        int nMinusTwo = 0;
        int nCurrent = 0;

        if (lastFibonacci == 0) System.out.println(0);
        else {
            for (int i = 1; i <= lastFibonacci; i++) {
                System.out.println(nCurrent);
                nCurrent = nMinusTwo + nMinusOne;
                nMinusOne = nMinusTwo;
                nMinusTwo = nCurrent;
            }
        }
    }
}
