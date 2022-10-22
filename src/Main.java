import java.util.Scanner;

public class Main {
    public static int SumaCifara(int n) {
        int suma = 0;
        while (n != 0) {
            int cifra = n%10;
            suma += cifra;
            n /= 10;
        }
        return suma;
    }
    public static void main(String[] args) {
        int n = 0;
        System.out.println("Unesite n: ");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        for (int i = 1; i <= n; i++) {
            if (i % SumaCifara(i) == 0)
                System.out.println(i);
        }

    }
}