

public class RomeNumber {
    public static int getNumber(String num){
        if (num.equals("I")) return 1;
        if (num.equals("II")) return 2;
        if (num.equals("III")) return 3;
        if (num.equals("IV")) return 4;
        if (num.equals("V")) return 5;
        if (num.equals("VI")) return 6;
        if (num.equals("VII")) return 7;
        if (num.equals("VIII")) return 8;
        if (num.equals("IX")) return 9;
        if (num.equals("X")) return 10;
        System.out.println("Ошибка типов!");
        return 0;
    }

    public static String getResult(int res){
        if (res < 0) {
            System.out.println("Ответ не может быть отрицательным!");
            return null;
        }
        String result = "";
        while (res >= 100){
            result+="C"; // 100
            res-=100;
        }
        while (res >= 90){
            result += "XC"; // 90
            res-=90;
        }
        while (res >= 50){
            result += "L";
            res-=50;
        }
        while (res >= 40){
            result += "XL";
            res-=50;
        }
        while (res >= 10){
            result += "X";
            res-=10;
        }
        while (res >= 9){
            result += "IX";
            res-=9;
        }
        while (res >= 5){
            result += "V";
            res-=5;
        }
        while (res >= 4){
            result += "IV";
            res-=4;
        }
        while (res >= 1){
            result += "I";
            res-=1;
        }
        return result;
    }
}
