package iGuru.Sportsbook.BIP.SuperAdminTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
public class DashboardTest {
	@Test (priority=1)
	public void getdashboarddatas() {
		
		Response response=iGuru.Sportsbook.BIP.SuperAdminEndpoint.DashboardEndpoint.dashboarddata();
		response.then().log().all();
		response.then().extract().response();
		String responseBody = response.getBody().asString();
		JsonPath jsonPath = new JsonPath(responseBody);
		String message = jsonPath.getString("success");
		String expectedMessage = "true";
		Assert.assertEquals(expectedMessage, message);
		Assert.assertEquals(response.getStatusCode(),200);
		Assert.assertEquals(response.statusLine(),"HTTP/1.1 200 OK");
		Assert.assertEquals(response.contentType(), "application/json; charset=utf-8" );
		
}
	@Test (priority=2)
	public void getweekbetstats() {
		
		Response response=iGuru.Sportsbook.BIP.SuperAdminEndpoint.DashboardEndpoint.betweekstats();
		response.then().log().all();
		response.then().extract().response();
		String responseBody = response.getBody().asString();
		JsonPath jsonPath = new JsonPath(responseBody);
		String message = jsonPath.getString("success");
		String expectedMessage = "true";
		Assert.assertEquals(expectedMessage, message);
		Assert.assertEquals(response.getStatusCode(),200);
		Assert.assertEquals(response.statusLine(),"HTTP/1.1 200 OK");
		Assert.assertEquals(response.contentType(), "application/json; charset=utf-8" );
		
}
	@Test (priority=3)
	public void getbetmonthstats() {
		
		Response response=iGuru.Sportsbook.BIP.SuperAdminEndpoint.DashboardEndpoint.betmonthstats();
		response.then().log().all();
		response.then().extract().response();
		String responseBody = response.getBody().asString();
		JsonPath jsonPath = new JsonPath(responseBody);
		String message = jsonPath.getString("success");
		String expectedMessage = "true";
		Assert.assertEquals(expectedMessage, message);
		Assert.assertEquals(response.getStatusCode(),200);
		Assert.assertEquals(response.statusLine(),"HTTP/1.1 200 OK");
		Assert.assertEquals(response.contentType(), "application/json; charset=utf-8" );
		
}
	@Test (priority=4)
	public void gettopweek() {
		
		Response response=iGuru.Sportsbook.BIP.SuperAdminEndpoint.DashboardEndpoint.topweekshop();
		response.then().log().all();
		response.then().extract().response();
		String responseBody = response.getBody().asString();
		JsonPath jsonPath = new JsonPath(responseBody);
		String message = jsonPath.getString("success");
		String expectedMessage = "true";
		Assert.assertEquals(expectedMessage, message);
		Assert.assertEquals(response.getStatusCode(),200);
		Assert.assertEquals(response.statusLine(),"HTTP/1.1 200 OK");
		Assert.assertEquals(response.contentType(), "application/json; charset=utf-8" );
		
}
	@Test (priority=5)
	public void gettopmonthstats() {
		
		Response response=iGuru.Sportsbook.BIP.SuperAdminEndpoint.DashboardEndpoint.topmonthshop();
		response.then().log().all();
		response.then().extract().response();
		String responseBody = response.getBody().asString();
		JsonPath jsonPath = new JsonPath(responseBody);
		String message = jsonPath.getString("success");
		String expectedMessage = "true";
		Assert.assertEquals(expectedMessage, message);
		Assert.assertEquals(response.getStatusCode(),200);
		Assert.assertEquals(response.statusLine(),"HTTP/1.1 200 OK");
		Assert.assertEquals(response.contentType(), "application/json; charset=utf-8" );
		
}
}
