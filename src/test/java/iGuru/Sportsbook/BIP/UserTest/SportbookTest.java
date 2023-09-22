package iGuru.Sportsbook.BIP.UserTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import iGuru.Sportsbook.BIP.UserEndpoint.SportbookEndpoint;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
public class SportbookTest {
	@Test (priority=1)
	public void getsportbooklist() {
		Response sportbook=SportbookEndpoint.getsportbooks();
				sportbook.then().log().all();
				sportbook.then().extract().response();
				String responseBody = sportbook.getBody().asString();
				JsonPath jsonPath = new JsonPath(responseBody);
				String message = jsonPath.getString("success");
				String expectedMessage = "true";
				Assert.assertEquals(expectedMessage, message);
		Assert.assertEquals(sportbook.getStatusCode(),200);
		Assert.assertEquals(sportbook.statusLine(),"HTTP/1.1 200 OK");
		Assert.assertEquals(sportbook.contentType(), "application/json; charset=utf-8" );
	}
	@Test (priority=2)
	public void sportbooklist() {
		Response sportbook=SportbookEndpoint.sportbooklists();
				sportbook.then().log().all();
				sportbook.then().extract().response();
				String responseBody = sportbook.getBody().asString();
				JsonPath jsonPath = new JsonPath(responseBody);
				String message = jsonPath.getString("success");
				String expectedMessage = "true";
				Assert.assertEquals(expectedMessage, message);
		Assert.assertEquals(sportbook.getStatusCode(),200);
		Assert.assertEquals(sportbook.statusLine(),"HTTP/1.1 200 OK");
		Assert.assertEquals(sportbook.contentType(), "application/json; charset=utf-8" );
	}
	@Test (priority=3)
	public void getmobilesportbooks() {
		Response sportbook=SportbookEndpoint.getmobilesportbook();
				sportbook.then().log().all();
				sportbook.then().extract().response();
				String responseBody = sportbook.getBody().asString();
				JsonPath jsonPath = new JsonPath(responseBody);
				String message = jsonPath.getString("success");
				String expectedMessage = "true";
				Assert.assertEquals(expectedMessage, message);
		Assert.assertEquals(sportbook.getStatusCode(),200);
		Assert.assertEquals(sportbook.statusLine(),"HTTP/1.1 200 OK");
		Assert.assertEquals(sportbook.contentType(), "application/json; charset=utf-8" );
	}
	@Test (priority=4)
	public void getmobilesportbooklists() {
		Response sportbook=SportbookEndpoint.getmobilesportbooklist();
				sportbook.then().log().all();
				sportbook.then().extract().response();
				String responseBody = sportbook.getBody().asString();
				JsonPath jsonPath = new JsonPath(responseBody);
				String message = jsonPath.getString("success");
				String expectedMessage = "true";
				Assert.assertEquals(expectedMessage, message);
		Assert.assertEquals(sportbook.getStatusCode(),200);
		Assert.assertEquals(sportbook.statusLine(),"HTTP/1.1 200 OK");
		Assert.assertEquals(sportbook.contentType(), "application/json; charset=utf-8" );
	}
}
