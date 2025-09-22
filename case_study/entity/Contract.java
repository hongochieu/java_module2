package case_study.model;

public class Contract {
    private String contractId;
    private String bookingId;
    private double totalPayment;
    private double deposit;

    public Contract() {}

    public Contract(String contractId, String bookingId,
                    double totalPayment, double deposit) {
        this.contractId = contractId;
        this.bookingId = bookingId;
        this.totalPayment = totalPayment;
        this.deposit = deposit;
    }

    public String getContractId() {
        return contractId;
    }

    public void setContractId(String contractId) {
        this.contractId = contractId;
    }

    public String getBookingId() {
        return bookingId;
    }

    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
    }

    public double getTotalPayment() {
        return totalPayment;
    }

    public void setTotalPayment(double totalPayment) {
        this.totalPayment = totalPayment;
    }

    public double getDeposit() {
        return deposit;
    }

    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }
}
