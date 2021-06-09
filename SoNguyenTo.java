package ThuatToanATTT;

import java.util.Scanner;

public class SoNguyenTo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N;
        System.out.println("Nhap n:");
        N = scanner.nextInt();

        boolean[] check = new boolean[N+1];
        for (int i = 2; i <= N; i++){
            check[i] = true;
        }

        for (int i = 2; i <= N; i++){
            if (check[i] == true){
                for (int j = 2*i; j <= N; j+= i){
                    check[j] = false;
                }
            }
        }

        System.out.println("Cac so nguyen to < " + N + " la :");
        for (int i = 2; i <= N; i++){
            if (check[i] == true){
                System.out.print(" "+i);
            }
        }
    }
}




