public class Employee {
    String empId;
    String empName;
    double salary;//
    Address address;

    public static void main(String[] args) {
        Employee emp1 = new Employee();
        System.out.println(emp1); //Employeeobjecthashcodei.eEmployee@323232
        System.out.println(emp1.empId);//null
        System.out.println(emp1.empName); // null
        System.out.println(emp1.salary);//0.0S
        System.out.println(emp1.address); // null
        Employee emp2 = new Employee();
        emp2.empId = "Emp-01";
        emp2.empName = "Ram";
        emp2.salary = 60000.00;
        emp2.address = new Address();
        emp2.address.city = "Coimbator";
        emp2.address.state = "Tamilnadu";
        emp2.address.pincode = "434322";

        System.out.println(emp2.empId); //Emp-01
        System.out.println(emp2.empName); // Ram
        System.out.println(emp2.salary);//60000.00
        System.out.println(emp2.address); //Addressobjecthashcodei.eAddress@232423
        System.out.println(emp2.address.city); //Coimbator
        System.out.println(emp2.address.state);//Tamilnadu
        System.out.println(emp2.address.pincode); //434322
    }
}
