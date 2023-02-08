import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputNameOblast = sc.nextLine();

        Oblast oblast = Oblast.valueOf(inputNameOblast.toUpperCase());

        switch (oblast){
            case NARYN -> System.out.println("Tash rabat");
            case OSH -> System.out.println("Sulayman toosu");
            case JALAL_ABAD -> System.out.println(" :) ");
            case BATKEN -> System.out.println("aygyl gulu");
            case CHUY -> System.out.println("Bishkek borbor shaar");
            case YSSYK_KOL -> System.out.println("Yssyk kol kolu ");
            case TALAS -> System.out.println("bul oblastta Manastyn kumbozu bar");
//            default -> System.out.println("Mynday oblast jok");

        }
    }
}