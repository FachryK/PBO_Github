public class Commision extends Hourly 
{
    private double totalSales;
    private double commisionRate; 
    public Commision(String eName, String eAddress, String ePhone, String socSecNumber, double rate, double commisionRate) {
        super(eName, eAddress, ePhone, socSecNumber, rate);
        this.commisionRate = commisionRate;
    }

    public void addSales(double totalSales)
    {
        this.totalSales = totalSales;
    }

    @Override
    public double pay() {
        double payment = super.pay() + (totalSales * commisionRate);
        totalSales = 0;
        return payment;
    }

    @Override
    public String toString()
   {
      String result = super.toString();
      result += "\nTotal Sales : " + pay();

      return result;
   }

    
}
