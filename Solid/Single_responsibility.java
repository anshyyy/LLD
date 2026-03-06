// a class should have only one reason to change

public class Single_Responsibility{}



class Employee {
    public int id;
    public String name;

    Employee(int id,String name){
        this.id = id;
        this.name = name;
    }
}

// this class contains various functions but the responsibility of the repository is single
class EmployeeRepository {
     public void create(){};
     
     public Employee getEmployee(int id){
        return new Employee(id, "a");
     }

     public void delete(int id){}

     public void update(int id, Employee emp){}


     // this is not allowed 
     public double calculateBonus(){
        return 0;
     }
}