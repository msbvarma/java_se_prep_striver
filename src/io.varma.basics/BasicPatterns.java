package com.app.varma.basics;

public class BasicPatterns {

    public static void main(String[] args) {
        //read input
        int loopCount = 5;
        char pattern = '*';
       /* printSimplePattern(loopCount, pattern);
        printIncerementalPattern(loopCount, pattern);
        printIncerementalNumbers(loopCount);
        printIncerementalPatternSame(loopCount);

        printReverseDecreasingPattern(loopCount, pattern);
        printReverseDecreasingNumbers(loopCount);*/

        //printPyramid(loopCount);
       // printReversepyramid(loopCount);

      //  printDiamondPattern(loopCount);

      //  printIncreasingNumber(loopCount);
        printAB(loopCount);
    }

    private static void printAB(int loopCount) {
        StringBuilder stringBuilder = new StringBuilder();
        for(int i=0;i<loopCount;i++){
            int ch =65;
            for (int j=0;j<i;j++){
                System.out.print((char)ch);
                ch++;
            }
            System.out.println();
        }
    }

    private static void printIncreasingNumber(int loopCount) {
        int printNumber=1;
        for(int i=0;i<loopCount;i++){
            for (int j=0;j<i;j++){
                System.out.print(printNumber+" ");
                printNumber++;
            }
            System.out.println();
        }
    }

    private static void printDiamondPattern(int loopCount) {
        printPyramid(loopCount);
        printReversepyramid(loopCount);
    }

    private static void printReversepyramid(int loopCount) {
        for (int i=loopCount;i>=1;i--){
            for( int j =loopCount-i;j>1;j--){
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--){
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    private static void printPyramid(int loopCount) {
       // https://www.geeksforgeeks.org/programs-printing-pyramid-patterns-java/
        for (int i = 0; i < loopCount; i++) {
            //print spaces
            for(int j=loopCount-i;j>1;j--){
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    private static void printReverseDecreasingNumbers(int loopCount) {
        for (int i = loopCount; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    private static void printReverseDecreasingPattern(int loopCount, char pattern) {
        for (int i = loopCount; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print(pattern);
            }
            System.out.println();
        }
    }

    private static void printIncerementalPatternSame(int loopCount) {
        System.out.println("printIncerementalPatternSame");
        for (int i = 1; i <= loopCount; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

    private static void printIncerementalNumbers(int loopCount) {
        System.out.println("printIncerementalNumbers");
        for (int i = 1; i <= loopCount; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void printSimplePattern(int loopCount, char pattern) {
        System.out.println("printSimplePattern");
        for (int i = 0; i < loopCount; i++) {
            for (int j = 0; j < loopCount; j++) {
                System.out.print(pattern);
            }
            System.out.print("\n");
        }
    }

    public static void printIncerementalPattern(int loopCount, char pattern) {
        System.out.println("printIncerementalPattern");
        for (int i = 0; i < loopCount; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(pattern);
            }
            System.out.println();
        }

    }

}
