package epi;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.nio.charset.StandardCharsets;

class WordParityTest {

    @Test
    void compute() {
        //parity: meaning: state or condition of being equal
        //parity (binary): if a binary number is odd or even
        /** i.e 5 = 101 . here parity is odd (coz there are more no of 1 bits)
         *
         */
        Assertions.assertEquals(5, new WordParity().compute("hello"));
    }

    @Test
    void bitcount() {
//        System.out.println(Integer.bitCount(1));
//        System.out.println(Math.pow(2,9));
//        Assertions.assertEquals(8,Math.pow(2,3));
//        Assertions.assertEquals(Math.pow(2,4),8 << 1);
//        Assertions.assertEquals(11,7 << 1);
        Assertions.assertEquals(2, 4 >> 1);
        Assertions.assertEquals(1, 4 >> 2);
        Assertions.assertEquals("11", Integer.toBinaryString(3));
        Assertions.assertEquals("101", Integer.toBinaryString(5));
        Assertions.assertEquals("111", Integer.toBinaryString(7));
        System.out.println((Integer.toBinaryString((int) 'a')));
        System.out.println(StandardCharsets.UTF_8.encode("raju"));
        Assertions.assertEquals(50, 100 >> 1); // 100/2
        Assertions.assertEquals(25, 100 >> 2); // 100/Math.pow(2,2)
        Assertions.assertEquals(400, 100 << 2); // 100*Math.pow(2,2)
        Assertions.assertEquals(1, 1 & 1); // 1 & 1 = 1
        Assertions.assertEquals(0, 1 & 0);

        Assertions.assertEquals(0, 0 & 0);
        Assertions.assertEquals(1, 1 | 0);
        Assertions.assertEquals(0, 0 | 0);
        Assertions.assertEquals(6, 3 << 1);
        Assertions.assertEquals(6, 7 & 2);
        Assertions.assertEquals(2, 9 ^ 13);

        Assertions.assertEquals(0, 2 ^ 3);
        Assertions.assertEquals(0, 3 ^ 3);

    }

    @Test
    void oddOrEven() {
        Assertions.assertEquals("odd", new WordParity().oddOrEven(9));
        Assertions.assertEquals("even", new WordParity().oddOrEven(6));
        Assertions.assertEquals("odd", new WordParity().oddOrEven(99));
        Assertions.assertEquals("even", new WordParity().oddOrEven(86));
    }

    @Test
    void swap() {
//        Assertions.assertEquals(35, new WordParity().swap(53));
//        Assertions.assertEquals(22, new WordParity().swap(22));
//        Assertions.assertEquals(86, new WordParity().swap(68));
//        Assertions.assertEquals(5, new WordParity().swap(5));
//        Assertions.assertEquals(0, new WordParity().swap(0));
        Assertions.assertEquals(-21, new WordParity().swap(-12));

    }



    @Test
    void rightMostBit() {
        //LSB least significant bit
        // x = x & ~(x-1)

        //number
        //compliment
        //add 1
        //-x = ~x+1
        //LSB= x & -x
        int xi = 6;
        int x = Integer.highestOneBit(xi);
        System.out.println(Integer.toBinaryString(xi));
        System.out.println(Integer.toBinaryString(xi));
        System.out.println("lowestOneBit=" + Integer.lowestOneBit(xi));
        System.out.println("x & -x=" + (xi & -xi));

        System.out.println(xi & (~xi + 1));
        System.out.println(Integer.toBinaryString(xi & 1));
        System.out.println(Integer.toBinaryString(xi & (~xi + 1)));

//        System.out.println(3 & 2);
    }

    @Test
    void tobinary1() {

        int x = 15;
//        Integer.toBinaryString(x);
        byte[] r = new byte[8];
        byte b = 1;
        int i = 7;
        while (x != 0) {
            r[i--] = (byte) (x - (x >> 1) * 2);
            System.out.println("remainder=" + r[i - 1]);
            x = x >> 1;
            System.out.println(x);
        }
        r[0] = (byte) 1;
        r[1] = 'a';
        r[2] = 1;
        r[3] = 1;
        System.out.println(new String(r));

    }

