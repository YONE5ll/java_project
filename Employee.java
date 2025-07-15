public class Employee {
   String name;
   int id;
   String timing;
   int salary;

   public Employee(String x,int y,String z,int o){
    name=x;
    id=y;
    timing=z;
    salary=o;
   }

   public void displayEmp(){
    System.out.println("Name:"+name);
    System.out.println("ID:"+id);
    System.out.println("Timing:"+timing);
    System.out.println("Salary:"+salary);
   }
    
}
