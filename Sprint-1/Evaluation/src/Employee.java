import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Employee implements Comparator<Employee> {
    private int empId;
    private String name;
    private int salary;

    public Employee() {

    }

    public Employee(int empId, String name, int salary) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public int compare(Employee o1, Employee o2) {
        if(o1.getSalary() > o2.getSalary()){
            return 1;
        } else if (o1.getSalary() < o2.getSalary()) {
            return -1;
        }else {
            return 0;
        }
    }
}

class  Demo{
    public Map<Employee,String> sortMapUsingEmployeeSalary(Map<Employee,String> originalMap){
        Set<Map.Entry<Employee,String>> set = originalMap.entrySet();

        for(Map.Entry<Employee,String> me:set){
            Employee emp = me.getKey();
            System.out.println("Employee ID : "+emp.getEmpId());
            System.out.println("Employee Name : "+emp.getName());
            System.out.println("Employee Salary : "+emp.getSalary());

            System.out.println("Employee Address : "+me.getValue());
            System.out.println("--------------------------------------------------");
        }
        return originalMap;
    }

    public static void main(String[] args) {
        Map<Employee,String> originalMap = new HashMap<>();
        originalMap.put(new Employee(100,"Dev",30000),"Bangalore");
        originalMap.put(new Employee(101,"Raj",35000),"Mumbai");
        originalMap.put(new Employee(102,"Kumar",28000),"Delhi");
        originalMap.put(new Employee(103,"Gagan",40000),"Pune");
        originalMap.put(new Employee(104,"Manu",15000),"Kochi");

        Demo d1 = new Demo();
        d1.sortMapUsingEmployeeSalary(originalMap);
    }
}
