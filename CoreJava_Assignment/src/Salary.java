class Employee
{
     int salary;
     Employee()
     {
          salary = 0;
     }
     Employee ( int salary)
     {
          this.salary = salary;
     }
     int getSalary()
     {
          return salary;
     }
}
class Manager extends Employee
{
    
     Manager()
     {
          super();
          
     }
     Manager(int sal)
     {
          super(sal);
     }
     int getSalary()
     {
          return (super.getSalary());
     }
}
class Labour extends Employee
{
    
	Labour()
     {
          super();
          
     }
	Labour(int sal)
     {
          super(sal);
     }
     int getSalary()
     {
          return (super.getSalary());
     }
}
class Salary
{
     public static void main(String[] args)
     {
          Manager m1 = new Manager(100000);
          System.out.println("Salary of Manager= "+m1.getSalary());
          Labour l1 = new Labour(50000);
          System.out.println("Salary of Labour= "+l1.getSalary());
          System.out.println();
          int sum=m1.getSalary()+l1.getSalary();
          System.out.println("Total Salary Of Employee is : "+sum);
     }
}