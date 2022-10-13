//Muhammad Ramadhandy N
//2100018484
//J

package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        int banyakPas;

        Scanner input=new Scanner(System.in);


        int k=0;
        do {
            System.out.print("=");
            k++;
        }
        while(k<=42);
        System.out.println("\n           KLINK SEHAT MULU          ");
        System.out.println("======================================");
        System.out.print("Masukan banyak pasien : ");
        banyakPas=input.nextInt();

        String pasien[][]=new String[banyakPas][4];
        System.out.println("Masukan data pasien klink:");
        for (int i=0;i<banyakPas;i++)
        {
            System.out.println("");
            System.out.println("Pasien ke-"+(i+1));
            for (int j=0;j<4;j++)
            {
                if (j==0)
                {
                    System.out.print("Nama Pasien : ");
                }
                else if(j==1)
                {
                    System.out.print("NIK : ");
                }
                else if(j==2)
                {
                    System.out.print("Umur : ");
                }
                else
                {
                    System.out.print("Keluhan : ");
                }
                pasien[i][j]=input.next();
            }
        }

        System.out.println("----------------------");
        System.out.println("\ndata pasien klink ");
        System.out.println("----------------------");
        System.out.println("Keluhan \t\t NIK \t\t Umur \t\t Keluhan \t");
        for(int i=0;i<banyakPas;i++)
        {
            for (int j=0; j<4;j++)
            {
                System.out.print(pasien[i][j]+"\t\t");
            }
            System.out.println();
        }

    }
}
