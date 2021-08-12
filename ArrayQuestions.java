
public class ArrayQuestions {
	public long maxProduct(int a[],int n)
	{
		long max=a[0],min=a[0],max_value=a[0];
		for(int i=1;i<n;i++)
		{
			if(a[i]<0)
			{
				long temp=min;
				min=max;
				max=temp;
			}
			max=Math.max(a[i], max*a[i]);
			min=Math.min(a[i], min*a[i]);
			max_value=Math.max(max, max_value);
		}
		return max_value;
	}
	 public int[][] merge(int[][] intervals) {
	        int j=0;
	        for(int i=0;i<intervals.length-1;i++)
	        {
	            if(intervals[i][1]>=intervals[i+1][0])
	            {
	                intervals[j][0]=intervals[i][0];
	                intervals[j][1]=intervals[i+1][1];
	            }
	            j++;
	        }
	        return intervals;
	    }
	public int[] sortArrayWithZeroOne(int[] arr,int n )
	{
		int count0=0,count1=0,count2=0;
		for(int i=0;i<n;i++)
		{
			if(arr[i]==0)
			{
				count0++;
			}
			else if(arr[i]==1)
			{
				count1++;
			}
			else
			{
				count2++;
			}
		}
		int i=0;
		while(count0>0)
		{
			arr[i]=0;
			i++;
			count0--;
		}
		while(count1>0)
		{
			arr[i]=1;
			i++;
			count1--;
		}
		while(count2>0)
		{
			arr[i]=2;
			i++;
			count2--;
		}
		
			
		
		
		return arr;
	}
	 public static int kthSmallest(int[] arr, int l, int r, int k) 
	    { 
		 int temp =0;
	     for(int i=0;i<l;i++)
	     {
	         for(int j=0;j<l;j++)
	         {
	             if(arr[i]<arr[j])
	             {
	                 temp = arr[j];
	                 arr[j]=arr[i];
	                 arr[i]=temp;
	             }
	         }
	     }
	     return arr[k-1];
	    } 
	 public int[] oneSideNegative(int[] arr,int n)
	 {
		 int low=0,hi=n-1;
		 int a[]=new int[n];
		 for(int i=0;i<n;i++)
		 {
			 if(arr[i]<0)
			 {
				 a[low++]=arr[i];
			 }
			 else
			 {
				 a[hi--]=arr[i];
			 }
		 }
		 return a;
		 
	 }
	 public void printArray(int arr[],int n)
	 {
		 for(int value:arr)
		 {
			 System.out.print(value+" ");
		 }
	 }
	 int maxSubarraySum(int arr[], int n){
	        
	        int max=-1000000;
	        for(int i=0;i<n;i++)
	        {
	            int sum=0;
	            for(int k=0;k<=i;k++)
	            {
	                sum=arr[k]+sum;
	            }
	            if(sum>max){
	                max=sum;
	                System.out.println(max);
	            }
	        
	        }
	        return max;
	        
	    }
	 public static int doUnion(int a[], int n, int b[], int m) 
	    {
	        int z=a[n-1],x=b[m-1],ans=0,count=0;
	        if(z>x)
	        {
	            ans=z;
	        }
	        else
	        {
	            ans=x;
	        }
	        
	        int a1[]=new int[100*ans];
	        ++a1[a[0]];
	        for(int i=1;i<n;i++)
	        {
	            if(a[i]!=a[i-1])
	            {
	                ++a1[a[i]];
	            }
	            
	        }
	        ++a1[b[0]];
	        for(int i=1;i<m;i++)
	        {
	            if(b[i]!=b[i-1])
	            {
	                ++a1[b[i]];
	            }
	        }
	        for(int i=0;i<100*ans;i++)
	        {
	            
	            if(a1[i]>0)
	            {
	                
	                count++;
	            }
	        }
	     
	        return count;
	    }
	 static int minJumps(int[] arr){
	       
         if (arr.length <= 1)
           return 0;

       // Return -1 if not possible to jump
       if (arr[0] == 0)
           return -1;

       // initialization
       int maxReach = arr[0];
       int step = arr[0];
       int jump = 1;

       // Start traversing array
       for (int i = 1; i < arr.length; i++) {
           // Check if we have reached 
//the end of the array
           if (i == arr.length - 1)
               return jump;

           // updating maxReach
           maxReach = Math.max(maxReach, i + arr[i]);

           // we use a step to get to the current index
           step--;

           // If no further steps left
           if (step == 0) {
               // we must have used a jump
               jump++;

               // Check if the current 
//index/position or lesser index
               // is the maximum reach point 
//from the previous indexes
               if (i >= maxReach)
                   return -1;

               // re-initialize the steps to the amount
               // of steps to reach maxReach from position i.
               step = maxReach - i;
           }
       }

       return -1;
   }
}
