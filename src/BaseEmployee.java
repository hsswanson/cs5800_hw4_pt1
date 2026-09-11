public class BaseEmployee extends Employee{
    private int baseSalarly;
    public BaseEmployee(String firstName, String lastName, String SSnumber,int baseSalarly) {
        super(firstName, lastName, SSnumber);
        this.baseSalarly = baseSalarly;
    }
    public int getBaseSalarly(){
        return baseSalarly;
    }
    public void setBaseSalarly(int baseSalarly){
        this.baseSalarly = baseSalarly;
    }
    @Override public void print(){
        System.out.println(getFirstName() + ", "+ getLastName() +"\t" + getSSnumber()+ "\t$" +getBaseSalarly());
    }
}
