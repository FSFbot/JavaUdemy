import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Contract contract = new Contract(8028, LocalDate.of(2024, 2, 13), 600.0, 3);

        PaymentService paymentService = new PaymentService();
        List<Installment> installments = paymentService.calculateInstalments(contract);
        System.out.println("Detalhes do contrato:");
        System.out.println("Número do contrato: " + contract.getContractNumber());
        System.out.println("Data do contrato: " + contract.getContractDate());
        System.out.println("Valor do contrato: R$ " + contract.getContractValue());
        System.out.println("Número de parcelas: " + contract.getNumberOfInstallments());
        System.out.println("\nParcelas:");

        for (Installment installment : installments) {
            System.out.println("Parcela #" + installment.getAmount() + ":");
            System.out.println("Vencimento: " + installment.getDueDate());
            System.out.println("Valor: R$ " + String.format("%.2f", installment.getAmount()));
            System.out.println();
        }
    }
}
