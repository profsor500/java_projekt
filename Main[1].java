package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String []args)
    {
        Locale locale = new Locale("pl","PL");
        FriendlyClass fr = new FriendlyClass();
        int a,b;
        a=getInt();
        b=getInt();
        System.out.print(fr.FriendlyNumbers(a,b));
    }

    static int getInt(){
        Scanner input = new Scanner(System.in);
        int a=0;

        try {
            a = input.nextInt();
        }
        catch(Exception e)
        {
            System.out.println("Podaj poprawną wartość");
        }

        return a;
    }
}
