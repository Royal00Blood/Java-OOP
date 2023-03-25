package Homework.HW_7;

import java.util.ArrayList;
import java.util.List;

public class CalculatorComplex implements CalculatorInt<ComplexNumber>{
    ArrayList<LogBuilder <ComplexNumber>> logHistory;
    public double abs(ComplexNumber complexNumber) {
        return Math.hypot(complexNumber.getReal(), complexNumber.getImaginary());
    }

    @Override
    public ComplexNumber sumNumbers(List<ComplexNumber> items) {
        ComplexNumber sum = new ComplexNumber(0.0,0.0);
        for (ComplexNumber i: items) {
            sum.setReal(sum.getReal() + i.getReal());
            sum.setReal(sum.getImaginary() + i.getImaginary());
        }
        return sum;
    }

    @Override
    public ComplexNumber mulNumbers(List<ComplexNumber> items) {
        ComplexNumber mul = new ComplexNumber(0.0,0.0);
        for (ComplexNumber i: items) {
            mul.setReal(mul.getReal() * i.getReal()-mul.getImaginary()*i.getImaginary());
            mul.setReal(mul.getReal() * i.getImaginary()+mul.getImaginary()*i.getReal());
        }
        return mul;
    }

    @Override
    public ComplexNumber subNumbers(List<ComplexNumber> items) {
        ComplexNumber sub = new ComplexNumber(0.0,0.0);
        for (ComplexNumber i: items) {
            sub.setReal(sub.getReal() - i.getReal());
            sub.setReal(sub.getImaginary() - i.getImaginary());
        }
        return sub;
    }

    @Override
    public ArrayList<LogBuilder<ComplexNumber>> getLog() {
        return logHistory;
    }
}
