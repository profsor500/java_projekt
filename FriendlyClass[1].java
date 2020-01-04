package com.company;

public class FriendlyClass {
    public boolean FriendlyNumbers(int a, int b)
    {
        int suma1=1, suma2=1, i=2;
        int warunek=a;
        while(i<warunek)
        {
            if(a%i==0)
            {
                suma1 += i;
                suma1 += a / i;
                warunek = (a / i) - 1;
            }
            i++;
        }
        i=2;
        warunek=b;
        while(i<warunek)
        {
            if(b%i==0)
            {
                suma2 += i;
                suma2 += b / i;
                warunek = (b / i) - 1;
            }
            i++;
        }
        if((suma1==b)&(suma2==a)) return true; else return false;
    }
}
