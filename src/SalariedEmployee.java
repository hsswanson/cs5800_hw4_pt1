public class SalariedEmployee extends Employee{
    private int weeklySalarly;
    public SalariedEmployee(String firstName, String lastName, String SSnumber, int weeklySalary) {
        super(firstName, lastName, SSnumber);
        this.weeklySalarly = weeklySalary;
    }
    public void setWeeklySalarly(int weeklySalarly){
        this.weeklySalarly = weeklySalarly;
    }
    public int getWeeklySalarly(){
        return weeklySalarly;
    }
    @Override public void print(){
        System.out.println(getFirstName() + ", "+ getLastName() +"\t" + getSSnumber() + "\t$"+getWeeklySalarly());
    }
}
