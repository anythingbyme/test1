package alg.arrays;

import java.util.*;

public class Anagram {

    public boolean isValid(String src, String target) {
        return sort(src).equals(sort(target));
    }

    private String sort(String s) {
        char[] c = s.toCharArray();
        Arrays.sort(c);
        return new String(c);
    }

    public String[][] groupAnagrams(String[] src) {
        Map<String, List<String>> m = new LinkedHashMap<>();
        for (String str: src) {
            String sorted = sort(str);
            if (m.containsKey(sorted)) {
                List<String> l = m.get(sorted);
                l.add(str);
                m.put(sorted, l);
            }
            else {
                List<String> l = new ArrayList<>();
                l.add(str);
                m.put(sorted, l);
            }
        }
        String[][] outer = new String[m.values().size()][];
        int i=0;
        Iterator<List<String>> itr = m.values().iterator();
        while (itr.hasNext()) {
            outer[i++] = itr.next().toArray(new String[0]);
        }
        return outer;
    }
}
