public class BmiService {
    public int calculate(double heightMeters, int massKg) {
        int index = (int) (massKg / Math.pow(heightMeters, 2));
        return index;
    }
}
