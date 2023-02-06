package Chapter4;

import java.math.BigInteger;
import java.util.Scanner;

public class MultiplesOf2 {
    public static void main(String []args){
        Scanner input = new Scanner(System.in);
        BigInteger number = new BigInteger ("1");

        while (true)
        {
            number = number.multiply(BigInteger.TWO);
            System.out.println(number);
        }
    }
}
