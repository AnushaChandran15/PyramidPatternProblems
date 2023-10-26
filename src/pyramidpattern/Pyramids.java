package pyramidpattern;

import java.util.Scanner;

public class Pyramids {
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a N");
		int n=scan.nextInt();
		pyramid1(n);
		pyramid2(n);
		pyramid3(n);
		pyramid4(n);
		pyramid5(n);
		pyramid6(n);
		pyramid7(n);
	}
// pyramid Pattern 1
	static void pyramid1(int n)
	{
	System.out.println("Pyramid 1");
	System.out.println();
	
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n-i;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
//pyramid pattern 2
	static void pyramid2(int n)
	{
		System.out.println();
		System.out.println("Pyramid 2");
		System.out.println();
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i-1;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=n-i+1;k++)
			{
				System.out.print((n-i+1)+" ");
			}
			System.out.println();
		}
	}
	//pyramid pattern 3
		static void pyramid3(int n)
		{
			System.out.println();
			System.out.println("Pyramid 3");
			System.out.println();
			
			for(int i=1;i<=n;i++)
			{
				for(int j=1;j<=i-1;j++)
				{
					System.out.print(" ");
				}
				for(int k=1;k<=n-i+1;k++)
				{
					System.out.print("* ");
				}
				System.out.println();
			}
		}
		// pyramid Pattern 4
				static void pyramid4(int n)
				{
					System.out.println();
					System.out.println("Pyramid 4");
					System.out.println();
					
					for(int i=1;i<=n;i++)
					{
						for(int j=1;j<=n;j++)
						{
							if(j<=n-i)
								System.out.print(" ");
							else
								System.out.print(j);
						}
						for(int k=n-1;k>=n-i+1&&i>=2;k--)
						{
							System.out.print(k);
						}
						System.out.println();
					}
				}
				// pyramid Pattern 5
				static void pyramid5(int n)
				{
					int l=1;
					System.out.println();
					System.out.println("Pyramid 5");
					System.out.println();
					
					for(int i=1;i<=n;i++)
					{
						l=1;
						for(int j=1;j<=n;j++)
						{
							if(j<=n-i)
								System.out.print(" ");
							else
								System.out.print(l++);
						}
						for(int k=i-1;k>=1&&i>=2;k--)
						{
							System.out.print(k);
						}
						System.out.println();
					}
				}
	
	
		// pyramid Pattern 6
		static void pyramid6(int n)
		{
			System.out.println();
			System.out.println("Pyramid 6");
			System.out.println();
			
			for(int i=1;i<=n;i++)
			{
				for(int j=1;j<=n-i;j++)
				{
					System.out.print(" ");
				}
				for(int k=1;k<=i;k++)
				{
					System.out.print("* ");
				}
				System.out.println();
			}
		}
		// pyramid Pattern 7
				static void pyramid7(int n)
				{
					System.out.println();
					System.out.println("Pyramid 7");
					System.out.println();
					
					for(int i=1;i<=n;i++)
					{
						for(int j=1;j<=n-i;j++)
						{
							System.out.print(" ");
						}
						for(int k=1;k<=i;k++)
						{
							System.out.print(k+" ");
						}
						System.out.println();
					}
				}

}
