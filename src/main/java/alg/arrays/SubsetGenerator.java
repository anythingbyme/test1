package alg.arrays;

import java.util.ArrayList;
import java.util.List;

public class SubsetGenerator {
    public List<String> generateSubsets(String s) {
        List<String> l = new ArrayList<>();


        for (int i=0; i<s.length();i++) {
            String c = String.valueOf(s.charAt(i));
            l.add(c);
            for (int j=i+1; j<s.length();j++) {
                c += s.charAt(j);
                l.add(String.valueOf(s.charAt(i)) + s.charAt(j));
            }
//            l.add(c);
        }
        l.add(s);

        for (String a: l) {
            System.out.println(a);
        }

        return l;

    }
}
