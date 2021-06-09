package ThuatToanATTT;

import java.util.Scanner;

public class PollardRho {
    public int GCD(int x,int y){
        int GCD = 0;
        for(int i = 1; i <= x || i <= y; i++){
            if((x%i==0) && (y%i==0)){
                GCD = i;
            }
        }
        return GCD;
    }

    public int mode(int x,int n){
        return ((x*x)+1)%n;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.println("Nhap n:");
        n = scanner.nextInt();
        int x = 2;
        int y = 2;
        int d = 1;

        PollardRho pr = new PollardRho();
        for(int i = 1; i <= x || i <= y; i++){
        while (d == 1) {
            x = pr.mode(x, n);
            y = pr.mode(pr.mode(y, n), n);
            d = pr.GCD((x - y), n);
                }
        }

        if(d == n){
            System.out.println(" khong tim thay thua so!! ");
        } else {
            System.out.println("mot trong nhung thua so khong tam thuong cua " + n + " la : "+d);
        }
    }
}
