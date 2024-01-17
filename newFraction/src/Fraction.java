public class Fraction {
    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenomenator() {
        return denomenator;
    }

    public void setDenomenator(int denomenator) {
        this.denomenator = denomenator;
    }

    public int numerator;
    public int denomenator;

    @Override
    public String toString() {
        return numerator + "/" + denomenator;
    }
}
