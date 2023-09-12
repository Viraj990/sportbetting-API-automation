package userTest;
import org.testng.Assert;
import org.testng.annotations.Test;


import io.restassured.response.Response;
import userEndpoint.SportbookEndpoint;
public class SportbookTest {
	@Test (priority=1)
	public void getsportbooklist() {
		Response sportbook=SportbookEndpoint.getsportbooks();
				sportbook.then().log().all();
		Assert.assertEquals(sportbook.getStatusCode(),200);
	}
	@Test (priority=2)
	public void sportbooklist() {
		Response sportbook=SportbookEndpoint.sportbooklists();
				sportbook.then().log().all();
		Assert.assertEquals(sportbook.getStatusCode(),200);
	}
	@Test (priority=3)
	public void getmobilesportbooks() {
		Response sportbook=SportbookEndpoint.getmobilesportbook();
				sportbook.then().log().all();
		Assert.assertEquals(sportbook.getStatusCode(),200);
	}
	@Test (priority=4)
	public void getmobilesportbooklists() {
		Response sportbook=SportbookEndpoint.getmobilesportbooklist();
				sportbook.then().log().all();
		Assert.assertEquals(sportbook.getStatusCode(),200);
	}
}
