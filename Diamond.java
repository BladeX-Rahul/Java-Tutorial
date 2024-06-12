import java.util.Scanner;
class Diamond{
    public static void main(String[] args){
        int n,i,j;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        n = sc.nextInt();
        // upper half
        for(i=1;i<=n;i++)
        {//spaces
            for(j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            // stars
            for(j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        // lower half
        for(i=n;i>=1;i--)
        {//spaces
            for(j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            // stars
            for(j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}