import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 1; i<=n; i++){
            //Space
            for(int j = 1; j<=i-i; j++){
                System.out.print(" ");
        }
        for(int j = 1; j<=2*i; j++){
            System.out.print("*");
        }
        System.out.println();
}
       // lower half
       for(int i = n-1; i>=1; i--){
        //Space
        for(int j = 1; j<=i-i; j++){
            System.out.print(" ");
    }
    //ist part
    for(int j = 1; j<=2*i-1; j++){
        System.out.print("*");
        }
        System.out.println();
        }
}
\end{code}