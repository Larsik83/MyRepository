import java.util.TreeMap;

public class ZamenaRoman {


    private final static TreeMap<Integer, String> map = new TreeMap<Integer, String>();

    static {

        map.put(1000, "M");
        map.put(900, "CM");
        map.put(500, "D");
        map.put(400, "CD");
        map.put(100, "C");
        map.put(90, "XC");
        map.put(50, "L");
        map.put(40, "XL");
        map.put(10, "X");
        map.put(9, "IX");
        map.put(5, "V");
        map.put(4, "IV");
        map.put(1, "I");

    }

    public final static String toRoman(int number) {
        int l = map.floorKey(number);
        if (number == l) {
            return map.get(number);
        }
        return map.get(l) + toRoman(number - l);
    }

    static int ZamenaRoman(String a) {
        int i = 0;

        switch (a) {
            case "I":
                i = 1;
                break;
            case "II":
                i = 2;
                break;
            case "III":
                i = 3;
                break;
            case "IV":
                i = 4;
                break;
            case "V":
                i = 5;
                break;
            case "VI":
                i = 6;
                break;
            case "VII":
                i = 7;
                break;
            case "VIII":
                i = 8;
                break;
            case "IX":
                i = 9;
                break;
            case "X":
                i = 10;
                break;

        }
        return i;

    }
}