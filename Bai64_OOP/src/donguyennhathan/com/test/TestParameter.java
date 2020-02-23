package donguyennhathan.com.test;

public class TestParameter {

	public static int sum(int ... arr)
	{
		int s=0;
		for(int i=0; i<arr.length;i++)
		{
			s+=arr[i];
		}
		return s;
	}
	
	public static void main(String[] args) {
		int s1= sum(1,2,3,4,5);
		System.out.println(s1);
		int s2= sum();
		System.out.println(s2);
		int s3= sum(4,5);
		System.out.println(s3);
	}

}
