package Homework.HW_7;

public class ComplexNumber {
    private double real;
    private double imaginary;

    /**
     * Создает экземпляр комплексного числа.
     *
     * @param real действительная часть
     * @param imaginary мнимая часть
     */
    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    /**
     * Возвращает действительную часть числа.
     *
     * @return действительную часть числа
     */
    public double getReal() {
        return real;
    }

    /**
     * Для изменения действительной части числа.
     *
     * @return действительную часть числа
     */
    public void setReal(double real) {
        this.real = real;
    }

    /**
     * Возвращает мнимую часть.
     *
     * @return мнимую часть числа
     */
    public double getImaginary() {
        return imaginary;
    }

    /**
     * Для изменения мнимой части числа.
     *
     * @return действительную часть числа
     */
    public void setImaginary(double imaginary) {
        this.imaginary = imaginary;
    }

    /**
     * Возвращает модуль числа.
     *
     * @return модуль комплексного числа
     */
    public double abs() {
        return Math.hypot(real, imaginary);
    }

    /**
     * Возвращает обратное комплексное число.
     *
     * @return обратное число
     */
    public ComplexNumber reciprocal() {
        double scale = real * real + imaginary * imaginary;
        return new ComplexNumber(real / scale, -imaginary / scale);
    }
    public String toString() {
        if (imaginary == 0) return real + "";
        if (real == 0) return imaginary + "i";
        if (imaginary < 0) return real + " - " + (-imaginary) + "i";
        return real + " + " + imaginary + "i";
    }
}
