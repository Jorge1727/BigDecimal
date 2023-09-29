package org.iesvdm;

import java.math.BigDecimal;
import java.math.RoundingMode;
public class InteresCompuesto {

    private BigDecimal p;//Monto invertido originalmente
    private BigDecimal r;//Tasa de interes anual
    private int n;//El numero de años
    private BigDecimal c;//cantidad depositada al final del año enesimo

    public InteresCompuesto(BigDecimal p, BigDecimal r, int n) {
        this.p = p;
        this.r = r;
        this.n = n;
    }

    public BigDecimal getP() {
        return p;
    }

    public void setP(BigDecimal p) {
        this.p = p;
    }

    public BigDecimal getR() {
        return r;
    }

    public void setR(BigDecimal r) {
        this.r = r;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public BigDecimal getC() {
        return c;
    }

    public void setC(BigDecimal c) {
        this.c = c;
    }

    public BigDecimal calculaMontoFinal()
    {
        //TODO
        BigDecimal uno = BigDecimal.ONE;
        BigDecimal unoMasRadio = uno.add(r.divide(new BigDecimal(100), 2,RoundingMode.HALF_UP));//(1 + (r/100))
        BigDecimal elevadoAnios = unoMasRadio.pow(n);//(1 + (r/100))^n
        c = p.multiply(elevadoAnios); // p * (1 + r/100)^n

        return c.setScale(2, RoundingMode.HALF_UP);//ponemos escala de dos y redondeamos hacia arriba para que coincida con el test
    }
}
