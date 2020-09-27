package mypack;
import java.util.Scanner;

public class myclass {
       public static void main (String[]args){

                  Scanner input = new Scanner (System.in);

                  double sayi1,sayi2;
                  int secenek;

                  System.out.println("Birinci değeri giriniz");
                  sayi1= input.nextDouble();

                  System.out.println("İkinci Değeri Giriniz");
                  sayi2= input.nextDouble();

                  System.out.println("Yapmak İstiğiniz İşlemi Seçiniz");
                  System.out.println("Toplama=1 , Çıkarma=2, Çarpma=3, Bölme=4");
                  secenek = input.nextInt();



                  if (secenek==1)
                  {
                        System.out.println("Sonuc="+ (sayi1+sayi2));
                  }

                  else if (secenek==2)
                  {
                        System.out.println("Sonuc="+ (sayi1-sayi2));
                  }

                  else if(secenek==3)
                  {
                        System.out.println("Sonuc="+ (sayi1*sayi2));
                  }

                  else if(secenek==4)
                  {
                        System.out.println("Sonuc=" + (sayi1/sayi2));
                  }

                  else
                  {
                        System.out.println("Yanlış seçenek");
                  }




            }



      }
