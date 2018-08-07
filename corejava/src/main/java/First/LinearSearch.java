package First;
import java.util.*;
public class LinearSearch {
	public static void main(String[] args) 
	{
		int b=0,n,i,j,ele;
		Scanner s = new Scanner(System.in);
		n=s.nextInt();
	    int a[]=new int[n];
	    for(i=0;i<n;i++)
	    {
	    	a[i]=s.nextInt();
	    }
	    ele=s.nextInt();
	    for(j=0;j<n;j++)
	    {
	    	if(a[j]==ele)
              {
	             System.out.println("element found at index "+j);
	             b++;  
              }
	    }
	    if(b==0)
	    {
	    	System.out.println("element not found");
	    }
	}
}
