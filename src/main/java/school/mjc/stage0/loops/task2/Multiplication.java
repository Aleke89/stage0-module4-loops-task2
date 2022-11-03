package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        int i =0;
        int sys = Math.abs(multiplyByAndToInclusive);
        if(multiplyByAndToInclusive==0){

        }else{
        while (i<=sys) {
            System.out.println(i * multiplyByAndToInclusive);
            i++;
        }
        }
    }
}
