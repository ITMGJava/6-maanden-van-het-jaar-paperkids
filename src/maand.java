import java.util.Scanner;

public class maand {

    public static void main(String[] args) {

        var scanner1 = new Scanner(System.in);
        int maand;

        //getal is de maand van het jaar
do {
    System.out.println("Kies een getal tussen 1 en 12:");
    maand = scanner1.nextInt();

}while ( maand > 12 | maand <=0);

        switch ( maand){
            case 1:
                System.out.println("Januari");
                break;
            case 2:
                System.out.println("Februari");
                 break;
            case 3:
                System.out.println("Maart");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("Mei");
                break;
            case 6:
                System.out.println("Juni");
                break;
            case 7:
                System.out.println("Juli");
                break;
            case 8:
                System.out.println("Augustus");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("Oktober");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:

        }

    }
}

