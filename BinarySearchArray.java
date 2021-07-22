
public class BinarySearchArray 
{
	public static void main(String[] args) 
	{
		int a[]= {50,80,60,40,20,10,30,70} ,mid,n=80,f=0, low=0,high=(a.length-1),temp;
		System.out.print("Array elements are  ");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i] + " ");
		}
		System.out.println(" ");
		for(int i=0;i<(a.length-1);i++)
		{
			for(int j=(i+1);j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.print("Sorted Array elements are  ");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i] + " ");
		}
		while(low<=high)
		{
			mid=(low+high)/2;
			if(a[mid]==n)
			{
				f=1;
				break;
			}
			else if(a[mid]<n)
			{
				low=mid+1;
			}
			else
			{
				high=mid-1;
			}
		}
		System.out.println(" ");
		if(f==1)
		{
			System.out.println(n+" is avaiable in array");
		}
		else
		{
			System.out.println(n+" is not avaiable in array");
		}
	}
}
