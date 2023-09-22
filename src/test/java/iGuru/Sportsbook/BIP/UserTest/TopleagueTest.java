package iGuru.Sportsbook.BIP.UserTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
public class TopleagueTest {
	@Test (priority=1)
	public void gettopleague() {
		Response league=iGuru.Sportsbook.BIP.UserEndpoint.TopleagueEndpoint.GetTopLeague();
		league.then().log().all();
		Assert.assertEquals(league.getStatusCode(),200);
		league.then().extract().response();
		String responseBody = league.getBody().asString();
		JsonPath jsonPath = new JsonPath(responseBody);
		String message = jsonPath.getString("success");
		String expectedMessage = "true";
		Assert.assertEquals(expectedMessage, message);
		Assert.assertEquals(league.statusLine(),"HTTP/1.1 200 OK");
		Assert.assertEquals(league.contentType(), "application/json; charset=utf-8" );
	}
	@Test (priority=2)
	public void GetTopLeagueDetail() {
		Response league=iGuru.Sportsbook.BIP.UserEndpoint.TopleagueEndpoint.GetTopLeagueDetail();
		league.then().log().all();
		Assert.assertEquals(league.getStatusCode(),200);
		league.then().extract().response();
		String responseBody = league.getBody().asString();
		JsonPath jsonPath = new JsonPath(responseBody);
		String message = jsonPath.getString("success");
		String expectedMessage = "true";
		Assert.assertEquals(expectedMessage, message);
		Assert.assertEquals(league.statusLine(),"HTTP/1.1 200 OK");
		Assert.assertEquals(league.contentType(), "application/json; charset=utf-8" );
	}
	@Test (priority=3)
	public void MobileGetTopLeague() {
		Response league=iGuru.Sportsbook.BIP.UserEndpoint.TopleagueEndpoint.MobileGetTopLeague();
		league.then().log().all();
		Assert.assertEquals(league.getStatusCode(),200);
		league.then().extract().response();
		String responseBody = league.getBody().asString();
		JsonPath jsonPath = new JsonPath(responseBody);
		String message = jsonPath.getString("success");
		String expectedMessage = "true";
		Assert.assertEquals(expectedMessage, message);
		Assert.assertEquals(league.statusLine(),"HTTP/1.1 200 OK");
		Assert.assertEquals(league.contentType(), "application/json; charset=utf-8" );
	}
}
