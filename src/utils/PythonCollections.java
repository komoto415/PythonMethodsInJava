package utils;

import java.util.*;
import java.util.stream.Collectors;

import static utils.PythonMethods.*;

/**
 @author Jeffrey Ng
 @created 2020-05-16 */
public class PythonCollections {
    // list()
    public static <T> List<T> list(T... x) {
        return new ArrayList<>(Arrays.asList(x));
    }

    public static List list(String x) {
        return x.chars().mapToObj(c -> (char) c).collect(Collectors.toList());
    }

    public static List list(Set x) {
        return new ArrayList(x);
    }

    public static List list(Map x) {
        return new ArrayList(x.keySet());
    }

    // set()
    public static Set set(int[] x) {
        return set(Arrays.stream(x).boxed().collect(Collectors.toList()));
    }

    public static Set set(Object[] x) {
        return set(Arrays.stream(x).collect(Collectors.toList()));
    }

    public static Set set(String[] x) {
        return set(Arrays.stream(x).collect(Collectors.toList()));
    }

    public static Set set(String x) {
        return set(x.chars().mapToObj(c -> (char) c).collect(Collectors.toList()));
    }

    public static Set set(List x) {
        return new HashSet(x);
    }

    // dict()
    public static Map dict(List<List> x) {
        assert enforceInnerSize(x);
        Map map = new HashMap();
        for (int i = 0; i < x.size(); i++) {
            List inner = x.get(i);
            map.put(inner.get(0), inner.get(1));
        }
        return map;
    }

    private static boolean enforceInnerSize(List<List> x) {
        for (int i = 0; i < x.size(); i++) {
            if (x.get(i).size() != 2) {
                return false;
            }
        }
        return true;
    }

    public static Map dict(List... x) {
        assert enforceInnerSize(x);
        Map map = new HashMap();
        for (int i = 0; i < x.length; i++) {
            List inner = x[i];
            map.put(inner.get(0), inner.get(1));
        }

        return map;
    }

    private static boolean enforceInnerSize(List... x) {
        for (int i = 0; i < x.length; i++) {
            if (x[i].size() != 2) {
                return false;
            }
        }
        return true;
    }

    // zip()
    public static byte[][] zip(byte[]... zipMe) {
        int capacity = Integer.MAX_VALUE;
        int zipInnerSize = zipMe.length;
        for (byte[] l : zipMe) {
            if (l.length < capacity) {
                capacity = l.length;
            }
        }
        byte[][] zipped = new byte[capacity][zipInnerSize];
        for (int i = 0; i < capacity; i++) {
            byte[] inner = new byte[zipInnerSize];
            for (int j = 0; j < zipInnerSize; j++) {
                inner[j] = zipMe[j][i];
            }
            zipped[i] = inner;
        }

        return zipped;
    }

    public static short[][] zip(short[]... zipMe) {
        int capacity = Integer.MAX_VALUE;
        int zipInnerSize = zipMe.length;
        for (short[] l : zipMe) {
            if (l.length < capacity) {
                capacity = l.length;
            }
        }
        short[][] zipped = new short[capacity][zipInnerSize];
        for (int i = 0; i < capacity; i++) {
            short[] inner = new short[zipInnerSize];
            for (int j = 0; j < zipInnerSize; j++) {
                inner[j] = zipMe[j][i];
            }
            zipped[i] = inner;
        }

        return zipped;
    }

    public static int[][] zip(int[]... zipMe) {
        int capacity = Integer.MAX_VALUE;
        int zipInnerSize = zipMe.length;
        for (int[] l : zipMe) {
            if (l.length < capacity) {
                capacity = l.length;
            }
        }
        int[][] zipped = new int[capacity][zipInnerSize];
        for (int i = 0; i < capacity; i++) {
            int[] inner = new int[zipInnerSize];
            for (int j = 0; j < zipInnerSize; j++) {
                inner[j] = zipMe[j][i];
            }
            zipped[i] = inner;
        }

        return zipped;
    }

