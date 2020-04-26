package Com.ESIC;

public class testdemoclass {
	
	public testdemoclass()
	{
		
	}
	
	protected void pubclass() throws InterruptedException
	
	
	{
		System.out.println("I am base static class");
		try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
