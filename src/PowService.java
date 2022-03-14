public class PowService {
    public static double pow(double value, int powValue) {
        double result = 1;
        for (int a = 1; a <= powValue; a++) {
            result = result * value;
        }
        return result;
    }
}
