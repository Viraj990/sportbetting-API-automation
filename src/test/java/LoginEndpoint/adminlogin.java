package LoginEndpoint;

import static io.restassured.RestAssured.given;

import java.io.File;
import java.io.FileNotFoundException;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.json.JSONObject;
import org.json.JSONTokener;
import java.io.FileReader;
public class adminlogin {
	public static Response superadminlogin() throws FileNotFoundException{
		File f=new File(".\\Crednetial\\superadmin.json");
		FileReader fr=new FileReader(f);
		JSONTokener jt=new JSONTokener(fr);
		JSONObject data=new JSONObject(jt);
		
		Response response=given()
		.header("x-api-key", "35969c8e0fba4")
		.header("API-KEY", "35969c8e0fba4")
		.contentType(ContentType.JSON)
		.accept(ContentType.JSON)
		.body(data.toString())
		.when()
		.post(routes.SuperAdminRoutes.adminlogin);
		return response;
	}
public static Response Cashierlogin() throws FileNotFoundException{
	File f=new File(".\\Crednetial\\cashier.json");
	FileReader fr=new FileReader(f);
	JSONTokener jt=new JSONTokener(fr);
	JSONObject data=new JSONObject(jt);
	Response response=given()
	.header("x-api-key", "35969c8e0fba4")
	.header("API-KEY", "35969c8e0fba4")
	.contentType(ContentType.JSON)
	.accept(ContentType.JSON)
	.body(data.toString())
	.when()
	.post(routes.SuperAdminRoutes.adminlogin);
	return response;
}public static Response supervisorlogin() throws FileNotFoundException{
	File f=new File(".\\Crednetial\\supervisor.json");
	FileReader fr=new FileReader(f);
	JSONTokener jt=new JSONTokener(fr);
	JSONObject data=new JSONObject(jt);
	Response response=given()
	.header("x-api-key", "35969c8e0fba4")
	.header("API-KEY", "35969c8e0fba4")
	.contentType(ContentType.JSON)
	.accept(ContentType.JSON)
	.body(data)
	.when()
	.post(routes.SuperAdminRoutes.adminlogin);
	return response;
}
}
