package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Fixed Tests: fortune");
        System.out.println("Powinno byc true a jest: " + BankerPlan.fortune(100000, 1, 2000, 15, 1));
        System.out.println("Powinno byc false a jest: " + BankerPlan.fortune(100000, 1, 9185, 12, 1));
        System.out.println("Powinno byc true a jest: " + BankerPlan.fortune(100000000, 1, 100000, 50, 1));
        System.out.println("Powinno byc false a jest: " + BankerPlan.fortune(100000000, 1.5, 10000000, 50, 1));
        System.out.println("Powinno byc true a jest: " + BankerPlan.fortune(100000000, 5, 1000000, 50, 1));
        System.out.println("Powinno byc false a jest: " + BankerPlan.fortune(100000, 1, 9185, 12, 1));

    }

    public static class BankerPlan {
        public static boolean fortune(int f0, double p, int c0, int n, double i) {

//            f0 - ilosc kasy jaka ma bankier do zainwestowania
//            c0 - kasa ktora bankier chce wyciagac co roku
//            p - roczne oprocentowanie konta
//            i - inflacja; jest stala przez wszystkie lata trwania lokaty
//            n - ilosc lat przez ktore bankier chce sie utrzymywac z lokaty
//            wynik jest TRUE jesli bankeir moze przezyc przez n lat i ma wiecej niz 0 na koncie
//            wynik jest FALSE jesli bankier pod koniec n roku ma mniej niz 0 na koncie

            boolean isEnough;
            int f=f0;
            int c=c0;

            for (int j = 1; j < n; j++) {
                f = (int) (f + (p/100)*f - c);
                if (f<0) return false;
                c = (int) (c + c * (i/100));
            }

            return true;

        }
    }
}
