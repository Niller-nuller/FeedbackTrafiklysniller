import java.util.Objects;
import java.util.Scanner;

public class Trafiklys {
    public static void main(String[] args) {
        int nTime;
        int nTraf;
        int nArea;
        boolean nEmer;

        Scanner input = new Scanner(System.in);

        System.out.print("Hvad tid på dagen er det 0-24?.");
        int dTime = input.nextInt();

        System.out.println("Er trafikken lov eller high");
        String aTraffic = input.next();

        System.out.println("Skal du til erhverv, bolig eller blandet.");
        String dArea = input.next();

        System.out.println("Er det en nødsitasation");
        String dEmer = input.next();

        //Tid
        if (dTime >= 6 && dTime <= 12) {
             nTime = 1;
        }
        else if (dTime >= 13 && dTime <= 20) {
             nTime = 2;
        }
        else {
             nTime = 3;
        }
        //Traffik
        if (Objects.equals(aTraffic, "high") || Objects.equals(aTraffic, "High")) {
             nTraf = 1;
        }
        else{
             nTraf = 0;
        }
        //Area
        if (Objects.equals(dArea, "Bolig") || Objects.equals(dArea, "bolig")){
             nArea = 1;
        }
        else if (Objects.equals(dArea, "Erhverv") || Objects.equals(dArea, "erhverv")){
             nArea = 2;
        }
        else{
             nArea = 3;
        }
        //Boolean for nød
        nEmer = Objects.equals(dEmer, "Ja") || "ja".equals(dEmer);

        //Trafik Bestemelse
        if (nTime == 1 && nTraf == 0 || nEmer){
            System.out.println("Traffik flyver");
        }
        else if (nTime == 3 && nTraf == 0){
            System.out.println("Traffic er langsom");
        }
        else if (nTime == 2){
            System.out.println("Traffic er langsom");
        }
        else if (nTime == 3 && nTraf == 1){
            System.out.println("Traffic er stoppet");
        }
        else {
            System.out.println("Traffic er stoppet");
        }
        //Adgangs krav
        if (nTime == 3 && nArea == 1 && nEmer == false){
            System.out.println("Du er har ikke tilladelse");
        }
        else {
            System.out.println("Du er har tilladelse");
        }


    }
}
