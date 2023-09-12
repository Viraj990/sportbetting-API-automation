package userEndpoint;
import static io.restassured.RestAssured.given;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import org.json.JSONObject;
import org.json.JSONTokener;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import routes.UserRoutes;

public class OfflineUserEndpoint {
public static Response offlinesinglebets() throws FileNotFoundException {
		
		File f=new File(".\\JsonFile\\offlinesingle.json");
		FileReader fr=new FileReader(f);
		JSONTokener jt=new JSONTokener(fr);
		JSONObject data=new JSONObject(jt);
		
		Response user=given()
				.header("x-api-key", "35969c8e0fba4")
				.header("API-KEY", "35969c8e0fba4")
				.contentType(ContentType.JSON)
				.accept(ContentType.JSON)
				.body(data.toString())
				.when()
				.post(UserRoutes.savebet);
		return user;
	}
public static Response offlinecombibets() throws FileNotFoundException {
	
	File f=new File(".\\JsonFile\\offlinecombi.json");
	FileReader fr=new FileReader(f);
	JSONTokener jt=new JSONTokener(fr);
	JSONObject data=new JSONObject(jt);
	
	Response user=given()
			.header("x-api-key", "35969c8e0fba4")
			.header("API-KEY", "35969c8e0fba4")
			.contentType(ContentType.JSON)
			.accept(ContentType.JSON)
			.body(data.toString())
			.when()
			.post(UserRoutes.savebet);
	return user;
}
}