    @Test
    void toBinary() {
        int x = 15;
        StringBuilder sb = new StringBuilder();
        while (x != 0) {
            sb.append(x % 2);
            x >>= 1;
        }
//        System.out.println(sb.reverse().toString());
        Assertions.assertEquals("1111", sb.reverse().toString());
    }

    @Test
    void toBinaryNegative() {
        System.out.println(Integer.toBinaryString(-15));
        System.out.println(Integer.toBinaryString(~15 + 1));
    }

    @Test
    void stringToInt() {
        Assertions.assertEquals(100, wp.stringToInt("100"));
        Assertions.assertEquals(0, wp.stringToInt("0"));
        Assertions.assertEquals(0, Integer.parseInt("-0.5"));
        Assertions.assertEquals(-100, wp.stringToInt("-100"));
        Assertions.assertEquals(0, wp.stringToInt("0.5"));
        Assertions.assertEquals(0, wp.stringToInt("-0.5"));

    }

    @Test
    void reverseNumber() {
        Assertions.assertEquals(100, wp.reverseNumber(100));
        Assertions.assertEquals(0, wp.reverseNumber(0));
        Assertions.assertEquals(-100, wp.reverseNumber(-100));
        Assertions.assertEquals(9, wp.reverseNumber(9));
        Assertions.assertEquals(-5, wp.reverseNumber(-5));
    }



    @Test
    void intToString() {
        Assertions.assertEquals("999", wp.intToString(999));
        Assertions.assertEquals("100", wp.intToString(100));
        Assertions.assertEquals("0", wp.intToString(0));
        Assertions.assertEquals("-100", wp.intToString(-100));
        Assertions.assertEquals("9", wp.intToString(9));
        Assertions.assertEquals("-5", wp.intToString(-5));
    }

    @Test
    void mergeArrays() {
        int[] a = {3, 4, 5};
        int[] b = {7, 8};
        int[] c = merge(a, b);
        Assertions.assertEquals(3, c[0]);
        Assertions.assertEquals(4, c[1]);
        Assertions.assertEquals(5, c[2]);
        Assertions.assertEquals(7, c[3]);
        Assertions.assertEquals(8, c[4]);
    }

    @Test
    void mergeArrays1() {
        int[] a = {5, 3, 4};
        int[] b = {8, 7};
        int[] c = merge1(a, b);
        Assertions.assertEquals(3, c[0]);
        Assertions.assertEquals(4, c[1]);
        Assertions.assertEquals(5, c[2]);
        Assertions.assertEquals(7, c[3]);
        Assertions.assertEquals(8, c[4]);
    }

    @Test
    void mergeSort() {
        int[] c = {5, 8, 4, 3, 7, 8};
        new WordParity().mergeSort(c);
        Assertions.assertEquals(3, c[0]);
        Assertions.assertEquals(4, c[1]);
        Assertions.assertEquals(5, c[2]);
        Assertions.assertEquals(7, c[3]);
        Assertions.assertEquals(8, c[4]);
    }

    @Test
    void quickSort() {
        int[] c = {5, 4, 3, 7, 8};
        new WordParity().quickSort(c);
        Assertions.assertEquals(3, c[0]);
        Assertions.assertEquals(4, c[1]);
        Assertions.assertEquals(5, c[2]);
        Assertions.assertEquals(7, c[3]);
        Assertions.assertEquals(8, c[4]);
    }

    @Test
    void selectionSort() {
        int[] c = {5, 4, 8, 3, 7, 8};
//        int[] c = {5, 3, 4};
        new WordParity().selectionSort(c);
        Assertions.assertEquals(3, c[0]);
        Assertions.assertEquals(4, c[1]);
        Assertions.assertEquals(5, c[2]);
        Assertions.assertEquals(7, c[3]);
        Assertions.assertEquals(8, c[4]);
        Assertions.assertEquals(8, c[5]);
    }

    public int[] merge(int[] a, int[] b) {
        int c[] = new int[a.length + b.length];
        System.arraycopy(a, 0, c, 0, a.length);
        System.arraycopy(b, 0, c, a.length, b.length);
        return c;
    }

