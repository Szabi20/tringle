import java.util.Scanner;
public class tringle {
    public static void main(String[] args){


        Scanner szam = new Scanner(System.in);
        System.out.println("Kérek egy számot:");
        int piramis2 = szam.nextInt();

        for(int i=1;i<=piramis2;i++){
        for(int j=0 ; j<1*i-0;j++)
                System.out.print("*");
            System.out.println();
        }



    }}
