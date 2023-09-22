package iGuru.Sportsbook.BIP.CashierAdminEndpoint;
import static io.restassured.RestAssured.given;

import iGuru.Sportsbook.BIP.Routes.CashierRoutes;
import iGuru.Sportsbook.BIP.Routes.Token;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
public class CashierBalanceTransferEndpoint {
	public static Response getBTlist(){
		Response response=given()
		.header("x-api-key", "35969c8e0fba4")
		.header("API-KEY", "35969c8e0fba4")
		.header("Authorization", Token.cashier)
		.contentType(ContentType.JSON)
		.accept(ContentType.JSON)
		.when()
		.get(CashierRoutes.getuserlist);
		return response;
	}
	public static Response BTrequest(){
		Response response=given()
		.header("x-api-key", "35969c8e0fba4")
		.header("API-KEY", "35969c8e0fba4")
		.header("Authorization", Token.cashier)
		.contentType(ContentType.JSON)
		.accept(ContentType.JSON)
		.body(iGuru.Sportsbook.BIP.Payload.Cashier_Payload.btrequest)
		.when()
		.post(CashierRoutes.BTrequest);
		return response;
	}
	public static Response VerifytransferwithOTP(){
		Response response=given()
		.header("x-api-key", "35969c8e0fba4")
		.header("API-KEY", "35969c8e0fba4")
		.header("Authorization", Token.cashier)
		.contentType(ContentType.JSON)
		.accept(ContentType.JSON)
		.body(iGuru.Sportsbook.BIP.Payload.Cashier_Payload.verfiytransferotp)
		.when()
		.post(CashierRoutes.verifytransferwithOTP);
		return response;
	}
	public static Response canceltransfer(){
		Response response=given()
		.header("x-api-key", "35969c8e0fba4")
		.header("API-KEY", "35969c8e0fba4")
		.header("Authorization", Token.cashier)
		.contentType(ContentType.JSON)
		.accept(ContentType.JSON)
		.body(iGuru.Sportsbook.BIP.Payload.Cashier_Payload.canceltransfer)
		.when()
		.post(CashierRoutes.canceltransfer);
		return response;
	}
	public static Response resentBTOTP(){
		Response response=given()
		.header("x-api-key", "35969c8e0fba4")
		.header("API-KEY", "35969c8e0fba4")
		.header("Authorization", Token.cashier)
		.contentType(ContentType.JSON)
		.accept(ContentType.JSON)
		.body(iGuru.Sportsbook.BIP.Payload.Cashier_Payload.resenttransferotp)
		.when()
		.post(CashierRoutes.ResentbtOTP);
		return response;
	}
}
