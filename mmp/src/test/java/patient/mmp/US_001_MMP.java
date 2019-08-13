package patient.mmp;

import org.junit.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class US_001_MMP extends TestBaseClass{
	
	@Parameters({"username","password"})
	@Test
	public void m1(String username,String password)
	{
		HomePage h1 = new HomePage(driver);
		 
		String actual = h1.login(username,password);
		String expected = username;
		Assert.assertFalse(actual.contains(expected));
	}

}
