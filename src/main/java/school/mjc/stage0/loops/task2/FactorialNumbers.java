package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int result = 1;
        int count = 0;
         while (count <= printToInclusive) {
                if (count == 0)
                    result=1;
                else {
                result*=count;
                }
                count++;
                System.out.println(result);
         }
    }
}
