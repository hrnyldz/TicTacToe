/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoeoyun;

import java.util.Scanner;

/**
 *
 * @author MURAT
 */
public class TicTacToeOyun {

    public static void main(String[] args) {
             int n,x;
             Scanner klavye=new Scanner(System.in);
             System.out.print("Oyun boyutunu girin (3 - 5 - 7) : ");
             n=klavye.nextInt();
            OyunTahtasi benimoyunum =new OyunTahtasi(n);
            benimoyunum.OyunTahtasiniYazdir(n); 
            int sayac=1;
            x=n*n;
       
       
       
       
       while (benimoyunum.Oyna()&& sayac <x+1)
       {
           if(sayac %2  ==  0)
               benimoyunum.bilgisayar('O',n);
           else
                benimoyunum.oyuncuSor('X',n);
           sayac++; 
           
           System.out.println("\n"); 
         benimoyunum.OyunTahtasiniYazdir(n); 
         benimoyunum.KazananKontrol(n);
         if(sayac==x+1)
         {
             System.out.print("\nBerabere");
         }
                
       }
        
       
    }
    
}
