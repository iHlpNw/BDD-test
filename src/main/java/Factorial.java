import java.math.BigInteger;

public class Factorial {
    public static long smallFactorial(int value){
        if(value == 0) return 1;
        else if(value >=1 && value <=20) return value*smallFactorial(value-1);
        else if(value<0) throw new ArithmeticException("Ошибка: введите неотрицательное целое число");
        else throw new ArithmeticException("Ошибка: введите неотрицательное целое число");
    }
    public static BigInteger bigFactorial(int value){
        if(value <0) throw new ArithmeticException("Ошибка: введите неотрицательное целое число");
        BigInteger result = BigInteger.ONE;
        for(int x = 1; x<=value; x++){
            result = result.multiply(BigInteger.valueOf(x));
        }
        return result;
    }
    public static String getFactorial(String inputValue){
        int value = 0;
        try {
            value = Integer.parseInt(inputValue);
        }catch(Exception e){
            throw new ArithmeticException("Ошибка: введите неотрицательное целое число");
        }
        if(value <= 20) return String.valueOf(smallFactorial(value));
        else return bigFactorial(value).toString();
    }
}
