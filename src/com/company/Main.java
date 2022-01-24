package com.company;
import Auto.*;
import Exceptions.*;
import Interface.*;
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args)  {
        try {
            //машины
            Car car1 = new Car("BMW", 2);
            Transport car2 = new Car("BMW", 2);
            Transport car3 = new Car("Audi", 2);
            Transport clone = (Car) car1.clone();

            System.out.println("Машины:");
            System.out.println(car1.toString());
            System.out.println(car2.toString());
            System.out.println(car3.toString());

            System.out.println("Сравнение:");
            System.out.println(car1.equals(car2));
            System.out.println(car1.equals(car3));

            System.out.println("Хэш:");
            System.out.println(car1.hashCode());
            System.out.println(car2.hashCode());
            System.out.println(car3.hashCode());

            System.out.println("Клонирование:");
            System.out.println(clone);
            System.out.println(car1);
            System.out.println(car1.equals(clone));
            System.out.println(car1.hashCode() + " " + clone.hashCode());
            System.out.println("------------------------------");

            //мотоциклы
            Motorbike motorbike1 = new Motorbike("Harley", 2);
            Transport motorbike2 = new Motorbike("Harley", 2);
            Transport motorbike3 = new Motorbike("A", 2);
            Motorbike clone1 = (Motorbike) motorbike1.clone();

            System.out.println("Мотоциклы:");
            System.out.println(motorbike1.toString());
            System.out.println(motorbike2.toString());
            System.out.println(motorbike3.toString());

            System.out.println("Сравнение:");
            System.out.println(motorbike1.equals(motorbike2));
            System.out.println(motorbike1.equals(motorbike3));

            System.out.println("Хэш:");
            System.out.println(motorbike1.hashCode());
            System.out.println(motorbike2.hashCode());
            System.out.println(motorbike3.hashCode());

            System.out.println("Клонирование:");
            System.out.println(clone1);
            System.out.println(motorbike1);
            System.out.println(motorbike1.equals(clone1));
            System.out.println(motorbike1.hashCode() + " " + clone1.hashCode());

            System.out.println("------------------------------");
            System.out.println("Поменять мотоцикл:");
            clone1.setNewModelName("Мотоцикл1","11");
            System.out.println(motorbike1);
            System.out.println(clone1);

            System.out.println("Поменять машину:");
            clone.setNewModelName("Машина1","91");
            System.out.println(car1);
            System.out.println(clone);

        } catch (ModelPriceOutOfBoundsException | DuplicateModelNameException|NoSuchModelNameException e) {
            e.printStackTrace();
        }
    }
}

