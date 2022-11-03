package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        int f = 0;
        while(f<printToInclusive){
            checkPrime(f);
            f++;
        }

}
    static void checkPrime(int n){
        int i,m=0,flag=0;
        m=n/2;
        if(n==0||n==1){
        }else{
            for(i=2;i<=m;i++){
                if(n%i==0){
                    flag=1;
                    break;
                }
            }
            if(flag==0)  { System.out.println(n); }
        }//end of else
    }

}
