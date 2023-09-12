package userTest;
import java.io.FileNotFoundException;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.restassured.response.Response;
import userEndpoint.OfflineUserEndpoint;
public class OfflineUserTest {
	@Test (priority=1)
	public void singleplacedbet() throws FileNotFoundException {
		Response user=OfflineUserEndpoint.offlinesinglebets();
		user.then().log().all();
		Assert.assertEquals(user.getStatusCode(),200);
	}
	@Test (priority=2)
	public void combiplacedbet() throws FileNotFoundException {
		Response user=OfflineUserEndpoint.offlinecombibets();
		user.then().log().all();
		Assert.assertEquals(user.getStatusCode(),200);
	}
}
