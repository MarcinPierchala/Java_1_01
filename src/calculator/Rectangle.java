package calculator;

public class Rectangle implements Shape{


    @Override
    public double calculateArea(double param_1, double param_2, double param_3) {
        return param_1 * param_2;
    }

    @Override
    public double calculatePerimeter(double param_1, double param_2, double param_3) {
        return 2 * param_1 + 2 * param_2;
    }
}
