package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
// 9+99+999+9999+99999
        int n = 0;
        int i = 0;
        int s = 0;

        if (lengthOfLastNumber <= 0) System.out.println(0);
        else {
            while (lengthOfLastNumber != 0) {
                n = n + 9 * (int) Math.pow(10, i);
                s = s + n;
                i++;
                lengthOfLastNumber--;
            }
            System.out.println(s);
        }
    }
}
