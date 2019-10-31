import java.util.Scanner;

public class M2Q7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int listen,read,speak,failN;
        for (int i=0;i<n;i++){
            failN=0;
            listen = sc.nextInt();
            read = sc.nextInt();
            speak = sc.nextInt();

            if (listen<60)failN++;
            if (read<60)failN++;
            if (speak<60)failN++;

            if (failN==0) System.out.println('P');
            else if (failN==1){
                if ((listen+read+speak>=220)){
                System.out.println('P');
                }else {
                System.out.println('M');
                }
            }else if (failN==2){
                if (listen>=80 || read>=80 || speak>=80){
                    System.out.println('M');
                }else System.out.println('F');
            }else {
                System.out.println('F');
            }
        }
    }
}
