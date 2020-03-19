import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

class RomanArabicNumberConverter {

    private final static TreeMap<Integer, String> map = new TreeMap<>();

    static {
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

    private static List<String> roman = new ArrayList<>();

    static {
        roman.add("Нулевое значение");
        roman.add("I");
        roman.add("II");
        roman.add("III");
        roman.add("IV");
        roman.add("V");
        roman.add("VI");
        roman.add("VII");
        roman.add("VIII");
        roman.add("IX");
        roman.add("X");
    }

    public static String toRoman(int number) {
        int l = map.floorKey(number); //возвращает наибольший ключ, который меньше или равен ключу obj. Если такого ключа нет, то возвращается null.
        if (number == l) {
            return map.get(number);
        }
        return map.get(l) + toRoman(number - l);
    }

    public static int toArabic(String number) {
        return roman.indexOf(number);
    }
}