import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class School_Managment {

    static String kisiTuru;
    static  Scanner input= new Scanner(System.in);
    static List<Teacher> teacherList = new ArrayList<>();
    static List<Student> studentList=new ArrayList<>();



    static void islemMenu() {
        System.out.println("The person you chosen : " + kisiTuru
                + "\n ACTION MENU " +
                "  \n CHOOSE A OPTION YOU WANT TO PROCEED ..." +
                "  \n***********"
                + kisiTuru + "ACTIONS" +
                "  ********"
                + "\n1-ADD " + kisiTuru +
                " \n2-SEARCH" +
                "\n3-LIST " +
                "\n4-DELETE" +
                "\n0-MAIN MENU");

        int islemTercihi = input.nextInt();

        switch (islemTercihi) {
            case 1:
                ekle();
                break;
            case 2:
                arama();
                break;
            case 3:
                listele();
                break;
            case 4:
                silme();
                break;
            case 0:
                Actions.girisPaneli();
                break;
            default:
                System.out.println("Please try again ..");
                islemMenu();
                break;
        }
    }

    private static void silme() {
        System.out.println("***" + kisiTuru + "erase page***");

        if (kisiTuru.equalsIgnoreCase("STUDENT")) {
            System.out.println("Enter an id for Student you want to delete = ");

            String silinecekId = input.nextLine();
            for (Student avuc : studentList) {
                if (avuc.getId().equalsIgnoreCase(silinecekId)) {
                    System.out.println("The student = " + avuc.getNameSurname() + "has been deleted from the list");
                    studentList.remove(avuc);
                    break;
                } else {
                    System.out.println("The student you are trying to delete not found in the list! Please try again..");
                    silme();
                }
            }

        } else {
            System.out.println("Something went wrong! You are directing to the action page");

        }

        if (kisiTuru.equalsIgnoreCase("TEACHER")) {
            System.out.println("Enter an id for teacheryou want to delete =");

            String silinenId = input.nextLine();
            for (Teacher avuc : teacherList) {
                if (avuc.getId().equalsIgnoreCase(silinenId)) {
                    System.out.println("The teacher = " + avuc.getNameSurname() + "has been deleted from the list");
                    teacherList.remove(avuc);
                    break;
                } else {
                    System.out.println("The teacher you would like to delete is not in the list" +
                            "1, Please try again..");
                    silme();
                }
            }


        }
        else {
            System.out.println("Something went wrong! You are directing to the action page");
            arama();

        }
        islemMenu();


    }

    private static void listele() {
        System.out.println("***" + kisiTuru +"list page ***");

        if(kisiTuru.equalsIgnoreCase("STUDENT")){

            System.out.println(studentList);
            islemMenu();

        }else {

            System.out.println(teacherList);
            islemMenu();
        }
    }

    private static void arama() {

        System.out.println("***" + kisiTuru + " searching page***");

        if (kisiTuru.equalsIgnoreCase("STUDENT")) {
            System.out.println("Please enter id s of Student = ");

            String searchedId = input.nextLine();

            for (Student avuc : studentList) { // Search this id in Student obj which we stored in studentlist. we called each id as AVUC
                if (avuc.getId().equalsIgnoreCase(searchedId)) {
                    System.out.println("The student you are searching for in the list !" + avuc.getNameSurname());
                    break; // when you find it break the loop

                } else {
                    System.out.println("There is no student in the list you are searching for! Please try again...");
                    arama();
                }
            } // end of for each

        } // end of if statement
        else {
            System.out.println("Something went went wrong please try again");
        }

        if (kisiTuru.equalsIgnoreCase("TEACHER")) {
            System.out.println("Enter id no of Teacher = ");

            String arananId = input.nextLine();
            for (Teacher avuc : teacherList) {
                if (avuc.getId().equalsIgnoreCase(arananId)) {
                    System.out.println("The teacher you are searching for has been found in the List" + avuc.getNameSurname());
                    break;
                } else {

                    System.out.println("There is no teacher in the list you are searching for..Please try again");
                    arama();
                }
            }


        }
        else {
            System.out.println("Something went went wrong please try again");


        }

        islemMenu();

    }

    private static void ekle() {
        System.out.println("***" + kisiTuru + " adding page ***");

        if (kisiTuru.equalsIgnoreCase("STUDENT")) {
            System.out.println("Enter a name and surname for Student :");
            // String adSoyad = input.nextLine();
            String adSyoad = new Scanner(System.in).nextLine(); // dumy

            System.out.println("Enter a id for Student :");
            String kimlikNo = input.nextLine();
            input.nextLine(); // dumy

            System.out.println("Enter an age for Student :");
            int yas = input.nextInt();

            System.out.println("Enter a student number for Student :");
            String ogrenciNo = input.nextLine();
            input.next(); /// dumy

            System.out.println("Enter a class name for Student :");
            String classs = input.nextLine();
            input.nextLine(); /// dumy

            Student studentObj = new Student(adSyoad, yas, kimlikNo, ogrenciNo, classs);
            studentList.add(studentObj);
            System.out.println("The student " + studentObj.getNameSurname() + " has been added successfully !" +
                    "\n You are directing to the student action menu ...");
            islemMenu();

        } else {
            System.out.println("***" + kisiTuru + " adding menu ***");
            if (kisiTuru.equalsIgnoreCase("TEACHER")) {
                System.out.println("Enter a name and surname for Teacherr:");
                // String adSoyad = input.nextLine();
                String adSyoad = new Scanner(System.in).nextLine();

                System.out.println("Enter a id for Teacher :");
                String kimlikNo = input.nextLine();
                input.nextLine(); // dumy

                System.out.println("Enter an age for Teacher :");
                int yas = input.nextInt();

                System.out.println("Enter a sicil number for Teacher:");
                int sicilNo = input.nextInt();
                input.next(); /// dumy

                System.out.println("Enter a section for Teacher :");
                String bolum = input.nextLine();

                Teacher teacherObj = new Teacher(adSyoad, yas, kimlikNo, sicilNo, bolum);
                teacherList.add(teacherObj);
                System.out.println("The teacher = " + teacherObj.getNameSurname() +

                        " has been added successfully..." +
                        "\nYou are direction to teacher action menu..");
                islemMenu();

            }
        }
    }
}

