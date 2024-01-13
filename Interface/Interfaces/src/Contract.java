import java.time.LocalDate;

public class Contract {
    private int contractNumber;
    private LocalDate contractDate;
    private double contractValue;
    private int numberOfInstallments;

    public Contract(int contractNumber, LocalDate contractDate, double contractValue, int numberOfInstallments) {
        this.contractNumber = contractNumber;
        this.contractDate = contractDate;
        this.contractValue = contractValue;
        this.numberOfInstallments = numberOfInstallments;
    }

    public int getContractNumber() {
        return contractNumber;
    }

    public void setContractNumber(int contractNumber) {
        this.contractNumber = contractNumber;
    }

    public LocalDate getContractDate() {
        return contractDate;
    }

    public void setContractDate(LocalDate contractDate) {
        this.contractDate = contractDate;
    }

    public double getContractValue() {
        return contractValue;
    }

    public void setContractValue(double contractValue) {
        this.contractValue = contractValue;
    }

    public int getNumberOfInstallments() {
        return numberOfInstallments;
    }

    public void setNumberOfInstallments(int numberOfInstallments) {
        this.numberOfInstallments = numberOfInstallments;
    }

}
