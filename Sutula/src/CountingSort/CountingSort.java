package CountingSort;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class CountingSort {

    public static <E extends Comparable> void sort(E[] mas) {
        Map<E, Integer> freq = new TreeMap<>();
        for (E e : mas)
            freq.put(e, freq.get(e) == null ? 1 : freq.get(e) + 1);

        int total = 0;
        for (E key : freq.keySet()) {
            int oldValue = freq.get(key);
            freq.put(key, total);
            total += oldValue;
        }

        E[] result = mas.clone();

        for (E e : result) {
            mas[freq.get(e)] = e;
            freq.put(e, freq.get(e) + 1);
        }
    }
//
//    private static <E extends Comparable> Map<E, Integer> sort(Map<E, Integer> freq) {
//        List<Map.Entry<E, Integer>> list = new LinkedList<>(freq.entrySet());
//        Collections.sort(list, new Comparator<Map.Entry<E, Integer>>() {
//            @Override
//            public int compare(Map.Entry<E, Integer> o1, Map.Entry<E, Integer> o2) {
//                return (o1.getValue()).compareTo(o2.getValue());
//            }
//        });
//
//        Map<E, Integer> map = new LinkedHashMap<>();
//        for (Iterator it = list.iterator(); it.hasNext();){
//            Map.Entry<E, Integer> entry = (Map.Entry<E, Integer>) it.next();
//            map.put(entry.getKey(), entry.getValue());
//        }
//        return map;
//    }


    public static void main(String[] args) {
        Integer[] mas = {1, 1, 23, 3, 4, 5, 4, 5};
        sort(mas);
        System.out.println(Arrays.toString(mas));
    }
}
