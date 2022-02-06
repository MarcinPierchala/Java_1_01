package calculator;

public class Circle implements Shape{
    @Override
    public double calculateArea(double param_1, double param_2, double param_3) {
        return 3.14 * Math.pow(param_1, 2);
    }

    @Override
    public double calculatePerimeter(double param_1, double param_2, double param_3) {
        return 2 * 3.14 * param_1;
    }
}

