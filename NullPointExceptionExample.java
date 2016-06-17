public class NullPointExceptionExample {
    public static void main(String[] args) {
	try
	{
        String s=null;
        System.out.println(s.toString()); // s is un-initialized and is null
	}
	catch (NullPointerException e)
	{
		System.out.println("You have tried to use the value of an uninitilized object");
	}
	finally
	{
        	System.out.println("We have handled the exception if we are trying to access values of an uninitilized object");
	}       
		
    }
}