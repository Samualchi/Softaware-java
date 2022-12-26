import java.util.Scanner;

public class main
{
    public static void main(String[] args)
    {

        int i=0;
        Advertising ads= new ProxyAdvertising("https://www.youtube.com/watch?v=qDjxM2nLVRs");
        ads.showAd();
        i++;
        Scanner scan = new Scanner(System.in);
        System.out.println(" "+i);
        System.out.println("Launch again? 1.Y 2.N\n");
        int a= scan.nextInt();
        switch(a)
        {
            case 1:
            {
                ads.showAd();
                i++;
                System.out.println("Launch again? 1.Y 2.N\n");
                System.out.println(" "+i);
                return;
            }
            case 2: System.exit(0);
        }
        System.out.println(" "+i);
    }
}
