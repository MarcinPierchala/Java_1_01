package calculator;

public class Triangle implements Shape{

    @Override
    public double calculateArea(double param_1, double param_2, double param_3) {
        double small_p = (param_1 + param_2 + param_3) / 2;
        double t_area = Math.sqrt(small_p * (small_p - param_1) * (small_p - param_2) * (small_p - param_3));
        return t_area;
    }

    @Override
    public double calculatePerimeter(double param_1, double param_2, double param_3) {
        return param_1 + param_2 + param_3;
    }
}
