package homeworks.hw5;

public class RationalNumber {
    private int numerator;
    private int denominator;

    public RationalNumber(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public RationalNumber add(RationalNumber other) {
        int lcm = lcm(this.denominator, other.denominator);
        int num = this.numerator * (lcm / this.denominator) + other.numerator * (lcm / other.denominator);
        return new RationalNumber(num, lcm);
    }

    public RationalNumber subtract(RationalNumber other) {
        int lcm = lcm(this.denominator, other.denominator);
        int num = this.numerator * (lcm / this.denominator) - other.numerator * (lcm / other.denominator);
        return new RationalNumber(num, lcm);
    }

    public RationalNumber multiply(RationalNumber other) {
        int num = this.numerator * other.numerator;
        int den = this.denominator * other.denominator;
        return new RationalNumber(num, den);
    }

    public RationalNumber divide(RationalNumber other) {
        int num = this.numerator * other.denominator;
        int den = this.denominator * other.numerator;
        return new RationalNumber(num, den);
    }

    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    private int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    @Override
    public String toString() {
        if (denominator == 1) {
            return Integer.toString(numerator);
        }
        return numerator + "/" + denominator;
    }
}