    public static long[][] zip(long[]... zipMe) {
        int capacity = Integer.MAX_VALUE;
        int zipInnerSize = zipMe.length;
        for (long[] l : zipMe) {
            if (l.length < capacity) {
                capacity = l.length;
            }
        }
        long[][] zipped = new long[capacity][zipInnerSize];
        for (int i = 0; i < capacity; i++) {
            long[] inner = new long[zipInnerSize];
            for (int j = 0; j < zipInnerSize; j++) {
                inner[j] = zipMe[j][i];
            }
            zipped[i] = inner;
        }

        return zipped;
    }

    public static float[][] zip(float[]... zipMe) {
        int capacity = Integer.MAX_VALUE;
        int zipInnerSize = zipMe.length;
        for (float[] l : zipMe) {
            if (l.length < capacity) {
                capacity = l.length;
            }
        }
        float[][] zipped = new float[capacity][zipInnerSize];
        for (int i = 0; i < capacity; i++) {
            float[] inner = new float[zipInnerSize];
            for (int j = 0; j < zipInnerSize; j++) {
                inner[j] = zipMe[j][i];
            }
            zipped[i] = inner;
        }

        return zipped;
    }

    public static double[][] zip(double[]... zipMe) {
        int capacity = Integer.MAX_VALUE;
        int zipInnerSize = zipMe.length;
        for (double[] l : zipMe) {
            if (l.length < capacity) {
                capacity = l.length;
            }
        }
        double[][] zipped = new double[capacity][zipInnerSize];
        for (int i = 0; i < capacity; i++) {
            double[] inner = new double[zipInnerSize];
            for (int j = 0; j < zipInnerSize; j++) {
                inner[j] = zipMe[j][i];
            }
            zipped[i] = inner;
        }

        return zipped;
    }

    public static boolean[][] zip(boolean[]... zipMe) {
        int capacity = Integer.MAX_VALUE;
        int zipInnerSize = zipMe.length;
        for (boolean[] l : zipMe) {
            if (l.length < capacity) {
                capacity = l.length;
            }
        }
        boolean[][] zipped = new boolean[capacity][zipInnerSize];
        for (int i = 0; i < capacity; i++) {
            boolean[] inner = new boolean[zipInnerSize];
            for (int j = 0; j < zipInnerSize; j++) {
                inner[j] = zipMe[j][i];
            }
            zipped[i] = inner;
        }

        return zipped;
    }

    public static String[][] zip(String[]... zipMe) {
        int capacity = Integer.MAX_VALUE;
        int zipInnerSize = zipMe.length;
        for (String[] l : zipMe) {
            if (l.length < capacity) {
                capacity = l.length;
            }
        }
        String[][] zipped = new String[capacity][zipInnerSize];
        for (int i = 0; i < capacity; i++) {
            String[] inner = new String[zipInnerSize];
            for (int j = 0; j < zipInnerSize; j++) {
                inner[j] = zipMe[j][i];
            }
            zipped[i] = inner;
        }

        return zipped;
    }

    public static Object[][] zip(Object[]... zipMe) {
        int capacity = Integer.MAX_VALUE;
        int zipInnerSize = zipMe.length;
        for (Object[] l : zipMe) {
            if (l.length < capacity) {
                capacity = l.length;
            }
        }
        Object[][] zipped = new Object[capacity][zipInnerSize];
        for (int i = 0; i < capacity; i++) {
            Object[] inner = new Object[zipInnerSize];
            for (int j = 0; j < zipInnerSize; j++) {
                inner[j] = zipMe[j][i];
            }
            zipped[i] = inner;
        }

        return zipped;
    }

    public static List<List> zip(List... zipMe) {
        int capacity = Integer.MAX_VALUE;
        int zipInnerSize = zipMe.length;
        for (List l : zipMe) {
            if (l.size() < capacity) {
                capacity = l.size();
            }
        }
        List<List> zipped = new ArrayList(capacity);
        for (int i = 0; i < capacity; i++) {
            List inner = new ArrayList(zipInnerSize);
            for (List list : zipMe) {
                inner.add(list.get(i));
            }
            zipped.add(Collections.unmodifiableList(inner));
        }

        return zipped;
    }

