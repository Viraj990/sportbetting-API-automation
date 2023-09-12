package userTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.restassured.response.Response;
public class TopleagueTest {
	@Test (priority=1)
	public void gettopleague() {
		Response league=userEndpoint.TopleagueEndpoint.GetTopLeague();
		league.then().log().all();
		Assert.assertEquals(league.getStatusCode(),200);
	}
	@Test (priority=2)
	public void GetTopLeagueDetail() {
		Response league=userEndpoint.TopleagueEndpoint.GetTopLeagueDetail();
		league.then().log().all();
		Assert.assertEquals(league.getStatusCode(),200);
	}
	@Test (priority=3)
	public void MobileGetTopLeague() {
		Response league=userEndpoint.TopleagueEndpoint.MobileGetTopLeague();
		league.then().log().all();
		Assert.assertEquals(league.getStatusCode(),200);
	}
}
