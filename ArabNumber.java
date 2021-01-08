
public class ArabNumber {
    public static int getNumber(String num){
        try {
            int number = Integer.parseInt(num);
            if (number < 1 || number > 10) throw new Exception();
            return number;
        }
        catch (Exception e){
            System.out.println("Ошибка типов!");
            return 0;
        }
    }
}
