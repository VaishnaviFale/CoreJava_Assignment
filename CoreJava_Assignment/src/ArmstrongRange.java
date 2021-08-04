class ArmstrongRange
{
	public static void main(String[] arg)
	{
	int i=101,a,c,n;
	System.out.println("Armstrong numbers between 100 to 999 are");
	while(i<999)
	{
	n=i;
	c=0;
	while(n>0)
	{
		a=n%10;
		c=c+(a*a*a);
		n=n/10;
	}
	if(c==i)
		System.out.println(i);
	i++;
	}
	}
}