import java.util.Scanner;

public class HesapMakinesi {

    static void Toplama(){
        Scanner inp = new Scanner(System.in);
        System.out.print("İlk sayıyı giriniz: ");
        int a = inp.nextInt();
        System.out.println("2. sayıyı giriniz: ");
        int b = inp.nextInt();
        int result = a+b;
        System.out.println("Toplam: "+result);
    }
    static void Cıkarma(){
        Scanner inp = new Scanner(System.in);
        System.out.print("İlk sayıyı giriniz: ");
        int a = inp.nextInt();
        System.out.println("2. sayıyı giriniz: ");
        int b = inp.nextInt();
        int result = a-b;
        System.out.println("Fark: "+result);
    }
    static void Çarpma(){
        Scanner inp = new Scanner(System.in);
        System.out.print("İlk sayıyı giriniz: ");
        int a = inp.nextInt();
        System.out.println("2. sayıyı giriniz: ");
        int b = inp.nextInt();
        int result = a*b;
        System.out.println("Fark: "+result);
    }
    static void Bolme(){
        Scanner inp = new Scanner(System.in);
        System.out.print("İlk sayıyı giriniz: ");
        int a = inp.nextInt();
        System.out.println("2. sayıyı giriniz: ");
        int b = inp.nextInt();
        if (b==0){
            System.out.println("Sayılardan biri 0 olamaz.");
        }
        int result=a/b;

        System.out.println("Bolum= "+result);

    }

    static void usAlma(){
        Scanner inp = new Scanner(System.in);
        System.out.println("Alt değeri giriniz:");
        int alt = inp.nextInt();
        System.out.println("Üs değeri giriniz");
        int us = inp.nextInt();
        int result=1;
        for (int i=1;i<=us;i++){
            result*=alt;
        }
        System.out.println(result);


    }
    static void Faktoriyel(){
        Scanner inp = new Scanner(System.in);
        System.out.print("Faktoriyel Hesaplanacak Sayı: ");
        int fakt= inp.nextInt();
        int result=1;
        for (int i=1;i<=fakt;i++){
            result*=i;
        }
        System.out.println(result);
    }
    static void Mod(){
        Scanner inp = new Scanner(System.in);
        System.out.println("Mod alınacak sayı giriniz: ");
        int m= inp.nextInt();
        System.out.println("İkinci sayıyı giriniz: ");
        int n= inp.nextInt();
        int result =  m%n;
        System.out.println(m+" Sayısının modu: "+result);
    }
    static void İslem(){


    }

    static void AlanHesaplama(){

        Scanner inp = new Scanner(System.in);
        System.out.println("Alanı hesaplanacak cisim seçiniz: "+"1- Kare\n"+"2- Dikdörtgen\n");

        int secim = inp.nextInt();

        switch (secim){
            case 1:
                System.out.println("İlk kenar giriniz: ");
                int ka= inp.nextInt();
                int kresult=ka*ka;
                System.out.println("Karenin alanı: "+kresult);
                break;
            case 2:
                System.out.println("Uzun kenar giriniz: ");
                int da= inp.nextInt();
                System.out.println("Kısa kenar giriniz: ");
                int db= inp.nextInt();
                int dresult=da*db;
                System.out.println("Dikdörtgenin alanı: "+dresult);
                break;

        }



    }
    static void CevreHesaplama(){

        Scanner inp = new Scanner(System.in);
        System.out.println("Çevresi hesaplanacak cismi seçiniz: ");
        System.out.println("1- Kare\n"+"2- Dikdörtgen");

        int secim = inp.nextInt();

        switch (secim){
            case 1:
                System.out.println("Kenar giriniz: ");
                int ka= inp.nextInt();
                int kresult=ka*4;
                System.out.println("Karenin çevresi: "+kresult);
                break;
            case 2:
                System.out.println("Uzun kenar giriniz: ");
                int da= inp.nextInt();
                System.out.println("Kısa kenar giriniz: ");
                int db= inp.nextInt();
                int dresult=(da+db)*2;
                System.out.println("Dikdörtgenin çevresi: "+dresult);
                break;

        }



    }







    public static void main(String[] args) {
        int secim;
        Scanner inp = new Scanner(System.in);

        String menu = "1- Toplama\n"+"2- Çıkarma\n"+"3- Çarpma\n"+"4- Bölme\n"+"5- Üs Alma\n"+
                "6- Faktöriyel\n"+"7- Mod Alma\n"+"8- Alan Hesaplama\n"+"9- Çevre Hesaplama";





        do {
            System.out.println(menu);
            System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz: ");
            secim = inp.nextInt();

            switch (secim){
                case 1:
                    Toplama();
                    break;
                case 2:
                    Cıkarma();
                    break;
                case 3:
                    Çarpma();
                    break;
                case 4:
                    Bolme();
                    break;
                case 5:
                    usAlma();
                    break;
                case 6:
                    Faktoriyel();
                    break;
                case 7:
                    Mod();
                    break;
                case 8:
                    AlanHesaplama();
                    break;
                case 9:
                    CevreHesaplama();
                    break;
                case 0:
                    System.out.println("Kapatılıyor\n"+"Lütfen Bekleyiniz");
                    break;
                default:
                    System.out.println("Yanlış Bir değer girdiniz.");


            }



        }
        while (secim!=0);


    }
}

