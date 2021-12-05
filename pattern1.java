import java.util.Scanner;
class pattern1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number");
        int n=sc.nextInt();
        for(int i=1,x=1,y=n/2;i<=n;i++){

            for(int j=1;j<=y;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=x;j++){
                System.out.print("*");
            }
            if(i>(n/2)){
                x-=2;
                y++;
            }
            else{
            y--;
            x+=2;
            }
            System.out.println();
        }
    }
}