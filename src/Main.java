public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double height = 1.87;
        int mass = 98;
        int massIndex = service.calculate(height, mass); // должно получиться 500
        System.out.println(massIndex);
    }
}
