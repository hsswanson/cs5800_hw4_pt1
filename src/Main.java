//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    IO.println(String.format("HW4 pt 1 driver program"));
    Employee[] employees = new Employee[7];
    employees[0] = new SalariedEmployee("Jone", "Jones", "111-11-1111", 2500);
    employees[1] = new HourlyEmployee("Stephanie", "Smith","222-22-2222",25,32);
    employees[2] = new HourlyEmployee("Mary","Quinn","333-33-3333", 19, 47);
    employees[3] = new CommissionEmployee("Nicole","Dior","444-44-4444", .15, 50000);
    employees[4] = new SalariedEmployee("Renwa","Chanel", "555-55-5555",1700);
    employees[5] = new BaseEmployee("Mike","Davenport", "666-66-6666",95000);
    employees[6] = new CommissionEmployee("Manhaz","Vaziri","777-77-7777", .22, 40000);
    for (Employee employee : employees) {
        employee.print();
    }
}
