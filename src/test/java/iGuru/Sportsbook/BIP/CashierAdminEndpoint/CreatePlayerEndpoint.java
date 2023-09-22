package iGuru.Sportsbook.BIP.CashierAdminEndpoint;

import static io.restassured.RestAssured.given;

import iGuru.Sportsbook.BIP.Routes.CashierRoutes;
import iGuru.Sportsbook.BIP.Routes.Token;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class CreatePlayerEndpoint {
	public static Response Createplayer(){
		Response response=given()
		.header("x-api-key", "35969c8e0fba4")
		.header("API-KEY", "35969c8e0fba4")
		.header("Authorization", Token.cashier)
		.contentType(ContentType.JSON)
		.accept(ContentType.JSON)
		.body(iGuru.Sportsbook.BIP.Payload.Cashier_Payload.createplayer)
		.when()
		.post(CashierRoutes.createplayer);
		return response;
	}
	public static Response verifyOTP(){
		Response response=given()
		.header("x-api-key", "35969c8e0fba4")
		.header("API-KEY", "35969c8e0fba4")
		.header("Authorization", Token.cashier)
		.contentType(ContentType.JSON)
		.accept(ContentType.JSON)
		.body(iGuru.Sportsbook.BIP.Payload.Cashier_Payload.verifyotp)
		.when()
		.post(CashierRoutes.verifyOTP);
		return response;
	}
	public static Response resentOTP(){
		Response response=given()
		.header("x-api-key", "35969c8e0fba4")
		.header("API-KEY", "35969c8e0fba4")
		.header("Authorization", Token.cashier)
		.contentType(ContentType.JSON)
		.accept(ContentType.JSON)
		.body(iGuru.Sportsbook.BIP.Payload.Cashier_Payload.resentotp)
		.when()
		.post(CashierRoutes.ResentOTP);
		return response;
	}
	public static Response cancelplayerrequest(){
		Response response=given()
		.header("x-api-key", "35969c8e0fba4")
		.header("API-KEY", "35969c8e0fba4")
		.header("Authorization", Token.cashier)
		.contentType(ContentType.JSON)
		.accept(ContentType.JSON)
		.body(iGuru.Sportsbook.BIP.Payload.Cashier_Payload.cancelplayerOTP)
		.when()
		.post(CashierRoutes.cancelplayer);
		return response;
	}
}
