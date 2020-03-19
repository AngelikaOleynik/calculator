import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Введите данные в формате: 2 + 2 или I + I. Пробелы обязательны.");
        System.out.println("Программа принимает как арабские, так и римские числа от 1 до 10, или от I до X.");

        List<String> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        try {
            for (String returnVal : input.split(" ", 50)) {  //разделяет данную строку вокруг данного регулярного выражения;возвращает массив строк, вычисленных путем разделения данной строки вокруг данного регулярного выражения
                list.addAll(Collections.singleton(returnVal));
            }
            Calculator.calculator(list.get(0), list.get(1), list.get(2));
        } catch (Exception e) {
            System.out.println("Ошибка! Проверь правильность ввода чисел!");
        }
        System.exit(0);
    }

}