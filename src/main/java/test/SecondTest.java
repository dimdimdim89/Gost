package test;

import java.math.BigInteger;

class SecondTest {
    BigInteger process(BigInteger m, BigInteger r) {
        if (m.compareTo(BigInteger.valueOf(0)) < 0 || r.compareTo(BigInteger.valueOf(0)) < 0) {
            throw new RuntimeException("Bad input");
        }
        if (m.equals(BigInteger.ZERO) || r.equals(BigInteger.ZERO)) {
            return BigInteger.ONE;
        }
        BigInteger start = m.subtract(r).add(BigInteger.ONE);
        BigInteger up = BigInteger.ONE;
        for (BigInteger i = start; i.compareTo(m) <= 0; i = i.add(BigInteger.ONE)) {
            up = up.multiply(i);
        }
        start = BigInteger.ONE;
        BigInteger down = BigInteger.ONE;
        for (BigInteger i = start; i.compareTo(r) <= 0; i = i.add(BigInteger.ONE)) {
            down = down.multiply(i);
        }
        return up.divide(down);
    }
}
