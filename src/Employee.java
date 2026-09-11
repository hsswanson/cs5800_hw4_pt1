public class Employee {
    private String firstName, lastName, SSnumber;

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public void setSSnumber(String SSnumber){
        this.SSnumber = SSnumber;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public String getSSnumber(){
        return SSnumber;
    }
    public Employee(String firstName, String lastName, String SSnumber){
        this.firstName = firstName;
        this.lastName = lastName;
        this.SSnumber = SSnumber;
    }
    public void print(){
        System.out.println(getFirstName() + ", "+ getLastName() +"\t" + getSSnumber());
    }
}
