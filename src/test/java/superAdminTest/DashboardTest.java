package superAdminTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.restassured.response.Response;
public class DashboardTest {
	@Test (priority=1)
	public void getdashboarddatas() {
		
		Response response=superAdminEndpoint.DashboardEndpoint.dashboarddata();
		response.then().log().all();
		Assert.assertEquals(response.getStatusCode(),200);
		
}
	@Test (priority=2)
	public void getweekbetstats() {
		
		Response response=superAdminEndpoint.DashboardEndpoint.betweekstats();
		response.then().log().all();
		Assert.assertEquals(response.getStatusCode(),200);
		
}
	@Test (priority=3)
	public void getbetmonthstats() {
		
		Response response=superAdminEndpoint.DashboardEndpoint.betmonthstats();
		response.then().log().all();
		Assert.assertEquals(response.getStatusCode(),200);
		
}
	@Test (priority=4)
	public void gettopweek() {
		
		Response response=superAdminEndpoint.DashboardEndpoint.topweekshop();
		response.then().log().all();
		Assert.assertEquals(response.getStatusCode(),200);
		
}
	@Test (priority=5)
	public void gettopmonthstats() {
		
		Response response=superAdminEndpoint.DashboardEndpoint.topmonthshop();
		response.then().log().all();
		Assert.assertEquals(response.getStatusCode(),200);
		
}
}
