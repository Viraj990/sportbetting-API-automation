package userTest;
import java.io.FileNotFoundException;

import org.testng.Assert;
import org.testng.annotations.Test;
import io.restassured.response.Response;
import userEndpoint.UserEndpoint;

public class UserTest {
	@Test (priority=1)
	public void GetTicketlist() {
		Response user=UserEndpoint.GetTicketlist();
		user.then().log().all();
		Assert.assertEquals(user.getStatusCode(),200);
	}
	@Test (priority=2)
	public void GetTicketlistdetails() {
		Response user=UserEndpoint.GetTicketlistdetails();
		user.then().log().all();
		Assert.assertEquals(user.getStatusCode(),200);
	}
	@Test (priority=3)
	public void gettransactionlist() {
		Response user=UserEndpoint.gettransactionlist();
		user.then().log().all();
		Assert.assertEquals(user.getStatusCode(),200);
	}
	@Test (priority=4)
	public void placedbet() throws FileNotFoundException {
		Response user=UserEndpoint.placedbets();
		user.then().log().all();
		Assert.assertEquals(user.getStatusCode(),200);
	}
	@Test (priority=5)
	public void logintokencheck()  {
		Response user=UserEndpoint.logintoken();
		user.then().log().all();
		Assert.assertEquals(user.getStatusCode(),200);
	}
	@Test (priority=6)
	public void getuserprofile()  {
		Response user=UserEndpoint.profiledetails();
		user.then().log().all();
		Assert.assertEquals(user.getStatusCode(),200);
	}
	@Test (priority=7)
	public void Getupdateprofile() throws FileNotFoundException {
		Response user=UserEndpoint.updateprofile();
		user.then().log().all();
		Assert.assertEquals(user.getStatusCode(),200);
	}
}
