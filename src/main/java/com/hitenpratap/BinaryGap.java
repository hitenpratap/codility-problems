package com.hitenpratap;

public class BinaryGap {
    public static void main(String[] args) {
        System.out.println(calculateBinaryGap(1041));
    }

    private static int calculateBinaryGap(int n) {
        int binaryGap = 0;
        int tempBinaryGap = 0;
        boolean binaryOpen = false;
        String binaryRep = Integer.toBinaryString(n);
        for (int ctr = 0; ctr < binaryRep.length(); ctr++) {
            if (binaryRep.charAt(ctr) == '1') {
                if (((ctr + 1) < binaryRep.length()) && binaryRep.charAt(ctr + 1) == '0') {
                    binaryOpen = true;
                    if (tempBinaryGap > binaryGap) {
                        binaryGap = tempBinaryGap;
                    }
                    tempBinaryGap = 0;
                } else {
                    binaryOpen = false;
                }
            } else {
                tempBinaryGap++;
            }

            if ((ctr + 1) == binaryRep.length()) {
                if (!binaryOpen) {
                    if (tempBinaryGap > binaryGap) {
                        binaryGap = tempBinaryGap;
                        tempBinaryGap = 0;
                    }
                }
            }
        }
        return binaryGap;
    }

}
