package Manasa.com;

import java.util.Scanner;

public class FindNcrandNpr {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();

        int nFact = 1;
        int rFact = 1;
        int nrFact = 1;

        // n!
        for(int i = 1; i <= n; i++) {
            nFact = nFact * i;
        }

        // r!
        for(int i = 1; i <= r; i++) {
            rFact = rFact * i;
        }

        // (n-r)!
        for(int i = 1; i <= (n - r); i++) {
            nrFact = nrFact * i;
        }

        int ncr = nFact / (rFact * nrFact);
        int npr = nFact / nrFact;

        System.out.println("NCR = " + ncr);
        System.out.println("NPR = " + npr);
    }
}
