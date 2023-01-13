/*
 * Copyright (c) 2023 by Sanidhya Varshney.
 */



public class DistinctPrimeFactors {
    public int distinctPrimeFactors(int[] nums) {
        int count=0;
        int[] a = new int[1001];

        for(int x:nums){
            primeFactors(x,a);
        }

        for(int x:a){
            if(x==1)
                count++;
        }
        return count;
    }

    private void primeFactors(int x,int[] a)
    {
        int root = (int)Math.sqrt(x);
        for (int i=2; i<=root; i++) {
            while (x%i == 0) {
                x/=i;
                a[i]=1;
            }
        }

        if(x>=2)
            a[x]=1;
    }
}
