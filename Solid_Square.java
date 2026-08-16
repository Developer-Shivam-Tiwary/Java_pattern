import java.lang.*;
import java.util.Scanner;
public class Solid_Square{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter row: ");
        int n=sc.nextInt();
        
        for(int row=1; row<=n; row++){
            for(int col=1; col<=n; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
//vary row and coloumn
System.out.println("Enter row and coloumn: ");
int row=sc.nextInt();
int col=sc.nextInt();

for(int i=1; i<=row; i++){
    for(int j=1; j<=col; j++){
        System.out.print("* ");
    }
    System.out.println();
}
        
}
}

