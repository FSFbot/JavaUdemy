import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.Duration;

public class RentalCalculator {

    private static final double TAX_RATE_NORMAL = 0.20;
    private static final double TAX_RATE_REDUCED = 0.15;
    private static final int RENTAL_TIME_LIMIT = 12; // hours
    private static final double PRICE_THRESHOLD = 100.00;

    public static void main(String[] args) {
        String start_time = "25/06/2018 10:30";
        String end_time = "25/06/2018 14:40";
        double hourly_rate = 10.00;
        double daily_rate = 130.00;

        RentalCost cost = calculateRentalCost(start_time, end_time, hourly_rate, daily_rate);
        System.out.println("Duração: " + cost.durationHours + " horas");
        System.out.println("Pagamento básico: R$" + cost.basePayment);
        System.out.println("Imposto: R$" + cost.tax);
        System.out.println("Pagamento total: R$" + cost.totalPayment);
    }

    private static RentalCost calculateRentalCost(String start, String end, double hourlyRate, double dailyRate) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        LocalDateTime startDateTime = LocalDateTime.parse(start, formatter);
        LocalDateTime endDateTime = LocalDateTime.parse(end, formatter);

        double duration = Duration.between(startDateTime, endDateTime).toHours();

        double basePayment = duration <= RENTAL_TIME_LIMIT ? hourlyRate * duration : dailyRate;
        double taxRate = basePayment <= PRICE_THRESHOLD ? TAX_RATE_NORMAL : TAX_RATE_REDUCED;
        double tax = basePayment * taxRate;
        double totalPayment = basePayment + tax;

        return new RentalCost(duration, basePayment, tax, totalPayment);
    }

    private static class RentalCost {
        double durationHours;
        double basePayment;
        double tax;
        double totalPayment;

        public RentalCost(double durationHours, double basePayment, double tax, double totalPayment) {
            this.durationHours = durationHours;
            this.basePayment = basePayment;
            this.tax = tax;
            this.totalPayment = totalPayment;
        }
    }
}
