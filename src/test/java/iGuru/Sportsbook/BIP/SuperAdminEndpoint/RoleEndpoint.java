package iGuru.Sportsbook.BIP.SuperAdminEndpoint;
import static io.restassured.RestAssured.given;

import iGuru.Sportsbook.BIP.Routes.SuperAdminRoutes;
import iGuru.Sportsbook.BIP.Routes.Token;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class RoleEndpoint {
	public static Response getrole(){
		Response response=given()
		.header("x-api-key", "35969c8e0fba4")
		.header("API-KEY", "35969c8e0fba4")
		.header("Authorization", Token.super_admin)
		.contentType(ContentType.JSON)
		.accept(ContentType.JSON)
		.when()
		.get(SuperAdminRoutes.getrole);
		return response;
	}
	public static Response getrolelist(){
		Response response=given()
		.header("x-api-key", "35969c8e0fba4")
		.header("API-KEY", "35969c8e0fba4")
		.header("Authorization", Token.super_admin)
		.queryParam("page", 1)
		.queryParam("Size", 10)
		.body(iGuru.Sportsbook.BIP.Payload.Menu_LeaguePayload.getroles)
		.contentType(ContentType.JSON)
		.accept(ContentType.JSON)
		.when()
		.post(SuperAdminRoutes.getroles);
		return response;
	}
	public static Response Addrole(){
		Response response=given()
		.header("x-api-key", "35969c8e0fba4")
		.header("API-KEY", "35969c8e0fba4")
		.header("Authorization", Token.super_admin)
		.body(iGuru.Sportsbook.BIP.Payload.Menu_LeaguePayload.addrole)
		.contentType(ContentType.JSON)
		.accept(ContentType.JSON)
		.when()
		.post(SuperAdminRoutes.addrole);
		return response;
	}
	public static Response Updaterole(){
		Response response=given()
		.header("x-api-key", "35969c8e0fba4")
		.header("API-KEY", "35969c8e0fba4")
		.header("Authorization", Token.super_admin)
		.body(iGuru.Sportsbook.BIP.Payload.Menu_LeaguePayload.updaterole)
		.contentType(ContentType.JSON)
		.accept(ContentType.JSON)
		.when()
		.post(SuperAdminRoutes.updaterole);
		return response;
	}
	public static Response deleterole(){
		Response response=given()
		.header("x-api-key", "35969c8e0fba4")
		.header("API-KEY", "35969c8e0fba4")
		.header("Authorization", Token.super_admin)
		.contentType(ContentType.JSON)
		.accept(ContentType.JSON)
		.when()
		.delete(SuperAdminRoutes.deleterole);
		return response;
	}
}
