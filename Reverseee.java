import java.io.*;
import java.util.*;

class Reverseee{
	public static void main (String[] args) {
	    int i;
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	String str[]=new String[n];
	for(i=0;i<n;i++)
	{
	    str[i]=s.next();
	
	}
for(i=n-1;i>=0;i--)
{
	    System.out.print(str[i]+" ");
	}
	
	}
}
