package dahuashejimoshi.simplefactorypattern;

public abstract class Operation {

    private double numberA;

    private double numberB;

    public double getNumberA() {
        return numberA;
    }

    public void setNumberA(double numberA) {
        this.numberA = numberA;
    }

    public double getNumberB() {
        return numberB;
    }

    public void setNumberB(double numberB) {
        this.numberB = numberB;
    }

    double getResult() {
        double result = 0D;
        return result;
    }
}
