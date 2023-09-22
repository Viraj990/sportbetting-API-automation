package iGuru.Sportsbook.BIP.SuperAdminEndpoint;
import static io.restassured.RestAssured.given;

import iGuru.Sportsbook.BIP.Routes.SuperAdminRoutes;
import iGuru.Sportsbook.BIP.Routes.Token;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
public class ShopEndpoint {
	public static Response getshop(){
		Response response=given()
		.header("x-api-key", "35969c8e0fba4")
		.header("API-KEY", "35969c8e0fba4")
		.header("Authorization", Token.super_admin)
		.contentType(ContentType.JSON)
		.accept(ContentType.JSON)
		.when()
		.get(SuperAdminRoutes.getshop);
		return response;
	}
	public static Response getshoplist(){
		Response response=given()
		.header("x-api-key", "35969c8e0fba4")
		.header("API-KEY", "35969c8e0fba4")
		.header("Authorization", Token.super_admin)
		.queryParam("page", 1)
		.queryParam("Size", 10)
		.body(iGuru.Sportsbook.BIP.Payload.Menu_LeaguePayload.getshops)
		.contentType(ContentType.JSON)
		.accept(ContentType.JSON)
		.when()
		.post(SuperAdminRoutes.getshops);
		return response;
	}
	public static Response Addshop(){
		Response response=given()
		.header("x-api-key", "35969c8e0fba4")
		.header("API-KEY", "35969c8e0fba4")
		.header("Authorization", Token.super_admin)
		.body(iGuru.Sportsbook.BIP.Payload.Menu_LeaguePayload.addshops)
		.contentType(ContentType.JSON)
		.accept(ContentType.JSON)
		.when()
		.post(SuperAdminRoutes.addshop);
		return response;
	}
	public static Response Updateshop(){
		Response response=given()
		.header("x-api-key", "35969c8e0fba4")
		.header("API-KEY", "35969c8e0fba4")
		.header("Authorization", Token.super_admin)
		.body(iGuru.Sportsbook.BIP.Payload.Menu_LeaguePayload.updateshops)
		.contentType(ContentType.JSON)
		.accept(ContentType.JSON)
		.when()
		.put(SuperAdminRoutes.updateshop);
		return response;
	}
	public static Response deleteshop(){
		Response response=given()
		.header("x-api-key", "35969c8e0fba4")
		.header("API-KEY", "35969c8e0fba4")
		.header("Authorization", Token.super_admin)
		.contentType(ContentType.JSON)
		.accept(ContentType.JSON)
		.when()
		.delete(SuperAdminRoutes.deleteshop);
		return response;
	}
	public static Response getshopasignadmin(){
		Response response=given()
		.header("x-api-key", "35969c8e0fba4")
		.header("API-KEY", "35969c8e0fba4")
		.header("Authorization", Token.super_admin)
		.contentType(ContentType.JSON)
		.accept(ContentType.JSON)
		.when()
		.get(SuperAdminRoutes.getshopasignforadminuser);
		return response;
	}
	public static Response shopasignforadminuser(){
		Response response=given()
		.header("x-api-key", "35969c8e0fba4")
		.header("API-KEY", "35969c8e0fba4")
		.header("Authorization", Token.super_admin)
		.body(iGuru.Sportsbook.BIP.Payload.Menu_LeaguePayload.shopassign)
		.contentType(ContentType.JSON)
		.accept(ContentType.JSON)
		.when()
		.post(SuperAdminRoutes.shopasignforadminuser);
		return response;
	}
	public static Response shopAssginForAdminUserList(){

		Response response=given()
		.header("x-api-key", "35969c8e0fba4")
		.header("API-KEY", "35969c8e0fba4")
		.header("Authorization", Token.super_admin)
		.contentType(ContentType.JSON)
		.accept(ContentType.JSON)
		.when()
		.get(SuperAdminRoutes.shopassginforadminuserlist);
		return response;
	}
}
