class Account
{
     int amount;
     Account()
     {
          amount = 0;
     }
     Account ( int amount)
     {
          this.amount = amount;
     }
     int getAmount()
     {
          return amount;
     }
}
class Saving extends Account
{
    
	Saving()
     {
          super();
          
     }
	Saving(int fix_depo)
     {
          super(fix_depo);
     }
     int getAmount()
     {
          return (super.getAmount());
     }
}
class current extends Account
{
    
	current()
     {
          super();
          
     }
	current(int cash_credit)
     {
          super(cash_credit);
     }
     int getSalary()
     {
          return (super.getAmount());
     }
}
class Bank
{
     public static void main(String[] args)
     {
    	 Saving m1 = new Saving(800000);
    	 System.out.println();
          System.out.println("Total Amount in Saving "+m1.getAmount());
          current l1 = new current(150000);
          System.out.println("Total Amount in Current "+l1.getAmount());
          System.out.println();
          System.out.println("***************");
          int sum=m1.getAmount()+l1.getAmount();
          System.out.println("Total Amount in Bank is : "+sum);
     }
}