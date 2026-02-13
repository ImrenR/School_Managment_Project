
import java.util.Scanner;

public class Actions extends School_Managment {

    static Scanner input = new Scanner(System.in);


    public static void girisPaneli() {
        System.out.println("***************" +
                " \nSTUDENT AND TEACHER ACTIONS " +
                "\n***************" +
                "\n1- STUDENT ACTIONS" +
                "\n2- TEACHER ACTIONS" +
                "\nQ- CIKIS " +
                "\nPlease choose an action you want to proceed: ");

        String actionOption = input.next().toUpperCase();

        switch (actionOption) {

            case "1":
                kisiTuru = "STUDENT";
                islemMenu();

                break;
            case "2":
                kisiTuru = "TEACHER";
                islemMenu();
                break;
            case "Q":
                cikis();
                break;
            default:
                System.out.println("Wrong entry, please try again");
                girisPaneli();
                break;
        }


    }

    private static void cikis() {
        System.exit(0);
    }
}


