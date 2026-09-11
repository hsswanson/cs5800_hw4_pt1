public class HourlyEmployee extends  Employee{
    private int wage, hours;
    public HourlyEmployee(String firstName, String lastName, String SSnumber, int wage, int hours) {
        super(firstName, lastName, SSnumber);
        this.wage = wage;
        this.hours = hours;
    }
    public void setWage(int wage){
        this.wage = wage;
    }
    public void setHours(int hours){
        this.hours = hours;
    }
    public int getWage(){
        return wage;
    }
    public int getHours(){
        return wage;
    }
    @Override public void print(){
        System.out.println(getFirstName() + ", "+ getLastName() +"\t" + getSSnumber()+"\t$"+getWage()+ "\t"+getHours());
    }
}
