package alg.arrays;

import java.util.ArrayList;
import java.util.List;

public class SubseqGenerator {

    public static List<String> generateSubsequences(String s) {
        List<String> subs = new ArrayList<>();
        for (int i = 0; i < (1 << s.length()); i++) {
            String sub = "";
            for (int j = 0; j < s.length(); j++) {
                if ((i & (1 << j)) != 0) {
                    sub += s.charAt(j);
                }
            }
            subs.add(sub);
        }
        return subs;
    }

    public static void main(String[] args) {
//        List<String> subs = generateSubsequences("abc");
        List<String> subs = subSeq("abc");
        for (String sub : subs) {
            System.out.println(sub);
        }
    }

    //"".substr(), "".subsequence() are same
    public static List<String> subSeq(String s) {
        List<String> l = new ArrayList<>();
        for (int i =0;i<s.length();i++) {
            String r = String.valueOf(s.charAt(i));
            l.add(r);
            for (int j =i+1;j<s.length();j++) {
                r = r + s.charAt(j);
                l.add(r);
            }
        }
        return l;

    }
}

