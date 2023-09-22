package iGuru.Sportsbook.BIP.SuperAdminEndpoint;
import static io.restassured.RestAssured.given;

import iGuru.Sportsbook.BIP.Routes.SuperAdminRoutes;
import iGuru.Sportsbook.BIP.Routes.Token;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
public class SuperAdmin_UserEndpoint {
	public static Response getuseradmin(){
		Response response=given()
		.header("x-api-key", "35969c8e0fba4")
		.header("API-KEY", "35969c8e0fba4")
		.header("Authorization", Token.super_admin)
		.contentType(ContentType.JSON)
		.accept(ContentType.JSON)
		.when()
		.get(SuperAdminRoutes.getuser);
		return response;
	}
	public static Response getuserlists(){
		Response response=given()
		.header("x-api-key", "35969c8e0fba4")
		.header("API-KEY", "35969c8e0fba4")
		.header("Authorization", Token.super_admin)
		.queryParam("page", 1)
		.queryParam("Size", 10)
		.body(iGuru.Sportsbook.BIP.Payload.Menu_LeaguePayload.getusers)
		.contentType(ContentType.JSON)
		.accept(ContentType.JSON)
		.when()
		.post(SuperAdminRoutes.getusers);
		return response;
	}
	public static Response Adduser(){
		Response response=given()
		.header("x-api-key", "35969c8e0fba4")
		.header("API-KEY", "35969c8e0fba4")
		.header("Authorization", Token.super_admin)
		.body(iGuru.Sportsbook.BIP.Payload.Menu_LeaguePayload.addusers)
		.contentType(ContentType.JSON)
		.accept(ContentType.JSON)
		.when()
		.post(SuperAdminRoutes.adduser);
		return response;
	}
	public static Response Updateuser(){
		Response response=given()
		.header("x-api-key", "35969c8e0fba4")
		.header("API-KEY", "35969c8e0fba4")
		.header("Authorization", Token.super_admin)
		.body(iGuru.Sportsbook.BIP.Payload.Menu_LeaguePayload.updateusers)
		.contentType(ContentType.JSON)
		.accept(ContentType.JSON)
		.when()
		.put(SuperAdminRoutes.updateuser);
		return response;
	}
	public static Response deleteuser(){
		Response response=given()
		.header("x-api-key", "35969c8e0fba4")
		.header("API-KEY", "35969c8e0fba4")
		.header("Authorization", Token.super_admin)
		.contentType(ContentType.JSON)
		.accept(ContentType.JSON)
		.when()
		.delete(SuperAdminRoutes.deleteuser);
		return response;
	}
}
