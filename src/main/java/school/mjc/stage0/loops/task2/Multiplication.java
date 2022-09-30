package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        int count = 0;
        int result = 0;
        if (count < multiplyByAndToInclusive){
            while (count <= multiplyByAndToInclusive) {
                result = count * multiplyByAndToInclusive;
                System.out.println(result);
                count++;
            }
        }else {
            if (count < multiplyByAndToInclusive*-1) {
                while (count <= multiplyByAndToInclusive*-1) {
                    result = count * multiplyByAndToInclusive;
                    System.out.println(result);
                    count++;
                }
            }
        }
    }
}