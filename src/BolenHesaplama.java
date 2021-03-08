import java.util.Scanner;

public class BolenHesaplama {
    public static void main(String[] args) {
        /*
         Kullanicidan pozitif bir tamsayi alin ve bu sayiyi tam bolen sayilari
         ve toplam kac tane olduklarini ekranda yazdirin
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Bölenleri bulmak için pozitif bir tamsayı giriniz.");
        int sayi = scan.nextInt();
        int bolen = 1;
        int count = 0;

        while (bolen <= sayi) {

            if (sayi % bolen == 0) {
                count++;
                System.out.println(bolen);

            }
            bolen++;
        }

        System.out.println(sayi + " sayisinin bolenleri : " + count + " adettir");
        
        bolen=1;
        count=0;
            
            while(bolen <= sayi) {
                
                if (sayi % bolen == 0) {
                    count++; 
                    System.out.println(count + "- " + bolen);
                    
                }
                bolen++;
            }

        }

    }
