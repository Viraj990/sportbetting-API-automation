package iGuru.Sportsbook.BIP.UserTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
public class PrematchTest {
	@Test (priority=1)
	public void getprematchlist() {
		Response prematch=iGuru.Sportsbook.BIP.UserEndpoint.PrematchEndpoint.getprematchlist();
		prematch.then().log().all();
		prematch.then().extract().response();
		String responseBody = prematch.getBody().asString();
		JsonPath jsonPath = new JsonPath(responseBody);
		String message = jsonPath.getString("success");
		String expectedMessage = "true";
		Assert.assertEquals(expectedMessage, message);
		Assert.assertEquals(prematch.getStatusCode(),200);
		Assert.assertEquals(prematch.statusLine(),"HTTP/1.1 200 OK");
		Assert.assertEquals(prematch.contentType(), "application/json; charset=utf-8" );
	}

	@Test (priority=2)
	public void getprematchdetails() {
		Response prematch=iGuru.Sportsbook.BIP.UserEndpoint.PrematchEndpoint.getprematchdetails();
		prematch.then().log().all();
		prematch.then().extract().response();
		String responseBody = prematch.getBody().asString();
		JsonPath jsonPath = new JsonPath(responseBody);
		String message = jsonPath.getString("success");
		String expectedMessage = "true";
		Assert.assertEquals(expectedMessage, message);
		Assert.assertEquals(prematch.getStatusCode(),200);
		Assert.assertEquals(prematch.statusLine(),"HTTP/1.1 200 OK");
		Assert.assertEquals(prematch.contentType(), "application/json; charset=utf-8" );
	}
	@Test (priority=3)  //22-09-2023 API shows invalid so after deployment of new code please check and update
	public void getlastminute() {
		Response prematch=iGuru.Sportsbook.BIP.UserEndpoint.PrematchEndpoint.getlastminute();
		prematch.then().log().all();
		prematch.then().extract().response();
		String responseBody = prematch.getBody().asString();
		JsonPath jsonPath = new JsonPath(responseBody);
		String message = jsonPath.getString("success");
		String expectedMessage = "true";
		Assert.assertEquals(expectedMessage, message);
		Assert.assertEquals(prematch.getStatusCode(),200);
		Assert.assertEquals(prematch.statusLine(),"HTTP/1.1 200 OK");
		Assert.assertEquals(prematch.contentType(), "application/json; charset=utf-8" );
	}
	@Test (priority=4)
	public void prematchcalendar() {
		Response prematch=iGuru.Sportsbook.BIP.UserEndpoint.PrematchEndpoint.prematchcalendar();
		prematch.then().log().all();
		prematch.then().extract().response();
		String responseBody = prematch.getBody().asString();
		JsonPath jsonPath = new JsonPath(responseBody);
		String message = jsonPath.getString("success");
		String expectedMessage = "true";
		Assert.assertEquals(expectedMessage, message);
		Assert.assertEquals(prematch.getStatusCode(),200);
		Assert.assertEquals(prematch.statusLine(),"HTTP/1.1 200 OK");
		Assert.assertEquals(prematch.contentType(), "application/json; charset=utf-8" );
	}
}
