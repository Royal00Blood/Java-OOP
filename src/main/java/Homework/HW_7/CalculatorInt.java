package Homework.HW_7;

import Homework.HomeWork_3.game.Answer;
import Homework.HomeWork_4.example.task01.GenBox;

import java.util.ArrayList;
import java.util.List;

public interface CalculatorInt<E>{
    public E sumNumbers (List<E> items);
    public E mulNumbers (List<E> items);
    public E subNumbers (List<E> items);
    public ArrayList<LogBuilder<E>> getLog();
}

