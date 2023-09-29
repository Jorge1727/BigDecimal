package org.iesvdm;

import java.math.BigInteger;

public class Factorial {

    private long n;
    private BigInteger factorial;

    public long getN() {
        return n;
    }

    public void setN(long n) {
        this.n = n;
    }

    public BigInteger getFactorial()
    {
        if (factorial == null)//Para que si es null pille la funcion
        {
            factorial = calcula();
        }
        return factorial;
    }

    public void setFactorial(BigInteger factorial) {
        this.factorial = factorial;
    }

    public Factorial(long n) {
        if ( n >= 0)
            this.n = n;
        else
            throw new RuntimeException("Valor " + n + " no permitido.");
    }

    public BigInteger calcula()
    {
        //TODO
        BigInteger resultado = BigInteger.valueOf(1);

        for (long i = 2; i <= n; i++)
        {
            resultado = resultado.multiply(BigInteger.valueOf(i));
        }

        return resultado;
    }

}
