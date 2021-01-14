
public class MathC {

    public static int getResult(char oper, int num1, int num2){
        switch(oper){
            case '+':
                return Sum(num1,num2);
            case '-':
                return Sub(num1,num2);
            case '*':
                return Mul(num1,num2);
            case '/':
                return Del(num1,num2);
            default:
                System.out.println("Неправильно введен пример!");
                return 0;
        }
    }

    private static int Sum (int a, int b){
        return a + b;
    }

    private static int Sub (int a, int b){
        return a - b;
    }

    private static int Mul (int a, int b){
        return a * b;
    }

    private static int Del(int a, int b){
        return a / b;
    }
}
