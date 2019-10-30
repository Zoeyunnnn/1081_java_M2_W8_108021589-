import java.util.Scanner;

public class M2Q9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int v1 = sc.nextInt();
        int v2 = sc.nextInt();

        int sum =0;
        for (int i=v1;i>1;i--){
            if (v1%i==0 && v2%i==0){
                sum = i;
                break;
            }
        }System.out.println(sum);
        System.out.println((v1*v2)/sum);
    }
}
