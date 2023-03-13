package main.assignments.assignment2;

public class Commission extends Hourly {
    private double commissionRate;
    private double totalSales;
    public Commission(String eName, String eAddress, String ePhone, String socSecNumber, double rate, double commissionRate) {
        super(eName, eAddress, ePhone, socSecNumber, rate);
        this.commissionRate = commissionRate;
        this.totalSales = 0;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }

    public double getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(double totalSales) {
        this.totalSales = totalSales;
    }

    public void addSales (double newSales) {
        this.totalSales += newSales;
    }

    @Override
    public double pay() {
        double payment = super.pay() + (this.totalSales * this.commissionRate);
        this.totalSales = 0;
        return payment;
    }

    @Override
    public String toString()
    {
        String result = super.toString();

        result += "\nTotal Sales: " + this.totalSales;

        return result;
    }
}
