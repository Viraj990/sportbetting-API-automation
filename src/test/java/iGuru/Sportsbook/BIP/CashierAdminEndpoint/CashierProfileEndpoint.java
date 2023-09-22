package iGuru.Sportsbook.BIP.CashierAdminEndpoint;
import static io.restassured.RestAssured.given;
import io.restassured.http.ContentType;
import iGuru.Sportsbook.BIP.Routes.CashierRoutes;
import iGuru.Sportsbook.BIP.Routes.Token;
import io.restassured.response.Response;

public class CashierProfileEndpoint {
	public static Response CashierProfile(){
		Response response=given()
		.header("x-api-key", "35969c8e0fba4")
		.header("API-KEY", "35969c8e0fba4")
		.header("Authorization", Token.cashier)
		.contentType(ContentType.JSON)
		.accept(ContentType.JSON)
		.when()
		.get(CashierRoutes.getprofile);
		return response;
	}
	public static Response UpdateCashierProfile(){
		Response response=given()
		.header("x-api-key", "35969c8e0fba4")
		.header("API-KEY", "35969c8e0fba4")
		.header("Authorization", Token.cashier)
		.contentType(ContentType.JSON)
		.accept(ContentType.JSON)
		.body(iGuru.Sportsbook.BIP.Payload.Cashier_Payload.update_profile)
		.when()
		.post(CashierRoutes.updateprofile);
		return response;
	}
	public static Response Changepassword(){
		Response response=given()
		.header("x-api-key", "35969c8e0fba4")
		.header("API-KEY", "35969c8e0fba4")
		.header("Authorization", Token.cashier)
		.contentType(ContentType.JSON)
		.accept(ContentType.JSON)
		.body(iGuru.Sportsbook.BIP.Payload.Cashier_Payload.changepassword)
		.when()
		.post(CashierRoutes.changepassword);
		return response;
	}
}
