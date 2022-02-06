package calculator;

import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);
    private static final String menu = "WYBIERZ KSZTAŁT FIGURY DO OBLICZENIA POWIERZCHNI I OBWODU:\n1: KOŁO\n2: TRÓJKĄT\n3: PROSTOKĄT";

    private double getParameter() {
        return scanner.nextDouble();
    }

    public static void main(String[] args) {
        Main main = new Main();
        Shape shape;
        System.out.println(menu);
        double input = main.getParameter();
        if (input == 1) {
            System.out.println("PODAJ PROMIEŃ KOŁA");
            double param_1 = main.getParameter();
            shape = new Circle();
            double area = shape.calculateArea(param_1, 0, 0);
            double perim = shape.calculatePerimeter(param_1, 0, 0);
            System.out.println("POLE TEGO KOŁA WYNOSI: "+ area + "\nA JEGO OBWÓD TO: " + perim);
        }
        else if(input == 2) {
            System.out.println("PODAJ MIARĘ PIERWSZEGO BOKU");
            double param_1 = main.getParameter();
            System.out.println("PODAJ MIARĘ DRUGIEGO BOKU");
            double param_2 = main.getParameter();
            System.out.println("PODAJ MIARĘ TRZECIEGO BOKU");
            double param_3 = main.getParameter();
            shape = new Triangle();
            double area = shape.calculateArea(param_1, param_2, param_3);
            double perim = shape.calculatePerimeter(param_1, param_2, param_3);
            System.out.println("POLE TEGO TRÓJKĄTA WYNOSI: "+ area + "\nA JEGO OBWÓD TO: " + perim);
        }
        else if(input == 3) {
            System.out.println("PODAJ WYMIAR KROTSZEGO BOKU");
            double param_1 = main.getParameter();
            System.out.println("PODAJ WYMIAR DŁUŻSZEGO BOKU");
            double param_2 = main.getParameter();
            shape = new Rectangle();
            double area = shape.calculateArea(param_1, param_2, 0);
            double perim = shape.calculatePerimeter(param_1, param_2, 0);
            System.out.println("POLE TEGO PROSTOKĄTA WYNOSI: "+ area + "\nA JEGO OBWÓD TO: " + perim);
        }
    }
}
