import java.util.Scanner;

public class M2Q5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String str="";
        while (n>0) {
            str = Integer.toString(n%2)+str;
            n /= 2;
        }
        /*int a = str.length();
        for (int i=1;i<=8-a;i++){
            str = "0"+str;}*/
        System.out.printf("%08d\n",Integer.parseInt(str));
    }
}
