
public class Number {
    private static int number1;
    private static int number2;
    private static String example;
    private static String result = null;

    public static String getResult(String s) {
        example = s;
        Run();
        return result;
    }

    private static void Run() {
        int i = 0;
        String s_number1 = "", s_number2 = "";

        //получаем первое число
        while (i < example.length() && (example.charAt(i) != '+' && example.charAt(i) != '-'
                && example.charAt(i) != '*' &&
                example.charAt(i) != '/')) {
            s_number1 += example.charAt(i);
            i++;
        }
        if (i >= example.length()) {
            System.out.println("Неправильно введен пример!");
            return;
        }
        //получаем операцию
        char oper = example.charAt(i);
        i++;
        //получаем второе число
        while (i < example.length()) {
            s_number2 += example.charAt(i);
            i++;
        }

        char type;
        //получаем первое и второе число в типе int
        if (Character.isDigit(example.charAt(0))) {
            type = 'a';
            //арабские
            number1 = ArabNumber.getNumber(s_number1);
            number2 = ArabNumber.getNumber(s_number2);
        } else {
            type = 'r';
            //римские
            number1 = RomeNumber.getNumber(s_number1);
            number2 = RomeNumber.getNumber(s_number2);
        }
        if (number2 == 0 || number1 == 0) {
            return;
        }

        //Получаем результат
        int res = MathC.getResult(oper, number1, number2);

        if (res == 0) return;

        if (type == 'a') {
            result = Integer.toString(res);
        } else {
            result = RomeNumber.getResult(res);
        }
    }
}
