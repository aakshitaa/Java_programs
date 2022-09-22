public class Largest_Number
{
    int large(int a, int  b, int c)
    {
        if (a>b&& a>c)
        {
            return a;
        }
        else if (b>a && b>c)
        {
            return b;
        }
        else if (c>a && c>b)
        {
            return c;
        }
        else
        {
            System.out.println("all three numbers are equal");
        }
        return 0;
    }
    public static void main (String[] args)
    {
	int ans;
        Largest_Number l=new Largest_Number();
        ans=l.large(10,30,20);
	System.out.println(ans);    
	}
}