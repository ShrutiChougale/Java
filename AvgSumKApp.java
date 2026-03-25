import java.util.*;
public class AvgSumKApp
{
   public static void main(String x[])
   {
      int sum=0,k=5;
	  int MAX=-1;
	  int arr[]=new int[]{2,1,5,1,3,2,8,1};
	  for(int i=0; i<k; i++)
	  {
	      sum= sum + arr[i];
	  }
	  if(sum>MAX)
	  { MAX=sum;//2
	  }
	   for(int i=k; i<arr.length; i++)
	  {
	     sum = sum+arr[i]-arr[i-k];
		 if(sum>MAX)
		 { MAX=sum;
		 }
	  }
	  System.out.println("MAX sum "+MAX);
   }
}
