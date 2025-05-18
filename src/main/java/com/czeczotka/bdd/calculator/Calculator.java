package com.czeczotka.bdd.calculator;

public class Calculator {

	private double result;

    public void add(double arg1, double arg2) {
        result = arg1 + arg2;
    }
    public void subtract(double arg1, double arg2) {
        result = arg1 - arg2;
    }
    public void multiply(double arg1, double arg2) {
        result = arg1 * arg2;
    }
    public void divide(double arg1, double arg2) {
        result = arg1 / arg2;
    }
    public void elevado(double arg1, double arg2) {
        result = Math.pow(arg1,arg2);
    }
    public double getResult() {
        return result;
    }
}



/* ORIGINAL
 package com.czeczotka.bdd.calculator;

public class Calculator {

    private int result;

    public void add(int arg1, int arg2) {
        result = arg1 + arg2;
    }
    public void subtract(int arg1, int arg2) {
        result = arg1 - arg2;
    }
    public void multiply(int arg1, int arg2) {
        result = arg1 * arg2;
    }
    public void divide(int arg1, int arg2) {
        result = arg1 / arg2;
    }
    public int getResult() {
        return result;
    }
}
 */
