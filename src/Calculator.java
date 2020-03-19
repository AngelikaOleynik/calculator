

public class Calculator {
    public static void calculator(String firstString, String arithmetic, String secondString) {
        int firstNum = 0;
        int secondNum = 0;
        int result = 0;

        boolean flag = false;
        try {
            firstNum = Integer.parseInt(firstString);
            secondNum = Integer.parseInt(secondString);
        } catch (Exception e) {
            try {
                firstNum = RomanArabicNumberConverter.toArabic(firstString);
                secondNum = RomanArabicNumberConverter.toArabic(secondString);
                flag = true; //римские числа
            } catch (Exception wrongData) {
                System.out.println("Вы ввели не верные данные");
            }
        }
        Action action;
        if (firstNum < 1 || firstNum > 10 || secondNum < 1 || secondNum > 10) {
            System.out.println("Вы ввели не верные данные");
            System.exit(0);
        }

        if (arithmetic.equals("-")) {
            action = new Subtraction();
            result = action.nums(firstNum, secondNum);
        }
        if (arithmetic.equals("+")) {
            action = new Addition();
            result = action.nums(firstNum, secondNum);
        }

        if (arithmetic.equals("*")) {
            action = new Multiplication();
            result = action.nums(firstNum, secondNum);
        }
        if (arithmetic.equals("/")) {
            action = new Division();
            result = action.nums(firstNum, secondNum);
        }

        if (flag) {
            String roman = RomanArabicNumberConverter.toRoman(result);
            System.out.println(roman);

        } else System.out.println(result);
    }
}