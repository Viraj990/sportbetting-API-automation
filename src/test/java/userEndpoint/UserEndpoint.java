package userEndpoint;
import static io.restassured.RestAssured.given;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import org.json.JSONObject;
import org.json.JSONTokener;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import routes.Token;
import routes.UserRoutes;

public class UserEndpoint {
	public static Response GetTicketlist() {

		Response user=given()
				.header("x-api-key", "35969c8e0fba4")
				.header("API-KEY", "35969c8e0fba4")
				.header("Authorization", Token.Utoken)
				.contentType(ContentType.JSON)
				.accept(ContentType.JSON)
				.queryParam("page", 1)
				.queryParam("Size", 10)
				.when()
				.get(UserRoutes.GetTicketlist);
		return user;
	}
	public static Response GetTicketlistdetails() {
		Response user=given()
				.header("x-api-key", "35969c8e0fba4")
				.header("API-KEY", "35969c8e0fba4")
				.header("Authorization", Token.Utoken)
				.contentType(ContentType.JSON)
				.accept(ContentType.JSON)
				.body(LoginEndpoint.payload.betticket)
				.when()
				.post(UserRoutes.GetTicketlistdetails);
		return user;
	}
	public static Response gettransactionlist() {

		Response user=given()
				.header("x-api-key", "35969c8e0fba4")
				.header("API-KEY", "35969c8e0fba4")
				.header("Authorization", Token.Utoken)
				.accept(ContentType.JSON)
				.queryParam("page", 1)
				.queryParam("Size", 10)
				.when()
				.get(UserRoutes.gettransactionlist);
		return user;
	}
	public static Response placedbets() throws FileNotFoundException {
		
		File f=new File(".\\JsonFile\\placedbet.json");
		FileReader fr=new FileReader(f);
		JSONTokener jt=new JSONTokener(fr);
		JSONObject data=new JSONObject(jt);
		
		Response user=given()
				.header("x-api-key", "35969c8e0fba4")
				.header("API-KEY", "35969c8e0fba4")
				.header("Authorization", Token.Utoken)
				.contentType(ContentType.JSON)
				.accept(ContentType.JSON)
				.body(data.toString())
				.when()
				.post(UserRoutes.placedbet);
		return user;
	}
	public static Response logintoken() {

		Response user=given()
				.header("x-api-key", "35969c8e0fba4")
				.header("API-KEY", "35969c8e0fba4")
				.header("Authorization", Token.Utoken)
				.contentType(ContentType.JSON)
				.accept(ContentType.JSON)
				.queryParam("page", 1)
				.queryParam("Size", 10)
				.when()
				.get(UserRoutes.userlogintokencheck);
		return user;
	}
	public static Response profiledetails() {

		Response user=given()
				.header("x-api-key", "35969c8e0fba4")
				.header("API-KEY", "35969c8e0fba4")
				.header("Authorization", Token.Utoken)
				.contentType(ContentType.JSON)
				.accept(ContentType.JSON)
				.queryParam("page", 1)
				.queryParam("Size", 10)
				.when()
				.get(UserRoutes.getuserprofile);
		return user;
	}
public static Response updateprofile() throws FileNotFoundException {
		
		File f=new File(".\\JsonFile\\updateprofile.json");
		FileReader fr=new FileReader(f);
		JSONTokener jt=new JSONTokener(fr);
		JSONObject data=new JSONObject(jt);
		
		Response user=given()
				.header("x-api-key", "35969c8e0fba4")
				.header("API-KEY", "35969c8e0fba4")
				.header("Authorization", Token.Utoken)
				.contentType(ContentType.JSON)
				.accept(ContentType.JSON)
				.body(data.toString())
				.when()
				.post(UserRoutes.updateuserprofile);
		return user;
	}
}
