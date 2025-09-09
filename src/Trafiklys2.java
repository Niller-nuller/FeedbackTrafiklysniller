import java.util.Scanner;

public class Trafiklys2 {
    public static void main(String[] args) {
        int nTime;
        int nTraf;
        int nArea;
        boolean nEmc;

        Scanner input = new Scanner(System.in);

        System.out.print("Indksriv tid på dagen 0-24:");
        int uTime = input.nextInt();

//        System.out.println("Indskriv trafik mængde lav eller hæj");
//        String uTraf = input.nextLine();
//
//        System.out.println("Indskriv område. Bolig, Erhver eller Blandet");
//        String uArea = input.nextLine();
//
//        System.out.println("Er det en nødstistaion. Ja/Nej");
//        String uEmc = input.nextLine();
        //Setup
        switch (uTime) {
            case 6,7,8,9,10,11,12,13,14,16:
                nTime = 1;
                break;
            case 17,18,19,20,21,22,23:
                nTime = 2;
                break;
            default:
                nTime = 3;
        }
            System.out.println(nTime);




        }

    }

