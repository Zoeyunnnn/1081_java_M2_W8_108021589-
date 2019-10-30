import java.util.Scanner;

public class M2Q3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        char c = '*';String sum = "";
        for (int i=1;i<=n;i++){
            for (int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            sum += c;
            System.out.println(sum);
        }
    }
}