    public static List<List> enumerate(List x) {
        return enumerate(x, 0);
    }

    public static List<List> enumerate(List x, int o) {
        List<List> enumerated = new ArrayList(x.size());
        for (int i = o; i < x.size() + o; i++) {
            enumerated.add(List.of(i, x.get(i - o)));
        }

        return enumerated;
    }

    public static void main(String[] args) {
        final String me = "Jeffrey";
        int[] intArr1 = new int[] {1, 2, 3};
        int[] intArr2 = new int[] {4, 5, 6};
//        for (int[] tup : zip(intArr1, intArr2)) {
//            int i = tup[0];
//            int j = tup[1];
//            print(i, j);
//        }

        String[] stringArr1 = new String[] {"Jeffrey", "Claudia", "Geoff",};
        String[] stringArr2 = new String[] {"Alana", "Manny", "Robert",};
        String[] stringArr3 = new String[] {"Reed", "Kathryn", "Sergiy",};

        Object[] objectArr1 = new String[] {"Jeffrey", "Claudia", "Geoff",};
        Object[] objectArr2 = new String[] {"Alana", "Manny", "Robert",};
        Object[] objectArr3 = new String[] {"Reed", "Kathryn", "Sergiy",};

//        for (String[] tup : zip(stringArr1, stringArr2)) {
//            String x = tup[0];
//            String y = tup[1];
//            print(x, y);
//        }
//        for (String[] tup : zip(stringArr1, stringArr2, stringArr3)) {
//            String x = tup[0];
//            String y = tup[1];
//            String z = tup[2];
//            print(x, y, z);
//        }
//        for (Object[] tup : zip(objectArr1, objectArr2)) {
//            Object x = tup[0];
//            Object y = tup[1];
//            print(x, y);
//        }
//        for (Object[] tup : zip(objectArr1, objectArr2, objectArr3)) {
//            Object x = tup[0];
//            Object y = tup[1];
//            Object z = tup[2];
//            print(x, y, z);
//        }

        List<String> stringList1 = list(stringArr1);
        List<String> stringList2 = list(stringArr2);
        List<String> stringList3 = list(stringArr3);

//        zip(stringList1, stringList2).forEach(PythonMethods::print);
//        zip(stringList1, stringList2, stringList3).forEach(PythonMethods::print);
//        zip(stringList1, stringList2, integerList).forEach(PythonMethods::print);

        List<Integer> emptyList1 = list();
        print(emptyList1);
        List<Integer> emptyList2 = new ArrayList<>();
//        zip(emptyList1, emptyList2).forEach(PythonMethods::print);

        List<List> e = enumerate(stringList1);
//        e.forEach(PythonMethods::print);

        List<List> eWithO = enumerate(stringList1, 2);
//        eWithO.forEach(PythonMethods::print);

        Set<String> stringSet1 = set(stringArr1);
        Set<String> stringSet2 = set(stringList1);
//        print(stringSet1);
//        print(stringSet2);

//        Set<Character> stringToCharSet = set(me);
//        print(stringToCharSet);
//        List<Character> stringToCharList  = list(me);
//        print(stringToCharList);
//        stringToCharList = list(stringToCharSet);
//        print(stringToCharList);

        Set<Integer> intArrToSet = set(intArr1);
//        print(intArrToSet);

        List tup1 = new ArrayList(2);
        tup1.add(me);
        tup1.add(4);
        List tup2 = new ArrayList(2);
        tup2.add("Claudia");
        tup2.add(1);
        List tup3 = new ArrayList(2);
        tup3.add("Geoff");
        tup3.add(2);

        Map<String, Integer> mapWithLists = dict(tup1, tup2, tup3);
//        print(mapWithLists);

        List<List> listOfTups = new ArrayList<>();
        listOfTups.add(tup1);
        listOfTups.add(tup2);
        listOfTups.add(tup3);

        Map<String, Integer> mapWithNestLists = dict(listOfTups);
//        print(mapWithNestLists);
    }
}
