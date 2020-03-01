package com.company;

import java.util.*;

public class CalculatorJM extends ToolsCalculator{
    static List<String> arifmetics = Arrays.asList("+", "-", "/", "*");
    static Map<String, Integer> mapRimNumber = Map.of("I", 1, "II", 2, "III", 3, "IV", 4, "V", 5,
            "VI", 6, "VII", 7, "VIII", 8, "IX", 9, "X", 10);

    public static void CalculationArabNumber(Scanner in, int a, String b, int c) throws Exception {
        int result= 0;
        if (in.hasNextInt()) {
            a = in.nextInt();
            b = in.next();
            if (a < 11 && arifmetics.contains(b)) {
                if (in.hasNextInt()) {
                    c = in.nextInt();
                    if (c < 11) {
                        switch (b) {
                            case "+":
                                System.out.println(a + c);
                                break;
                            case "-":
                                System.out.println(a - c);
                                break;
                            case "/":
                                System.out.println(a / c);
                                break;
                            case "*":
                                System.out.println(a * c);
                                break;
                        }
                    } else throw new Exception();
                } else throw new Exception();
            } else throw new Exception();
        }
        result++;
    }

    public static void CalculationRomNumber(Scanner in, String d, String f, String g) throws Exception {
        int a;
        int c;
        if (in.hasNext()) {
            d = in.next();
            f = in.next();
            g = in.next();
            if (mapRimNumber.containsKey(d) && arifmetics.contains(f) && mapRimNumber.containsKey(g)) {
                a = mapRimNumber.get(d);
                c = mapRimNumber.get(g);
                if (a < 11 && c < 11) {
                    switch (f) {
                        case "+":
                            System.out.println(IntegerToRomanNumeral(a + c));
                            break;
                        case "-":
                            System.out.println(IntegerToRomanNumeral(a - c));
                            break;
                        case "/":
                            System.out.println(IntegerToRomanNumeral(a / c));
                            break;
                        case "*":
                            System.out.println(IntegerToRomanNumeral(a * c));
                            break;
                    }
                }else throw new Exception();
            } else throw new Exception();
        }
    }
    public static void WorkingCalculator() throws Exception {
        System.out.println("Ввод: ");
        Scanner in = new Scanner(System.in);
        int a = 0;
        String b = "";
        int c = 0;
        String d = "";
        String f = "";
        String g = "";

        if (in.hasNextInt())
            CalculationArabNumber(in,a,b,c);
        else{
            CalculationRomNumber(in,d,f,g);
        }
    }
}