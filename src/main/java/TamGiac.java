public class TamGiac {
    public void drawTGCan(int n) {
        int q = 0;
        while (n > 0)
        {
            for (int i = 1; i<n; i++)
                System.out.print(" ");
            for (int k = 0; k <= q; k ++)
                System.out.print("*");
            n -- ;
            q += 2 ;
            System.out.println("");
        }
    }

    public void drawTGVuongTrai(int n) {
        int i,j;
        for(i = 1; i <= n; i++) {
            for(j = 1; j <= i; j++)
                System.out.print("*");

            System.out.println("");
        }
    }

    public void drawTGVuongPhai(int n) {
//        int i,j;
//        for(i = 1; i <= n; i++) {
//            for(j = 1; j <= i; j++)
//                System.out.print("*");
//
//            System.out.println("");
//        }

        int q = 0;
        while (n > 0)
        {
            for (int i = 0; i<n; i++)
                System.out.print(" ");
            for (int k = 0; k <= q; k ++)
                System.out.print("*");
            n -- ;
            q += 1 ;
            System.out.println("");
        }
    }
}
