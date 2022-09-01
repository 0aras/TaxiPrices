import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {

        Scanner tara= new Scanner(System.in);
        System.out.println("Gidilen mesafeyi giriniz ");
        int mesafe= tara.nextInt();
        double base= 10;
        int hava_p=20;
        double tutar=(base)+(double)mesafe*2.20;
        if (tutar>=20)
        {
            System.out.println( "Ücret: "+tutar+" TL");
        }else{
            System.out.println("Ücret: "+hava_p+" TL" );
        }
    }
}