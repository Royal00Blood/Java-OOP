package Homework.HW_7;


import com.sun.source.tree.TryTree;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Program {
    public static void main(String[] args)  {
        int num = 0;

        System.out.println("Выберете калькулятор:");
        System.out.println("   > 1- стандартный    ");
        System.out.println("   > 2- для комплексных чисел ");

        Scanner in = new Scanner(System.in);

        while (num < 1 || num > 2) {
            System.out.print("Выберите игру, введя соответствующую цифру: ");
            try{
                num = in.nextInt();
            }
            catch (ArithmeticException | NullPointerException  e) {
            System.out.println("Что-то пошло не так!Попробуйте еще раз <^_^>");
            }
            catch (Exception e) {
                System.out.println("Что-то пошло не так. Но это точно не ArithmeticException и не NPE.Попробуйте еще раз <^_^>");
            }
            finally {
                System.out.println("Молодец!!!");
            }
        }
        choiceСalculateMode(num);
    }

    public static void choiceСalculateMode(int numberMod) {

            switch (numberMod) {
                case 1:
                    CalculatorInt<Double> calDub = new Сalculator();
                    System.out.print("Отлично вы выбрали обычный калькулятор: ");
                    break;
                case 2:
                    CalculatorInt<ComplexNumber> calComp = new CalculatorComplex();
                    System.out.print("Отлично вы выбрали комплексный калькулятор: ");
                    break;
                default:
                    System.out.println("Простите, но вы допустили ошибку. Попробуйте еще раз <^_^>");
            }
    }
}
