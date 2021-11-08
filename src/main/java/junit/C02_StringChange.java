package junit;

public class C02_StringChange {
    /*
    Verilen bir String'deki ilk iki harfinde A var ise bunları silen method creat ediniz.
    AACD->CD ABC->BC A->"" AA->"" B->B
     */
    public static String ilkIkiASil(String str){
        if (str.length()<=2) {
            return str.replaceAll("A","");
        }
        String ilkIkiKarakter=str.substring(0,2);//0 ve 1. karakter
        String ilkIkiKarakterSonrasi=str.substring(2);//2 dahil kalanlar
        return ilkIkiKarakter.replaceAll("A","")+ilkIkiKarakterSonrasi;


    }
}