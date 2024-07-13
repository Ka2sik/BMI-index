public class Main {
    public static void main(String[] args) {

        BmiService service = new BmiService();
        int bmi = service.calculate(98, 1.87); // должно быть 28
        System.out.println("Индекс BMI: " + bmi);

        bmi = service.calculate(80, 1.80); // должно быть 24
        System.out.println("Индекс BMI: " + bmi);

        bmi = service.calculate(65, 1.75); // должно быть 21
        System.out.println("Индекс BMI: " + bmi);
    }
}