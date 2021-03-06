import java.util.Scanner;
abstract class DessertItem {
public String name;

public DessertItem()
{
name = "";
}

public DessertItem(String name1)
{
name = name1;
}

public String getName()
{
return name;
}

public void setName(String name1)
{
name = name1;
}

public abstract double getCost();
}
//Candy Class Start
class Candy extends DessertItem {
private double weight;
private double pricePerPound;


public Candy()
{
super();
weight = 0;
pricePerPound = 0;
}

public Candy(String name, double w, double prc)
{
super(name);
weight = w;
pricePerPound = prc;
}


public double getWeight() {
return weight;
}

public void setWeight(double weight) {
this.weight = weight;
}

public double getPricePerPound() {
return pricePerPound;
}

public void setPricePerPound(double pricePerPound) {
this.pricePerPound = pricePerPound;
}

@Override
public double getCost() {
double total = weight * pricePerPound;
total = Math.round(total * 100);
return total;
}


public String toString()
{
String s = String.format( "%-50s $%.2f\n\t %.2f lbs @ $.2f",getName(), getCost()/100, weight, pricePerPound);
System.out.println("You need to pay."+getCost()/100);
return s;
}
}
//Class Cookies
class Cookie extends DessertItem {
private int quantity;
private double pricePerDozen;


public Cookie()
{
super();
quantity = 0;
pricePerDozen = 0;
}

public Cookie(String name, int qty, double prc)
{
super(name);
quantity = qty;
pricePerDozen = prc;
}


public int getQuantity() {
return quantity;
}


public double getPricePerDozen() {
return pricePerDozen;
}

public void setPricePerDozen(double pricePerDozen) {
this.pricePerDozen = pricePerDozen;
}

public void setQuantity(int quantity) {
this.quantity = quantity;
}

@Override
public double getCost() {
double total = pricePerDozen / 12 * quantity;
total = Math.round(total * 100);
return total;
}


public String toString()
{
String s = String.format("%-50s $%.2f\n\t %d cookies @ $%.2f per Dozen", getName(), getCost()/100, quantity, pricePerDozen);
System.out.println("You need to pay."+getCost()/100);
return s;
}
}
//class Icecream
class IceCream extends DessertItem{
private int numberOfScoops;
private double pricePerScoop;
private double toppingPrice;

public IceCream() {
super();
numberOfScoops = 0;
pricePerScoop = 0;
toppingPrice = 0;

}

public IceCream(String name, int scoops, double prcPerScoop, double toppings)
{
super(name);
numberOfScoops = scoops;
pricePerScoop = prcPerScoop;
toppingPrice = toppings;
}


public int getNumberOfScoops() {
return numberOfScoops;
}

public void setNumberOfScoops(int numberOfScoops) {
this.numberOfScoops = numberOfScoops;
}

public double getPricePerScoop() {
return pricePerScoop;
}

public void setPricePerScoop(double pricePerScoop) {
this.pricePerScoop = pricePerScoop;
}

public double getToppingPrice() {
return toppingPrice;
}

public void setToppingPrice(double toppingPrice) {
this.toppingPrice = toppingPrice;
}

@Override
public double getCost() {
double total = (numberOfScoops * pricePerScoop + toppingPrice);
return Math.round(100 * total );
}

public String toString()
{
String s = String.format("%-50s $%.2f\n\t %d scoops @ $%.2f/scoop + $%.2f", getName(), getCost()/100, numberOfScoops, pricePerScoop, toppingPrice);
System.out.println("You need to pay."+getCost()/100);
return s;
}
}
//Main Class
public class DesertMain {
	public static void main(String[] args) {
		System.out.println("Select the following role :");
		System.out.println("1. Customer ");
		System.out.println("2. Shopkeeper ");
		System.out.println("Select 1 or 2 ");
		System.out.println();
		Scanner scan=new Scanner(System.in);
		int no=scan.nextInt();
		switch (no) {
		  case 1:
		    System.out.println("Welcome!");
		    System.out.println("Tell us What do you like to buy,");
		    System.out.println("***Enter the Desert Code***");
		    System.out.println("1. Candy  2. Cookies  3. Icecream");
		    int choice=scan.nextInt();
		    if(choice==1)
		    {
		    	System.out.println("Enter the Number of Pieces you want.");
		    	int cno=scan.nextInt();
		    	Candy item1 = new Candy("Candy", cno, 10);
		    	System.out.println(item1);
		    }
		    else if(choice==2)
		    {
		    	System.out.println("Enter the Number of Pieces you want.");
		    	int cono=scan.nextInt();
		    	Cookie item2 = new Cookie("Cookies", cono, 40);
		    	System.out.println(item2);
		    }
		    else if(choice==3)
		    {
		    	System.out.println("Enter the Number of Pieces you want.");
		    	int ino=scan.nextInt();
		    	IceCream item3 = new IceCream("IceCream", ino, 1, 50);
		    	System.out.println(item3);
		    }
		    break;
		  case 2:
		    System.out.println("Welcome !");
		    String str;
		    System.out.println("What you like to add :");
		    str=scan.nextLine();
		    //System.out.println(str+" is successfully added. ");
		    
		    break;
		  default:
		    System.out.println("Enter proper Choise");
		    break;
		}

	}
}
