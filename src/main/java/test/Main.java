package test;

import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        new FirstTest().process(100);
        System.out.println(new SecondTest().process(BigInteger.valueOf(5467), BigInteger.valueOf(521)));
        new ThirdTest().process("one two two, three, three, three.");
    }
}
