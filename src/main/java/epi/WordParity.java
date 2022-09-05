package epi;
    /*
        AWS s3 version:
        AWS SDK version:
        VMware vSphere

        github
        bitbucket
        SOAP
        MySQL 8
        Spring
        Spring Boot
        Redis
        Maven


        Create a rest client using plain java
            URL vs URI
        Create a rest client using Jersey
        Create a RESTful endpoint using Jersey
        Create a RESTful endpoint using Spring boot
        Setup restful authentication using OAuth ??
        Configure a Spring boot app
        Configure hibernate
        Configure and setup Redis
        AWS S3 cli some commands
        AWS sdk commands

        https://www.interviewkickstart.com/blog/35-technical-interview-questions-asked-at-technology-companies
        https://www.interviewkickstart.com/blog/software-developer-skills


     */

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class WordParity {
    public short compute(String word) {
        short s = 1;
        return s;
    }

    public short compute(int n) {
        short r = 0;
//        while (true) {
//            r =
//        }
        return r;
    }

    public String oddOrEven(int a) {
        System.out.println(a & 1);
        return (a & 1)==1 ? "odd" : "even";
    }

    public int swap(int ab) {

        System.out.println(ab);
        if (ab > 0 && ab < 10) {
            return ab;
        }
        int b=ab%10;
        int a = ab/10;
//        System.out.println(b);
        return  b*10+a;
    }

    public int stringToInt(String x) {
        int[] a = new int[x.length()];
        int j = 0;
        int res = 0;
        for (int i=x.length()-1; i >=0;i--) {
            char c = x.charAt(i);
            System.out.println(Character.digit(c, 10));
            res += Character.digit(c, 10) * Math.pow(10, j++);

        }
        return res;
    }

    public String intToString(int x) {
        if (x == 0) {
            return "0";
        }
        boolean isNeg = false;
        if (x < 0) {
            isNeg = true;
            x *= -1;
        }
        StringBuilder sb = new StringBuilder();
        while (x != 0) {
            sb.append(x%10);
            x /= 10;
        }

//        System.out.println(sb.toString());
        return (isNeg ? "-":"") + sb.reverse().toString();
    }

    public int reverseNumber(int x) {
        return 1;
    }

    public void quickSort(int[] a) {
        quickSort(a, 0, a.length-1);
    }

    private void quickSort(int[] a, int low, int high) {
        if (low < high) {
            int pivot = partition(a, low, high);
            quickSort(a, low, pivot-1);
            quickSort(a, pivot+1, high);
        }
    }

    private int partition(int[] a, int low, int high) {
        // 8247
        // 7248
        // 4278
        // a[low]=8 a[p]=7 a[p-1]=4
        //
        // 4278
        int pivot = high;
//        if (pivot == 0) {
//            return 0;
//        }
        for (int i = low; i < high;i++) {
            if (a[i] > a[pivot]) {

                int temp = a[i];
                a[i] = a[pivot -1];
                a[pivot-1] = a[pivot];
                a[pivot+1] = temp;
                pivot = pivot -1;
            }
        }

        return pivot;
    }

    public void mergeSort(int[] a) {
        if (a == null || a.length == 0) {
            return;
        }
        int pivot = a.length/2;
        if (pivot == 0) {
            return;
        }
        int[] left = new int[pivot];
        int[] right = new int[a.length - pivot];
        System.arraycopy(a, 0, left, 0, left.length);
        System.arraycopy(a, left.length, right, 0, right.length);
        mergeSort(left);
        mergeSort(right);
        merge(left, right, a);
    }

    public void selectionSort(int[] a) {
        for (int i =0; i < a.length;i++) {
            for (int j =i+1; j < a.length;j++) {
                if (a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }

    private void merge(int[] left, int[] right, int[] a) {
        int i = 0, j =0, k =0;
        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                a[k++] = left[i++];
            }
            else {
                a[k++] = right[j++];
            }
        }

        while (i < left.length) {
            a[k++] = left[i++];
        }
        while (j < right.length) {
            a[k++] = right[j++];
        }
    }

    public <E> void singlyLnkedList(E e ) {
        //head
        //tail
        //node(E e, Node n)

    }

    static class SinglyLL<E> {
        public Node<E> head;
        public Node<E> tail;
        int size;

        public void addFirst(E e) {
            // B A
            head = new Node<>(e, head);
            if (tail == null) {
                tail = head;
            }
            size++;
        }

        public void addLast(E e) {
            Node<E> node = new Node<>(e, null);
            tail.next = node;
            tail = node;
            size++;
        }

        public void removeFirst() {
            head = head.next;
            size --;
        }
    }

    static class Node<E> {
        public E val;
        public Node<E> next;
        public Node(E e, Node<E> next) {
            this.val = e;
            this.next = next;
        }
    }

    public void reverseLinkedList() {}

    public void fibonacci() {}

    public void findKthLargest(int[] a) {}

    public int binarySearch(int[] a, int target) {
        return  binarySearch(a, 0, a.length-1, target);
    }

    private int binarySearch(int[] a, int low, int high, int target) {
        if (a == null || a.length == 0 || (a.length ==1 && a[0] != target)) {
            return -1;
        }
        else {
            int mid = (low+high) /2;
            if (a[mid] == target) {
                return mid;
            }
            else if (a[mid] < target) {
                return binarySearch(a, mid+1, high, target);
            }
            else {
                return binarySearch(a, low, mid-1, target);
            }
        }

    }

    public void stack() {}

    public void queue() {}

    public void priorityQueue() {}

    public void rotateList() {}

    public void rotateQueue() {}
    public void rotateArray(int[] a) {
        int i = 0;
        int j = i+1;
        while (j < a.length) {
            int temp = a[j];
            a[j++] = a[i];
            a[i] = temp;
        }
    }

    public String stringReverseRecur(String s) {
        if (s == null || s.length() < 2) {
            return s;
        }
        return s.substring(s.length()-1, s.length()) + stringReverseRecur(s.substring(0,s.length()-1));
    }

    public int factorial(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * factorial(n-1);
    }

    public int sumOfFirstNNumbers(int n) {
        if (n <= 0) {
            return 0;
        }
        return n + sumOfFirstNNumbers(n-1);
    }

    public int[] merge(int[] a, int[] b) {
        if (a == null && b == null) {
            return null;
        }
        if (a == null) {
            return b;
        }

        if (b == null) {
            return a;
        }
        int[] c = new int[a.length + b.length];
        System.arraycopy(a, 0, c, 0, a.length);
        System.arraycopy(b, 0, c, a.length, b.length);
        return c;
    }

    public int[] mergeAndRemoveDup(int[] a, int[] b) {
        if (a == null && b == null) {
            return null;
        }
        if (a == null) {
            return b;
        }

        if (b == null) {
            return a;
        }
        int[] c = new int[a.length + b.length];
        Set<Integer> s = new LinkedHashSet<>();
        for (int i=0;i< a.length;i++) {
            s.add(a[i]);
        }

        for (int i=0;i< b.length;i++) {
            s.add(b[i]);
        }

//        return s.toArray();;
        return null;
    }

    public int[][] makeArray(int rows, int col) {
        int[][] a = new int[rows][];
        for ( int i=0;i<rows;i++) {
            a[i] = new int[col];
            for (int j=0;j<a[i].length;j++) {
                a[i][j] = i+j;
            }
        }
        return a;
    }

    public void printArr(int[] a) {
        for ( int i=0;i<a.length;i++) {
            System.out.print(a[i]);
        }
        System.out.println("");
    }

    public void printArr(int[][] a) {
        for ( int i=0;i<a.length;i++) {
            for (int j=0;j<a[i].length;j++) {
                System.out.print(a[i][j]);
            }
            System.out.println("");
        }
    }

    public void addMatrix() {
        // if a.column.lngth !=
    }

    public int[][] multMatrix(int[][] a, int[][] b) {
        // a == null && b ==  null, return null
        // if a is null, return b,
        // if b is null, return a

        // mxn, nxp, if a col not eq b rows, return

        // mxn , nxp => mxp matrix
        // 0 1 2    0 1   =>  5 4
        // 1 2 3    1 2
        //          2 3   =>  8 10
        int rows = a.length;
        int col = b[0].length;
        int kRows = b.length;
        int[][] c = new int[a.length][];
        for (int i =0;i<rows; i++) {
            c[i] = new int[rows];
            for (int j =0; j < col; j++) {
                for (int k =0; k < kRows; k++) {
//                    System.out.println("i="+i+",j="+j+",k="+k);
                    c[i][j] += a[i][k] * b[k][j];
                }
//                System.out.println(c[i][j]);
            }
        }
        return c;
    }

    //given an n length array, how can you form k length sub array
    //ex: 1 2 3 4  k=2, then sub= 1 4, 1 3, 1 4, 2 3, etc i.e 4P2 ways => 6
    public void arr() {}

//    public void thread() {
//        Runnable r = () -> "hi";
//    }

    public int[] primeNumbers(int n) {
        int[] r = new int[n];
        int c = 0;
        for (int i=1; c != n;i++) {
            if (isPrime(i)) {
                r[c++] = i;
            }
        }
        return r;
    }

    private boolean isPrime(int n) {
        if (n == 1 || n == 2) {
            return true;
        }

        for (int i =2;i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static class MyR implements Runnable {
        @Override
        public void run() {
            System.out.println("hi");
        }
    }

    /*Get*/
    //https://mkyong.com/webservices/jax-rs/restfull-java-client-with-java-net-url/
    public String createRestfulClientUsingJava_Get(String endpoint) {
        // url:
        // url open connection
        // httpUrlConnection
        //set request type
        // open stream
        // read
        // close stream
        StringBuilder r = new StringBuilder();

        try {
            URL url = new URL(endpoint);
            HttpURLConnection conn = (HttpURLConnection)url.openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("Accept","application/json");

            String res;
            try (BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));) {
                while ((res=br.readLine()) != null) {
                    r.append(res);
                }
            } finally {
                conn.disconnect();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return r.toString();
    }
    public void createRestfulClientUsingJersey_Get() {}
    public void createRestfulClientUsingSprintBoot_Get() {}


    /*Post*/
    public String createRestfulClientUsingJava_Post(String endpoint, String payload) {
        //url
        //open connection
        //set request method
        //set request type
        String s;
        StringBuilder sb = new StringBuilder();
        try {
            URL url = new URL(endpoint);
            HttpURLConnection conn = (HttpURLConnection)url.openConnection();
            conn.setRequestMethod("POST");
            conn.setRequestProperty("Accept", "application/json");
            conn.setRequestProperty("Content-Type", "application/json");
            conn.setDoOutput(true);
            try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(conn.getOutputStream()));
                 BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            ) {
                bw.write(payload);
                bw.flush();
                while ((s = br.readLine()) != null) {
                    sb.append(s);
                }
            } finally {
                conn.disconnect();
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
//            conn.disconnect();
        }
        return sb.toString();
    }

    public int findSmallest(int[] a) {
        for (int i=0;i<a.length;i++) {
            for (int j = i+1; j < a.length;j++) {
                if (a[i] > a[j]) {
                    int t = a[i];
                    a[i] = a[j];
                    a[j] = t;
                }
            }
        }
        return a[0];
    }

    public boolean isPairOfDistinctElementsEven(int[] a) {
        // 1 1 2 3 4 5 6 6 7
        // pair  1,2 is even
        // a is null or empty or size 1, then false
        if (a == null || a.length < 2) {
            return false;
        }
        for (int i = 0; i<a.length;i++) {
            for (int j = i+1; j< a.length; j++) {
                if (a[i] != a[j] && a[i] * a[j] %2 == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public int howManyDistinctPairs(int[] a) {
        // 1 1 2 3 4 5 6 6 7
        // pair  1,2 is even
        // a is null or empty or size 1, then false
        if (a == null || a.length < 2) {
            return 0;
        }
        int count = 0;
        Set<String> set = new LinkedHashSet<>(a.length);

        for (int i = 0; i<a.length;i++) {
            for (int j = 0; j< a.length; j++) {

                if (a[i] != a[j]) {
                    set.add("["+a[i]+","+a[j]+"]");
                    count++;
                }

            }
        }
        Iterator<String> itr = set.iterator();
        int count1 = 0;
        while (itr.hasNext()) {
            System.out.println(++count1 +itr.next());
        }
        return set.size();
    }



    public void createRestfulClientUsingJersey_Post() {}
    public void createRestfulClientUsingSprintBoot_Post() {}

    /*Put*/
    public String createRestfulClientUsingJava_Put(String endpoint, String payload) {
        String s;
        StringBuilder sb = new StringBuilder();
        try {
            URL url = new URL(endpoint);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setDoOutput(true);
            conn.setRequestMethod("PUT");
            conn.setRequestProperty("Accept", "application/json");
            conn.setRequestProperty("Content-Type", "application/json");
            try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(conn.getOutputStream()));
                    BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            ) {
                bw.write(payload);
                bw.flush();
                while((s=br.readLine())!= null) {
                    sb.append(s);
                }
            }
            finally {

            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return sb.toString();
    }
    public void createRestfulClientUsingJersey_Put() {}
    public void createRestfulClientUsingSprintBoot_Put() {}

    /*Get*/
    public void createRestfulServiceUsingJava_Get() {}
    public void createRestfulServiceUsingJersey_Get() {}
    public void createRestfulServiceUsingSpringBoot_Get() {}

    /*Post*/
    public void createRestfulServiceUsingJava_Post() {}
    public void createRestfulServiceUsingJersey_Post() {}
    public void createRestfulServiceUsingSpringBoot_Post() {}

    /*Put*/
    public void createRestfulServiceUsingJava_Put() {}
    public void createRestfulServiceUsingJersey_Put() {}
    public void createRestfulServiceUsingSpringBoot_Put() {}

    /*Delete*/
    public void createRestfulServiceUsingJava_Delete() {}
    public void createRestfulServiceUsingJersey_Delete() {}
    public void createRestfulServiceUsingSpringBoot_Delete() {}

    public void s3() {
//        S3Client.builder()
    }

}
