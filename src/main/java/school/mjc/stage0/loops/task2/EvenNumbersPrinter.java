package school.mjc.stage0.loops.task2;

public class EvenNumbersPrinter {
    public void printEvenNumbers(int printTillInclusive) {
        int a = 0;
        while (a<=printTillInclusive) {
            if (a%2==0 && a>0)
                System.out.println(a);
            a++;
        }
    }
}
