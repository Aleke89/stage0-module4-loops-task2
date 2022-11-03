package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int i = 1;
        System.out.println(i);
        int facto = 1;
        while(i<=printToInclusive){
            facto=facto*i;
            System.out.println(facto);
            i++;
        }
    }


}
