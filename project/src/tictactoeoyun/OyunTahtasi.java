/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoeoyun;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author MURAT
 */
public class OyunTahtasi {
    
 private char[][] OyunTahtasi;
    private boolean oyunoynaniyor=true;
   
    public OyunTahtasi(int n)
    {
         
         
       
        OyunTahtasi=new char[n][n];
        
        for(int i=0;i<OyunTahtasi.length;i++)
        {
            Arrays.fill(OyunTahtasi[i], ' ');
        }
        
    }
    public void OyunTahtasiniYazdir(int n) {
          
           if(n==3){
               for(int i=0;i<OyunTahtasi.length;i++){
              for(int j=0;j<OyunTahtasi[0].length;j++){
                  System.out.print("    "+OyunTahtasi[i][j]+"    ");
                  if(j==0||j==1)
                  {
                      System.out.print("|");
                  }
              }
              if(i==0||i==1)
             System.out.print("\n-----------------------------\n");
               
               }
                System.out.println();
           }
               if(n==5){
               for(int i=0;i<OyunTahtasi.length;i++){
                for(int j=0;j<OyunTahtasi[0].length;j++){
                  System.out.print("   "+OyunTahtasi[i][j]+"   ");
                  if(j==0||j==1||j==2||j==3)
                     {
                        System.out.print("|");
                        
                     }
                     }
                    if(i==0||i==1||i==2||i==3)
                         System.out.print("\n-----------------------------------------\n");
          
                 }
                System.out.println();
               }
               if(n==7)
               {
                   for(int i=0;i<OyunTahtasi.length;i++){
                for(int j=0;j<OyunTahtasi[0].length;j++){
                  System.out.print("   "+OyunTahtasi[i][j]+"   ");
                  if(j==0||j==1||j==2||j==3||j==4||j==5)
                  {
                      System.out.print("|");
                  }
                }
              if(i==0||i==1||i==2||i==3||i==4||i==5)
              System.out.print("\n---------------------------------------------------------\n");
               }
           
           
               System.out.println();
         }
         
   
             
    }
    public  boolean Oyna()
    {
        return oyunoynaniyor; 
    }
    public void oyuncuSor(char player,int n)
    {
        Scanner klavye=new Scanner(System.in);
        int i,j;
        do
        {
            System.out.printf("--Oyuncu Hamlasi-- x koordinatini giiniz (1-%d) : ",n);
            i=klavye.nextInt();
            System.out.printf("--Oyuncu Hamlesi-- y koordinatini giiniz (1-%d) : ",n);
            j=klavye.nextInt();
          
          
        }  while(gecerli_mi(i,j,n)); 
        HamleYap(player,i-1,j-1);
    }
    public void bilgisayar(char player,int n)
    {
        System.out.println("--Bilgisayarin Hamlesi--");
        int i,j;
        Random rnd = new Random();
        do{
            i=(int) (Math.random()* n+1);
            j=(int) (Math.random()* n+1);
        }while(gecerli_mi(i,j,n));
         HamleYap(player,i-1,j-1);
    }
    public boolean gecerli_mi(int i,int j,int n)
    {
       if(n==3)
       {
           if(i>3||i<1||j>3||j<1||!bosmu(i,j))
                return true;
            else
                return false;
       }
       if(n==5)
       {
           if(i>5||i<1||j>5||j<1||!bosmu(i,j))
                return true;
            else
                return false;
       }
        if(n==7)
       {
           if(i>7||i<1||j>7||j<1||!bosmu(i,j))
                return true;
            else
                return false;
       }
           
        return false;
    }
    public boolean bosmu(int i,int j)
    {
        if(OyunTahtasi[i-1][j-1]==' ')
            return true;
        else
        {
            System.out.println("Bu kordinat dolu");
            return false;
        }
            
       
    }
    public boolean HamleYap(char player,int i,int j){
        
        if(i>=0&&i<=6&&j>=0&&j<=6)
        {
             if(OyunTahtasi[i][j]!=' ')
             return false;
                
             else 
            {
                OyunTahtasi[i][j]=player;
                return true;
            }
        }
        else 
            return false;
       
        
    }
    public boolean KazananKontrol(int n)
    {
        //Düz Kontrol
        if(n==3)
        {
            for(int i=0;i<OyunTahtasi.length;i++)
        {
            if(OyunTahtasi[i][0]==OyunTahtasi[i][1]&&OyunTahtasi[i][1]==OyunTahtasi[i][2]&&OyunTahtasi[i][0]!=' ')
            {
                System.out.println("Kazanan  "+OyunTahtasi[i][0]);
                oyunoynaniyor=false;
            }
               
        }
        }
         if(n==5)
       {
           for(int i=0;i<OyunTahtasi.length;i++)
        {
            if(OyunTahtasi[i][0]==OyunTahtasi[i][1]&&OyunTahtasi[i][1]==OyunTahtasi[i][2]&&OyunTahtasi[i][2]==OyunTahtasi[i][3]&&OyunTahtasi[i][3]==OyunTahtasi[i][4]&&OyunTahtasi[i][0]!=' ')
                {
                System.out.println("Kazanan  "+OyunTahtasi[i][0]);
                oyunoynaniyor=false;
                }
        }
           
       }
       if(n==7)
       {
         for(int i=0;i<OyunTahtasi.length;i++)
        {
           if(OyunTahtasi[i][0]==OyunTahtasi[i][1]&&OyunTahtasi[i][1]==OyunTahtasi[i][2]&&OyunTahtasi[i][2]==OyunTahtasi[i][3]&&OyunTahtasi[i][3]==OyunTahtasi[i][4]&&OyunTahtasi[i][4]==OyunTahtasi[i][5]&&OyunTahtasi[i][5]==OyunTahtasi[i][6]&&OyunTahtasi[i][0]!=' ')
                {
                System.out.println("Kazanan  "+OyunTahtasi[i][0]);
                oyunoynaniyor=false;
                }
        }
            
        }
            
        //Yatay Kontrol
       if(n==3)
       {
           for(int j=0;j<OyunTahtasi.length;j++)
        {
            if(OyunTahtasi[0][j]==OyunTahtasi[1][j]&&OyunTahtasi[1][j]==OyunTahtasi[2][j]&&OyunTahtasi[0][j]!=' ')
                {
                System.out.println("Kazanan  "+OyunTahtasi[0][j]);
                oyunoynaniyor=false;
                }
        }
       }
       if(n==5)
       {
           for(int j=0;j<OyunTahtasi.length;j++)
        {
            if(OyunTahtasi[0][j]==OyunTahtasi[1][j]&&OyunTahtasi[1][j]==OyunTahtasi[2][j]&&OyunTahtasi[2][j]==OyunTahtasi[3][j]&&OyunTahtasi[3][j]==OyunTahtasi[4][j]&&OyunTahtasi[0][j]!=' ')
                {
                System.out.println("Kazanan  "+OyunTahtasi[0][j]);
                oyunoynaniyor=false;
                }
        }
           
       }
       if(n==7)
       {
           for(int j=0;j<OyunTahtasi.length;j++)
        {
            if(OyunTahtasi[0][j]==OyunTahtasi[1][j]&&OyunTahtasi[1][j]==OyunTahtasi[2][j]&&OyunTahtasi[2][j]==OyunTahtasi[3][j]&&OyunTahtasi[3][j]==OyunTahtasi[4][j]&&OyunTahtasi[4][j]==OyunTahtasi[5][j]&&OyunTahtasi[5][j]==OyunTahtasi[6][j]&&OyunTahtasi[0][j]!=' ')
                {
                System.out.println("Kazanan  "+OyunTahtasi[0][j]);
                oyunoynaniyor=false;
                }
        }
           
       }
       
      
        
        //Çapraz Kontrol
        if(n==3)
        {
            if(OyunTahtasi[0][0]==OyunTahtasi[1][1]&&OyunTahtasi[1][1]==OyunTahtasi[2][2]&&OyunTahtasi[0][0]!=' ')
         {
                System.out.println("Kazanan  "+OyunTahtasi[0][0]);
                oyunoynaniyor=false;
         }

        if(OyunTahtasi[0][2]==OyunTahtasi[1][1]&&OyunTahtasi[1][1]==OyunTahtasi[2][0]&&OyunTahtasi[0][2]!=' ')  
            {
                System.out.println("Kazanan  "+OyunTahtasi[1][1]);
                oyunoynaniyor=false;
           }
        }
        if(n==5)
        {
          if(OyunTahtasi[0][0]==OyunTahtasi[1][1]&&OyunTahtasi[1][1]==OyunTahtasi[2][2]&&OyunTahtasi[2][2]==OyunTahtasi[3][3]&&OyunTahtasi[3][3]==OyunTahtasi[4][4]&&OyunTahtasi[0][0]!=' ')
         {
                System.out.println("Kazanan  "+OyunTahtasi[0][0]);
                oyunoynaniyor=false;
         }

        if(OyunTahtasi[0][4]==OyunTahtasi[1][3]&&OyunTahtasi[1][3]==OyunTahtasi[2][2]&&OyunTahtasi[2][2]==OyunTahtasi[3][1]&&OyunTahtasi[3][1]==OyunTahtasi[4][0]&&OyunTahtasi[0][4]!=' ')  
            {
                System.out.println("Kazanan  "+OyunTahtasi[1][1]);
                oyunoynaniyor=false;
           }
        }
        if(n==7)
        {
          if(OyunTahtasi[0][0]==OyunTahtasi[1][1]&&OyunTahtasi[1][1]==OyunTahtasi[2][2]&&OyunTahtasi[2][2]==OyunTahtasi[3][3]&&OyunTahtasi[3][3]==OyunTahtasi[4][4]&&OyunTahtasi[4][4]==OyunTahtasi[5][5]&&OyunTahtasi[5][5]==OyunTahtasi[6][6]&&OyunTahtasi[0][0]!=' ')
         {
                System.out.println("Kazanan  "+OyunTahtasi[0][0]);
                oyunoynaniyor=false;
         }

          if(OyunTahtasi[0][6]==OyunTahtasi[1][5]&&OyunTahtasi[1][5]==OyunTahtasi[2][4]&&OyunTahtasi[2][4]==OyunTahtasi[3][3]&&OyunTahtasi[3][3]==OyunTahtasi[4][2]&&OyunTahtasi[4][2]==OyunTahtasi[5][1]&&OyunTahtasi[5][1]==OyunTahtasi[6][0]&&OyunTahtasi[0][6]!=' ') 
            {
                System.out.println("Kazanan  "+OyunTahtasi[1][1]);
                oyunoynaniyor=false;
           }
        }
        

         
        return true;
    }
    
    
        
    
}
