package iGuru.Sportsbook.BIP.UserTest;
import java.io.FileNotFoundException;
import org.testng.Assert;
import org.testng.annotations.Test;

import iGuru.Sportsbook.BIP.UserEndpoint.OfflineUserEndpoint;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
public class OfflineUserTest {
	@Test (priority=1)
	public void singleplacedbet() throws FileNotFoundException {
		Response user=OfflineUserEndpoint.offlinesinglebets();
		user.then().log().all();
		user.then().extract().response();
		String responseBody = user.getBody().asString();
		JsonPath jsonPath = new JsonPath(responseBody);
		String message = jsonPath.getString("message");
		String expectedMessage = "Save bet successfully.";
		Assert.assertEquals(expectedMessage, message);
		Assert.assertEquals(user.getStatusCode(),200);
		Assert.assertEquals(user.statusLine(),"HTTP/1.1 200 OK");
		Assert.assertEquals(user.contentType(), "application/json; charset=utf-8" );
	}
	@Test (priority=2)
	public void combiplacedbet() throws FileNotFoundException {
		Response user=OfflineUserEndpoint.offlinecombibets();
		user.then().log().all();
		user.then().extract().response();
		String responseBody = user.getBody().asString();
		JsonPath jsonPath = new JsonPath(responseBody);
		String message = jsonPath.getString("message");
		String expectedMessage = "Save bet successfully.";
		Assert.assertEquals(expectedMessage, message);
		Assert.assertEquals(user.getStatusCode(),200);
		Assert.assertEquals(user.statusLine(),"HTTP/1.1 200 OK");
		Assert.assertEquals(user.contentType(), "application/json; charset=utf-8" );
	}
	
}
