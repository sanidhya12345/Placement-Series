public class TwoArraySum {
    static int calSum(int a[], int b[],
                          int n, int m)
    {
        int[] sum= new int[n];

        int i = n - 1, j = m - 1, k = n - 1;

        int carry = 0, s = 0;
        while (j >= 0)
        {
            s = a[i] + b[j] + carry;

            sum[k] = (s % 10);
            carry = s / 10;

            k--;
            i--;
            j--;
        }

        while (i >= 0)
        {
            s = a[i] + carry;
            sum[k] = (s % 10);
            carry = s / 10;

            i--;
            k--;
        }

        int ans = 0;
        if (carry == 1)
            ans = 10;
        for ( i = 0; i <= n - 1; i++) {
            ans += sum[i];
            ans *= 10;
        }

        return ans / 10;
    }
   private  static int Sum(int a[], int b[], int n,
                      int m)
    {
        if (n >= m)
            return calSum(a, b, n, m);

        else
            return calSum(b, a, m, n);
    }
    public static void main(String[] args)
    {
        int a[] = {1,2,3};
        int b[] = {4,5,6};
        int n = a.length;
        int m = b.length;
        System.out.println(Sum(a, b, n, m));
    }
}
