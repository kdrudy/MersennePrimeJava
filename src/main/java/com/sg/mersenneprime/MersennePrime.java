/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.mersenneprime;

import java.math.BigInteger;

/**
 *
 * @author kylerudy
 */
public class MersennePrime {

    public static void main(String[] args) {
        MersennePrime mp = new MersennePrime();
        mp.mersennePrime();

    }

    private void mersennePrime() {
        //Mersenne Prime //Takes very long past 9th MPs
//        2:3:1ms
//        3:7:0ms
//        5:31:0ms
//        7:127:0ms
//        13:8191:1ms
//        17:131071:1ms
//        19:524287:1ms
//        31:2147483647:16ms
//        61:2305843009213693951:111887ms

        for (int i = 0; i < 100; i++) {
            BigInteger value = BigInteger.valueOf(2).pow(i).subtract(BigInteger.ONE);
            long time = System.currentTimeMillis();

            if (isPrime(value)) {
                System.out.println(i + ":" + value + ":" + (System.currentTimeMillis() - time) + "ms");
            } else {
                //System.out.println("NO " + i + ":" + value);
            }
        }
    }

    public boolean isPrime(int value) {
        return isPrime(new Long(value));
    }

    public boolean isPrime(long value) {
        if (value == 0 || value == 1) {
            return false;
        }
        if (value == 2) {
            return true;
        }
        if (value % 2 == 0) {
            return false;
        }

        int max = (int) Math.sqrt(value) + 1;
        for (int i = 3; i < max; i += 2) {
            if (value % i == 0) {
                return false;
            }
        }
        return true;
    }

    public boolean isPrime(BigInteger value) {
        BigInteger two = new BigInteger("2");

        if (value.equals(BigInteger.ZERO) || value.equals(BigInteger.ONE)) {
            return false;
        }
        if (value.equals(two)) {
            return true;
        }
        if (value.mod(two).equals(BigInteger.ZERO)) {
            return false;
        }

        BigInteger max = squareRoot(value);
        for (BigInteger bi = BigInteger.valueOf(3); bi.compareTo(max) < 0; bi = bi.add(two)) {
            if (value.mod(bi).equals(BigInteger.ZERO)) {
                return false;
            }
            max = value.divide(bi);
        }
        return true;
    }
    
    public BigInteger squareRoot(BigInteger n) {
        
        //Get the power of 2 bitlength for the calculation
        int bitLength = n.bitLength();
        for(int i = 0;i<100;i++) {
            if(Math.pow(2, i) > bitLength) {
                bitLength = (int) Math.pow(2, i);
                break;
            }
        }
        
        BigInteger res = BigInteger.ZERO;
        BigInteger bit = BigInteger.ONE.shiftLeft(bitLength-2); 
        
        while(bit.compareTo(n) > 0) {
            bit = bit.shiftRight(2);
        }
        
        while(!bit.equals(BigInteger.ZERO)) {
            if(n.compareTo(res.add(bit)) >= 0) {
                n = n.subtract(res.add(bit));
                res = res.shiftRight(1).add(bit);
            } else {
                res = res.shiftRight(1);
            }
            bit = bit.shiftRight(2);
        }
        return res;
    }
}
