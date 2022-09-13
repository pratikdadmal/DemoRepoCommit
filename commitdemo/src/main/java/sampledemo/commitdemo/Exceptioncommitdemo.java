package sampledemo.commitdemo;

public class Exceptioncommitdemo {
	
	public static void checkException(int age) throws Exception
	{
			if(age<18)
			{
				throw new ArithmeticException("User is not valid to vote");
			}
			else
			{
				System.out.println("user valid for vote");
			}
			
	}

	public static void main(String[] args) throws Exception {
		
		checkException(9);
		System.out.println("This is first commited project");
	}

}
