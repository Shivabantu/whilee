package corejavaa;

public class whileloops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	int i=0;
		while(i<10)
		{
			System.out.println(i);
			i++;
		}
		
		
		int j=30;
		do
		{
			System.out.println(j);
			j++;
		}while(j<40);
		
		int s=30;
		do
		{
			System.out.println(s);
			s--;
		}while(s>20); */
		
		
		int k=1;
		for(int i=0;i<=4;i++) {
			//System.out.println("outer");
			for(int j=1;j<=4-i;j++)
			{
				System.out.print(k*3);
				System.out.print("\t");
				k++;				
			}
			System.out.println("hi");
		}
		
	
	}

}
