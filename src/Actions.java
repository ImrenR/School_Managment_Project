import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Actions {
   static String kisiTuru;
    static  Scanner input= new Scanner(System.in);
    static  List<Teacher> teacherList = new ArrayList<>();
    static List<Student> studentList=new ArrayList<>();

    public static void girisPaneli(){
        System.out.println("**********************************      \nOGRENCI VE OGRETMEN ANA MENU " +
                "\n**********************************\n1- OGRENCI ISLEMLERI\n2- OGRETMEN ISLEMLERI\nQ- CIKIS \nLutfen yapmak istediginiz islemi giriniz : ");
        String islemSecim = input.next().toUpperCase();

        switch (islemSecim) {

    case "1":
        kisiTuru = "OGRENCI";
        islemMenu();

        break;
    case "2":
        kisiTuru = "OGRETMEN";
        islemMenu();
        break;
    case "Q":
        cikis();
        break;
    default:
        System.out.println("Hatali giris yaptiniz tekrar deneyiz ..");
        girisPaneli();
        break;
}



    }

    private static void cikis() {
       System.exit(0);
    }

    private static void islemMenu() {
        System.out.println("Sectiginiz kisi turu : " + kisiTuru
                + "\n ISLEM MENU \n Asagidaki islemlerde tercihinizi yapiniz ..." +
                "\n***********"
               + kisiTuru + "ISLEMLERI ********"
                + "\n1-EKLEME \n2-ARAMA\n3-LISTELE\n4-SILME\n0-ANA MENU");
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

        girisPaneli();
        break;
    default:
        System.out.println("Hatali giris yaptiniz tekrar deneyiz ..");
        islemMenu();
        break;
}
    }

    private static void silme() {
        System.out.println("***" + kisiTuru + "Silme sayfasi***");

        if (kisiTuru.equalsIgnoreCase("OGRENCI")) { //yapilacak islem icin ogretmen - ogrenci kontorlu
            System.out.println("Kaydi ilinecek OGRENCI icin kimlik no giriniz : ");
            String silinecekId = input.nextLine();
            for (Student avuc : studentList) {
                if (avuc.getId().equalsIgnoreCase(silinecekId)) {
                    System.out.println("Aradiginiz ogrenci =" + avuc.getNameSurname() + "listemizden silinmistir");
                    studentList.remove(avuc);
break;
                } else {
                    System.out.println("Silinecek ogrenci kayitlarda bulunamadi");
                    silme();
                }
            }

        }
        else {
            System.out.println("***" + kisiTuru + "Silme sayfasi***");
        }

        if (kisiTuru.equalsIgnoreCase("Ogretmen")) { //yapilacak islem icin ogretmen - ogrenci kontorlu
            System.out.println("ogretmen icin kimlik no giriniz : ");

            String silinenId = input.nextLine();
            for (Teacher avuc : teacherList) {
                if (avuc.getId().equalsIgnoreCase(silinenId)) {
                    System.out.println("Silinecek ogrenci =" + avuc.getNameSurname() + "Listeden silinmistir");
               teacherList.remove(avuc);
               break;
                } else {
                    System.out.println("Silinecek ogretmenin kaydi yok");
                    silme();
                }
            }


        }
        else {
            System.out.println("OGretmen kaydi yok");
            arama();

        }
        islemMenu();


    }

    private static void listele() {
        System.out.println("***" + kisiTuru +"Listeleme sayfasi***");
        if(kisiTuru.equalsIgnoreCase("OGRENCI")){ //yapilacak islem icin ogretmen - ogrenci kontorlu

            System.out.println(studentList);
            islemMenu();

        }else {

            System.out.println(teacherList);
            islemMenu();
            }
    }

    private static void arama() {
        System.out.println("***" + kisiTuru + "arama sayfasi***");

        if (kisiTuru.equalsIgnoreCase("OGRENCI")) { //yapilacak islem icin ogretmen - ogrenci kontorlu
            System.out.println("OGRENCI icin kimlik no giriniz : ");

            String arananId = input.nextLine();
            for (Student avuc : studentList) {
                if (avuc.getId().equalsIgnoreCase(arananId)) {
                    System.out.println("Aradiginiz ogrenci listede kayitli!");
                break;
                } else {
                    System.out.println("Kayit yok");
                    arama();
                }
            }

        }
        else {
            System.out.println("***" + kisiTuru + "arama sayfasi***");
        }

            if (kisiTuru.equalsIgnoreCase("Ogretmen")) { //yapilacak islem icin ogretmen - ogrenci kontorlu
                System.out.println("ogretmen icin kimlik no giriniz : ");

                String arananId = input.nextLine();
                for (Teacher avuc : teacherList) {
                    if (avuc.getId().equalsIgnoreCase(arananId)) {
                        System.out.println("Aradiginiz ogrenci listede kayitli!");
                 break;
                    } else {

                        System.out.println("Kayit yok");
                        arama();
                    }
                }


            }
            else {
                System.out.println("OGretmen kaydi yok");
                arama();

            }
islemMenu();

    }

    private static void ekle() {
        System.out.println("***" + kisiTuru +"ekleme sayfasi***");
          if(kisiTuru.equalsIgnoreCase("OGRENCI")){ //yapilacak islem icin ogretmen - ogrenci kontorlu
            System.out.println("OGRENCI icin ad-soyad giriniz : ");
           // String adSoyad = input.nextLine(); dumy icin asagiyi kullan
            String adSyoad = new Scanner(System.in).nextLine();

            System.out.println("OGRENCI isin kimlik no giriniz : ");
           String kimlikNo = input.nextLine();
           input.nextLine();
            System.out.println("OGRENCI isin yas giriniz : ");
            int yas = input.nextInt();
            System.out.println("OGRENCI isin ogrenci no giriniz : ");
            String ogrenciNo = input.nextLine();
            input.next();
            System.out.println("OGRENCI isin sinifini giriniz : ");
            String classs = input.nextLine();
            input.nextLine();
          Student ogrenciObj = new Student(adSyoad,yas,kimlikNo,ogrenciNo,classs);
          studentList.add(ogrenciObj); // listeye girilen var lar eklendi
            System.out.println("Ogrenciniz " + ogrenciObj.getNameSurname() + " basariyla eklenmistir...\nOGRENCI islem menusuna yonelendiriliyorsunuz..");
          islemMenu();

        }else {
            System.out.println("***" + kisiTuru +"ekleme sayfasi***");
            if(kisiTuru.equalsIgnoreCase("OGRETMEN")){ //yapilacak islem icin ogretmen - ogrenci kontorlu
                System.out.println("Ogretmen isin ad-soyad giriniz : ");
                // String adSoyad = input.nextLine(); dumy icin asagiyi kullan
                String adSyoad = new Scanner(System.in).nextLine();

                System.out.println("Ogretmen isin kimlik no giriniz : ");
                String kimlikNo = input.nextLine();
                input.nextLine();
                System.out.println("Ogretmen isin yas giriniz : ");
                int yas = input.nextInt();
                System.out.println("Ogretmen isin sicil no giriniz : ");
                int sicilNo = input.nextInt();
                input.next();
                System.out.println("Ogretmenin bolumunu giriniz : ");
                String bolum = input.nextLine();
               Teacher ogretmenObj = new Teacher(adSyoad,yas,kimlikNo,sicilNo,bolum);
               teacherList.add(ogretmenObj); // listeye girilen var lar eklendi
                System.out.println("Ogretmen = " + ogretmenObj.getNameSurname() + " basariyla eklenmistir...\nOGRENCI islem menusuna yonelendiriliyorsunuz..");
                islemMenu();

            }
    }
}
}