    public void mergeSort(int[] a) {
        int p = a.length / 2;
        if (p <= 0) {
            return;
        }
        int[] left = new int[p];
        int[] right = new int[a.length - p];
        System.arraycopy(a, 0, left, 0, left.length);
        System.arraycopy(a, left.length, right, 0, right.length);
        mergeSort(left);
        mergeSort(right);
        merge2(left, right, a);
    }

    public int[] merge1(int[] a, int[] b) {
        int c[] = new int[a.length + b.length];
        int i = 0, j = 0, k = 0;

        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                c[k++] = a[i++];
            } else {
                c[k++] = b[j++];
            }
        }

        while (i < a.length) {
            c[k++] = a[i++];
        }

        while (j < b.length) {
            c[k++] = b[j++];
        }

        return c;
    }

    public void merge2(int[] a, int[] b, int[] c) {
//        int c[] = new int[a.length+b.length];
        int i = 0, j = 0, k = 0;

        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                c[k++] = a[i++];
            } else {
                c[k++] = b[j++];
            }
        }

        while (i < a.length) {
            c[k++] = a[i++];
        }

        while (j < b.length) {
            c[k++] = b[j++];
        }
    }

    @Test
    void exp() {
        System.out.println(Math.pow(10,3));
    }

    final String GET_API = "https://api.coindesk.com/v1/bpi/currentprice.json";
    final String POST_API = "https://d4074e13-8379-4be5-9ec4-7d4ec1dd6e1e.mock.pstmn.io/post-test";
    final String PUT_API = "https://e2a84408-771f-41a8-92be-cd5552c60cac.mock.pstmn.io/create";

    @Test
    void getRequest() {
        System.out.println(new WordParity().createRestfulClientUsingJava_Get(GET_API));
    }

    @Test
    void postRequest() {
        String payload = "{\"name\":\"test\"}";
        System.out.println(new WordParity().createRestfulClientUsingJava_Post(POST_API, payload));
    }

    @Test
    void putRequest() {
        String payload = "{\"name\":\"test\"}";
        System.out.println(new WordParity().createRestfulClientUsingJava_Put(PUT_API, payload));
    }

    @Test
    void numbers() {
        for ( int i=0; i < 50 ; i++) {
//            System.out.println("AKSHARA & DADDY & MOMMY & ARJUN :-)  ");
        }
        char a = 'A';
        for ( int i=0; i < 50 ; i++) {
            for (int j = 0; j< i; j++) {
                System.out.print("A B");
//                System.out.println(a++);
            }
            System.out.println(" ");
        }
    }

    @Test
    void factorial() {
        Assertions.assertEquals(1,new WordParity().factorial(0));
        Assertions.assertEquals(1,new WordParity().factorial(1));
        Assertions.assertEquals(6,new WordParity().factorial(3));
        Assertions.assertEquals(120,new WordParity().factorial(5));
    }

    @Test
    void sum() {
        Assertions.assertEquals(0,new WordParity().sumOfFirstNNumbers(0));
        Assertions.assertEquals(1,new WordParity().sumOfFirstNNumbers(1));
        Assertions.assertEquals(6,new WordParity().sumOfFirstNNumbers(3));
        Assertions.assertEquals(15,new WordParity().sumOfFirstNNumbers(5));
        Assertions.assertEquals(55,new WordParity().sumOfFirstNNumbers(10));
    }

    WordParity wp = new WordParity();
    @Test
    void arr() {
        wp.printArr(wp.makeArray(3,1));
    }

    @Test
    void arr2D() {
        wp.printArr(wp.makeArray(3,6));
    }

    @Test
    void arr2DLength() {
        int[][] a = wp.makeArray(3,6);
        for (int i = 0; i < a.length; i++) {
            System.out.printf("\nrow %d length %d", i, a[i].length);
        }
    }

    @Test
    void matrixMul() {
        int[][] a = wp.makeArray(2,3);
        int[][] b = wp.makeArray(3,2);
        int[][] c = wp.multMatrix(a,b);
        Assertions.assertEquals(5, c[0][0]);
        Assertions.assertEquals(8, c[0][1]);
        Assertions.assertEquals(8, c[1][0]);
        Assertions.assertEquals(14, c[1][1]);
    }

    @Test
    void smallest() {
        int[] a = {12, 13, 3, 2, 16, 9, 16, 3, 8};
        Assertions.assertEquals(2, wp.findSmallest(a));
    }

    @Test
    void isPairOfDistinctElementsEven() {

        Assertions.assertEquals(false, wp.isPairOfDistinctElementsEven(null));
        int[] a = {1};
        Assertions.assertEquals(false, wp.isPairOfDistinctElementsEven(a));
        int[]  a1 = {12, 13, 3, 2, 16, 9, 16, 3, 8};
        Assertions.assertEquals(true, wp.isPairOfDistinctElementsEven(a1));
    }

    @Test
    void howManyDistinctPairs() {

        Assertions.assertEquals(0, wp.howManyDistinctPairs(null));
        int[] a = {1};
        Assertions.assertEquals(0, wp.howManyDistinctPairs(a));
        int[]  a1 = {12, 13, 3, 2, 16, 9, 16, 3, 8};  //7p2
        Assertions.assertEquals(28, wp.howManyDistinctPairs(a1));
    }

    @Test
    void strRevUsingRecur() {
        Assertions.assertEquals("", wp.stringReverseRecur(""));
        Assertions.assertEquals(null, wp.stringReverseRecur(null));
        Assertions.assertEquals("ba", wp.stringReverseRecur("ab"));
        Assertions.assertEquals("edcba", wp.stringReverseRecur("abcde"));
        Assertions.assertEquals("olleH", wp.stringReverseRecur("Hello"));
        Assertions.assertEquals("ujaR si eman yM", wp.stringReverseRecur("My name is Raju"));
    }

    @Test
    void primeNumbers() {
        int[] r = wp.primeNumbers(7);
        Assertions.assertEquals(1, r[0]);
        Assertions.assertEquals(2, r[1]);
        Assertions.assertEquals(3, r[2]);
        Assertions.assertEquals(5, r[3]);
        Assertions.assertEquals(7, r[4]);
        Assertions.assertEquals(11, r[5]);
        Assertions.assertEquals(13, r[6]);

    }

    @Test
    void binarySearch() {
        int[] a = {-11, 0, 3, 4, 5, 6};
        int[] b = {2, 5};
        int c = wp.binarySearch(a, 5);
        Assertions.assertEquals(4, c);

    }

    @Test
    void merge() {
        int[] a = {4, 5};
        int[] b = {2, 5};
        int[] c = wp.merge(a, b);
        Assertions.assertEquals(4, c[0]);
        Assertions.assertEquals(5, c[1]);
        Assertions.assertEquals(2, c[2]);
        Assertions.assertEquals(5, c[3]);
        Assertions.assertEquals(2, wp.merge(null, b)[0]);
        Assertions.assertEquals(5, wp.merge(null, b)[1]);
    }

    void mergeAndRemoveDup() {
        int[] a = {4, 5};
        int[] b = {2, 5};
        int[] c = wp.merge(a, b);
        Assertions.assertEquals(4, c[0]);
        Assertions.assertEquals(5, c[1]);
        Assertions.assertEquals(2, c[2]);
        Assertions.assertEquals(2, wp.merge(null, b)[0]);
        Assertions.assertEquals(5, wp.merge(null, b)[1]);
    }

    @Test
    void rotateArray() {
        int[] a = {1, 2, 3, 4};
        wp.rotateArray(a);
        Assertions.assertEquals(4, a[0]);
        Assertions.assertEquals(1, a[1]);
        Assertions.assertEquals(2, a[2]);
        Assertions.assertEquals(3, a[3]);
        wp.rotateArray(a);
        Assertions.assertEquals(3, a[0]);
        Assertions.assertEquals(4, a[1]);
        Assertions.assertEquals(1, a[2]);
        Assertions.assertEquals(2, a[3]);
        wp.rotateArray(a);
        Assertions.assertEquals(2, a[0]);
        Assertions.assertEquals(3, a[1]);
        Assertions.assertEquals(4, a[2]);
        Assertions.assertEquals(1, a[3]);
        wp.rotateArray(a);
        Assertions.assertEquals(1, a[0]);
        Assertions.assertEquals(2, a[1]);
        Assertions.assertEquals(3, a[2]);
        Assertions.assertEquals(4, a[3]);
    }
}