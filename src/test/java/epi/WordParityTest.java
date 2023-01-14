package epi;

import model.Product;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;
import util.ProductUtil;

import java.math.BigDecimal;
import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.locks.LockSupport;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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

    @Test
    void rotateArr() {
        int[] a = {1,2,3,4};
        rotate(a, 4);
        Assertions.assertEquals(1, a[0]);
        Assertions.assertEquals(2, a[1]);
        Assertions.assertEquals(3, a[2]);
        Assertions.assertEquals(4, a[3]);
    }

    public void rotate(int[] a, int k) {
        while (k-- > 0) {
            int i = 0;
            int j = i+1;
            while (j < a.length){
                int t = a[i];
                a[i] = a[j];
                a[j++] = t;
            }
        }
    }

    @Test
    void removeDup() {
        int[] a = {1,1,1,1,1,1,2,2,2,2,2,3,3,3,3};
//        a = wp.removeDup(a);
        a = wp.removeDup1(a);
        Assertions.assertEquals(1, a[0]);
        Assertions.assertEquals(2, a[1]);
        Assertions.assertEquals(3, a[2]);
    }

    @Test
    void sortNegToLeft() {
        int[] a = {-2, 1, 4, -1, 5, 6, -7};
        // -2 -1 -7 1 5 6
        a = wp.sortNegToLeft(a);
        Assertions.assertEquals(-2, a[0]);
        Assertions.assertEquals(-1, a[1]);
        Assertions.assertEquals(-7, a[2]);
        Assertions.assertEquals(1, a[3]);
        Assertions.assertEquals(4, a[4]);
        Assertions.assertEquals(5, a[5]);
        Assertions.assertEquals(6, a[6]);
    }

    @Test
    void intPalindrome() {
        int a = 1234321;
        Assertions.assertEquals(true, wp.isIntPalindrome(a));
    }


    @Test
    void printRepeatedChars() {
        String s = "abcdabdefhefh";
        wp.printRepeatedChars(s);
    }

    @Test
    void matrix() {

        int rows = 9;
        int cols = 9;

        char[][] a = new char[rows][];

        int v = 1;
        for (int i=0;i<rows;i++) {
            a[i] = new char[cols];
            for (int j=0;j<cols;j++) {
                a[i][j] = '*';
            }
        }

        wp.printArr(a);
    }

    @Test
    void matrixInt() {

        int rows = 9;
        int cols = 9;

        int[][] a = new int[rows][];




        for (int i=0;i<rows;i++) {
            int val = 1;
            a[i] = new int[cols];
            Set<Integer> counter = new HashSet<>();
            for (int j=0;j<cols;j++) {

                while (counter.size() != 9) {
//                    int r = getRandom();
                    if (val > 9) {
                        val = 1;
                    }
                    int r = val++;
                    boolean badSudoku = false;
                    if (!counter.contains(r)) {
                        //check rows
                        for (int k=0;k<cols;k++) {
                            if (a[i][k] == r) {
                                // invalid sudoku
                                System.out.println("Invalid sudoku rows check.."+ r);
                                badSudoku = true;
                                break;
                            }
                        }

                        //check cols
                        for (int k=0;k<rows;k++) {
                            if (a[k] == null) {
                                break;
                            }
                            if (a[k][j] == r) {
                                // invalid sudoku
                                System.out.println("Invalid sudoku cols check.."+ r);
                                badSudoku = true;
                                break;
                            }
                        }
                        if (!badSudoku) {
                            counter.add(r);
                            a[i][j] = r;
                            break;
                        }

                    }
                }

//                else {
//                    counter.add(random);
//                }

            }
        }

        wp.printArr(a);
    }

//    private int getRand(Set<Integer> counter) {
//        while (!counter.contains(random) && counter.size() < 10) {
//            a[i][j] = random;
//            counter.add(random);
//        }
//
////        get random
////        contains random
//    }

    @Test
    void random() {
        var r = new Random();
        for (int i = 0; i < 15; i++) {
            System.out.print(r.nextInt(10) +"  ");
        }
    }

    Random r = new Random();
    private int getRandom() {
//        r.setSeed(1);
        return ThreadLocalRandom.current().nextInt(1,10);
    }

    @Test
    void arr1() {
        int[] a = {3,2,2,3,4,3,2,3};
        int[] b = Arrays.stream(a).distinct().toArray();
        new WordParity().printArr(b);
//        new WordParity().printArr(Arrays.stream(b).sorted().toArray());
    }

    @Test
    void flatMap() {
        String[][] s = {{"hello","there"},{"hw","welcome"}};
        List<String> l =  Arrays.stream(s).flatMap(s1-> Arrays.stream(s1)).collect(Collectors.toList());
        l.forEach(a-> System.out.println(a));
     }

     public BigDecimal reduce(List<Product> products) {
         return products.stream().map(Product::getPrice).
                 reduce(BigDecimal.ZERO, (p1,p2)->p1.add(p2));
     }
    @Test
    void products() {
//        Thread t = new Thread();
//        LockSupport.park(this);
//        LockSupport.unpark(this);

//        Map m = new ConcurrentHashMap();
//        m.

        Map<String, List<Product>> m = ProductUtil.groupById(ProductUtil.createProducts());

        Collection<List<Product>> val = m.values().stream()
                .sorted(Comparator.comparing(products -> reduce(products)))
                .collect(Collectors.toList());

        List<Product> ps = new ArrayList<>();
        for (List<Product> products: val) {
            System.out.println("=>"+ products.stream().peek(p->System.out.print(p.getId())).map(Product::getPrice).reduce(BigDecimal.ZERO, (p1,p2)->p1.add(p2)));
        }
        System.out.println(m.size());
    }

    @Test
    void reduce() {
        int[] a = {1,2,3,4,5};
        System.out.println(Arrays.stream(a).reduce(0, (left, right) -> left + right));
        System.out.println(Arrays.stream(a).reduce(0, (left, right) -> left + right));
    }

    @Test
    void twoSumTest() {
        int[] a = {2,4,8,7,3};
        int[] res = twoSum(a, 9);
        Assertions.assertEquals(0, res[0]);
        Assertions.assertEquals(3, res[1]);
    }
        @Test
    void twoSumTest1() {
        int[] a = {3,3};
        int[] res = twoSum(a, 6);
        Assertions.assertEquals(0, res[0]);
        Assertions.assertEquals(1, res[1]);
    }

    @Test
    void twoSumTest2() {
        int[] a = {3,2,4};
        int[] res = twoSum(a, 6);
        Assertions.assertEquals(1, res[0]);
        Assertions.assertEquals(2, res[1]);
    }    @Test
    void twoSumTest3() {
        int[] a = {3,3};
        int[] res = twoSum(a, 6);
        Assertions.assertEquals(0, res[0]);
        Assertions.assertEquals(1, res[1]);
    }

    private int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> m = new LinkedHashMap<>();
        for (int i=0;i<nums.length;i++) {
            int num = Math.abs(nums[i]-target);
            if (m.containsKey(num)) {
                return new int[]{m.get(num), i};
            }
            m.put(nums[i], i);
        }
        return null;
    }
}