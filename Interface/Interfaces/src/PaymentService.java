import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class PaymentService {
    private static final double MONTHLT_INTEREST_RATE = 0.01;
    private static final double PAYMENT_FEE_RATE = 0.02;

    public List<Installment> calculateInstalments(Contract contract) {
        List<Installment> installments = new ArrayList<>();
        double basicQuota = contract.getContractValue() / contract.getNumberOfInstallments();
        for (int i = 1; i <= contract.getNumberOfInstallments(); i++) {
            double updatedQuota = basicQuota + MONTHLT_INTEREST_RATE * i;
            double fullQuota = updatedQuota + PAYMENT_FEE_RATE * updatedQuota;
            installments.add(new Installment(contract.getContractDate().plusMonths(i), fullQuota));
            LocalDate dueDate = contract.getContractDate().plusMonths(i);
            installments.add(new Installment(dueDate, fullQuota));
        }
        return installments;
    }
}
