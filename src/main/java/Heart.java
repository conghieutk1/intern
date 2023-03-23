public class Heart {
    public void drawHeart(int n) {

        int m, a,b, p, q;


        m = 1;
        a = n;
        p = 2*n - 1;

        q = 0;

        if (n % 2 == 1) {
            n /= 2;
            b = n/2;
        }
        else {
            n = ((n+1) / 2);
            b = (n)/2;
        }

        while (n > 0)
        {

            if (a % 2 == 1) {
                if (n > (b/2 + 1)) {
                    n--;
                    q += 2;
                    continue;
                }
                for (int i = 0; i<n; i++)
                    System.out.print(" ");
                for (int k = 0; k <= q; k ++)
                    System.out.print("*");
                for (int i = 1; i < 2*n; i++)
                    System.out.print(" ");
                for (int k = 0; k <= q; k ++)
                    System.out.print("*");
            } else {
                if (n > (b/2 + 1)) {
                    n--;
                    q += 2;
                    continue;
                }
                for (int i = 0; i<n; i++)
                    System.out.print(" ");
                for (int k = 0; k < q; k ++)
                    System.out.print("*");
                for (int i = 1; i < 2*n; i++)
                    System.out.print(" ");
                for (int k = 0; k < q; k ++)
                    System.out.print("*");
            }

            n -- ;
            q += 2 ;
            System.out.println("");
        }

        if (a > 5) {
            for (int k = 1; k <= 2*a -1; k ++)
                System.out.print("*");
            System.out.println("");
        }

        while (m <= a)    {
            for (int i = 1; i<m; i++)
                System.out.print(" ");
            for (int k = 1; k <= p; k ++)
                System.out.print("*");
            m ++ ;
            p -= 2 ;
            System.out.println("");
        }
    }
}
