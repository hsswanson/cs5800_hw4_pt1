public class CommissionEmployee extends Employee{
    private double rate;
    private int sales;
    public CommissionEmployee(String firstName, String lastName, String SSnumber, double rate, int sales) {
        super(firstName, lastName, SSnumber);
        this.rate = rate;
        this.sales = sales;
    }
    public double getRate(){
        return rate;
    }
    public int getSales(){
        return sales;
    }
    public void setRate(double rate){
        this.rate = rate;
    }
    public void setSales(int sales){
        this.sales = sales;
    }
    @Override public void print(){
        System.out.println(getFirstName() + ", "+ getLastName() +"\t" + getSSnumber()+"\t"+getRate()+"%\t$"+getSales());
    }
}
