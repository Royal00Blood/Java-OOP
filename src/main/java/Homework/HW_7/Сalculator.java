package Homework.HW_7;

import Homework.HomeWork_3.game.Answer;

import java.util.ArrayList;
import java.util.List;

public class Сalculator implements CalculatorInt<Double>{

    ArrayList<LogBuilder <Double>> logHistory;
    @Override
    public Double sumNumbers (List<Double> items){
        double sum = 0;
        for (Number i: items)
            sum += i.doubleValue();
        return sum;
    }

    @Override
    public Double mulNumbers (List<Double> items){
        double mul = 0;
        for (Number i: items)
            mul *= i.doubleValue();
        return mul;
    }

    @Override
    public Double subNumbers(List<Double> items) {
        double sub = 0;
        for (Number i: items)
            sub += i.doubleValue();
        return sub;
    }
    @Override
    public ArrayList <LogBuilder <Double>> getLog() {
        return logHistory;
    }

    public ArrayList binaryNumbers (List<Double> items){
        ArrayList <String> array = new ArrayList<>();
        for (Number i:items) {
            array.add(Integer.toBinaryString(i.intValue()));
        }
        return array;
    }

    public Double divNumbers (List<Double> items){
        double div = 0;
        for (Number i: items)
            div /= i.doubleValue();
        return div;
    }
}
