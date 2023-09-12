package userTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.restassured.response.Response;
public class PrematchTest {
	@Test (priority=1)
	public void getprematchlist() {
		Response prematch=userEndpoint.PrematchEndpoint.getprematchlist();
		prematch.then().log().all();
		Assert.assertEquals(prematch.getStatusCode(),200);
	}

	@Test (priority=2)
	public void getprematchdetails() {
		Response prematch=userEndpoint.PrematchEndpoint.getprematchdetails();
		prematch.then().log().all();
		Assert.assertEquals(prematch.getStatusCode(),200);
	}
	@Test (priority=3)
	public void getlastminute() {
		Response prematch=userEndpoint.PrematchEndpoint.getlastminute();
		prematch.then().log().all();
		Assert.assertEquals(prematch.getStatusCode(),200);
	}
	@Test (priority=4)
	public void prematchcalendar() {
		Response prematch=userEndpoint.PrematchEndpoint.prematchcalendar();
		prematch.then().log().all();
		Assert.assertEquals(prematch.getStatusCode(),200);
	}
}
