import java.util.Scanner;

public class M2Q2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        char c = '*';String sum = "";
        for (int i=1;i<=n;i++){
            sum += c;
            System.out.println(sum);
        }
    }
}
