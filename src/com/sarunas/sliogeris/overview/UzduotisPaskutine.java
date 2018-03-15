package com.sarunas.sliogeris.overview;

public class UzduotisPaskutine {

    public static void main(String[] args) {

        trysSkaiciai(100, 50, 200);

    }

    private static boolean trysSkaiciai(int skaicius, int r1, int r2) {
        boolean skaiciusTarpReziu = true;
        if (r1 < r2) {
            System.out.println("r1 mazesnis uz r2");
            return skaiciusTarpReziu;
        }
        if ((r1 <= skaicius) && (skaicius <= r2)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        return skaiciusTarpReziu;

    }
}
