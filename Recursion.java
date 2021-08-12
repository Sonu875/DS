
public class Recursion {
	public int power(int n,int m)
	{
		if(m==0)
		{
			return 1;
		}
		else
		{
			return n*power(n, m-1);
		}
	}
	public int gcd(int a,int b)
	{
		if(b==0)
		{
			return a;
		}
		else
		{
			return gcd(a, a%b);
		}
	}
	public int fact(int n)
	{
		if(n==0)
		{
			return 1;
		}
		return n*fact(n-1);
	}
	public int fibbonac(int a)
	{
		if(a==0||a==1)
		{
			return 0;
		}
		return fibbonac(a-1)+fibbonac(a-2);
	}
	public void numbers(int n)
	{
		if(n<9)
		{
			switch (n) {
			case 0:
				System.out.print("zero ");
				break;
			case 1:
				System.out.print("one ");
				break;
			case 2:
				System.out.print("two ");
				break;
			case 3:
				System.out.print("three ");
				break;
			case 4:
				System.out.print("four ");
				break;
			case 5:
				System.out.print("five ");
				break;
			case 6:
				System.out.print("six ");
				break;
			case 7:
				System.out.print("seven ");
				break;
			case 8:
				System.out.print("eight ");
				break;
			case 9:
				System.out.print("nine ");
				break;
			default:
				break;
			}
			return;
		}
		numbers(n/10);
		switch (n%10) {
		case 0:
			System.out.print("zero ");
			break;
		case 1:
			System.out.print("one ");
			break;
		case 2:
			System.out.print("two ");
			break;
		case 3:
			System.out.print("three ");
			break;
		case 4:
			System.out.print("four ");
			break;
		case 5:
			System.out.print("five ");
			break;
		case 6:
			System.out.print("six ");
			break;
		case 7:
			System.out.print("seven ");
			break;
		case 8:
			System.out.print("eight ");
			break;
		case 9:
			System.out.print("nine ");
			break;
		default:
			break;
		}
	
		
	}
}

