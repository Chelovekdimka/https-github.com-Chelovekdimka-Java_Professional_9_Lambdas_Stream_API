//Напишіть основні арифметичні дії калькулятора, використовуючи лямбда-вирази

package Ex_4;

import java.security.spec.RSAOtherPrimeInfo;

public class Main {
    public static void main(String[] args) {
        Calculate add = (a,b)-> a + b;
        Calculate sub = (a,b)-> a - b;
        Calculate div = (a,b)-> a / b;
        Calculate mul = (a,b)-> a * b;

        double resultAdd = add.calculate(3,2);
        double resultSub = sub.calculate(3,2);
        double resultDiv = div.calculate(3,2);
        double resultMultiple = mul.calculate(3,2);

        System.out.println(resultAdd);
        System.out.println(resultSub);
        System.out.println(resultDiv);
        System.out.println(resultMultiple);
    }
}
