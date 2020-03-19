

public class Calculator {
    public static void calculator (String firstString, String arithmetic, String secondString) {
        int first = 0;
        int second = 0;
        int result =0;

        boolean flag = false;
        try {
            first = Integer.parseInt(firstString);
            second = Integer.parseInt(secondString);
        } catch (Exception e) {
            try {
                first = RomanArabicNumberConverter.toArabic(firstString);
                second = RomanArabicNumberConverter.toArabic(secondString);
                flag = true;
            } catch (Exception wrongData) {
                System.out.println("Вы ввели не верные данные");
            }
        }
        if (first<1 || first>10 || second<1|| second>10){
            System.out.println("Вы ввели не верные данные");
            System.exit(0);
        }
        Action action;
        if (arithmetic.equals("-")) {
            action = new Subtraction();
            result = action.nums(first, second);
        }
        if (arithmetic.equals("*")){
            action = new Multiplication();
            result = action.nums(first, second);
        }
        if (arithmetic.equals("/")){
            action = new Division();
            result = action.nums(first, second);
        }
        if (arithmetic.equals("+")){
            action = new Addition();
            result = action.nums(first, second);
        }
        if (flag){
            String roman = RomanArabicNumberConverter.toRoman(result);
            System.out.println(roman);

        }
        else System.out.println(result);
    }
}