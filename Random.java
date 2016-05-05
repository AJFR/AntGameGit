/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assembledantgame;

/**
 *
 * @author freakin
 */
public class Random {

    final int seed;
    int si;
    int xi;

    Random(int seed) {
        this.seed = seed;
        this.si = seed;

        for (int sCount = 0; sCount < 3; sCount++) {
            getNextSi();
        }
    }

    private int genSeed() {
        return 0;
    }

    private int getNextSi() {
        return si = (si * 22695477) + 1;
    }

    int getNextX() {
        //si must be s4 (4th iteration of getNextSi())
        return xi = modulus(getNextSi() / 65536, 16384);
    }

    int modulus(int x, int mod) {
        int modulus;
        if (mod == 0) {
            return 0;
        }
        modulus = x % mod;
        if (modulus < 0) {
            modulus = (modulus + mod) - 1;
        }
        return modulus;
    }

    int randomInt(int n) {
        return modulus(getNextX(), n);
    }
}