package iGuru.Sportsbook.BIP.SuperAdminEndpoint;

import static io.restassured.RestAssured.given;

import iGuru.Sportsbook.BIP.Routes.SuperAdminRoutes;
import iGuru.Sportsbook.BIP.Routes.Token;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class ReportEndpoint {
	public static Response payoutreport(){
		Response response=given()
				.header("x-api-key", "35969c8e0fba4")
				.header("API-KEY", "35969c8e0fba4")
				.header("Authorization", Token.super_admin)
				.contentType(ContentType.JSON)
				.accept(ContentType.JSON)
				.queryParam("page", 1)
				.queryParam("Size", 10)
				.body(iGuru.Sportsbook.BIP.Payload.payload.getpayoutreport)
				.when()
				.post(SuperAdminRoutes.payoutreport);
		return response;
	}
	public static Response payoutexport(){
		Response response=given()
				.header("x-api-key", "35969c8e0fba4")
				.header("API-KEY", "35969c8e0fba4")
				.header("Authorization", Token.super_admin)
				.contentType(ContentType.JSON)
				.accept(ContentType.JSON)
				.body(iGuru.Sportsbook.BIP.Payload.payload.exportpayoutreport)
				.when()
				.post(SuperAdminRoutes.exportpayout);
		return response;
	}
	public static Response betreport(){
		Response response=given()
				.header("x-api-key", "35969c8e0fba4")
				.header("API-KEY", "35969c8e0fba4")
				.header("Authorization", Token.super_admin)
				.contentType(ContentType.JSON)
				.accept(ContentType.JSON)
				.queryParam("page", 1)
				.queryParam("Size", 10)
				.body(iGuru.Sportsbook.BIP.Payload.payload.getbetsreport)
				.when()
				.post(SuperAdminRoutes.payoutreport);
		return response;
	}
	public static Response betreportexport(){
		Response response=given()
				.header("x-api-key", "35969c8e0fba4")
				.header("API-KEY", "35969c8e0fba4")
				.header("Authorization", Token.super_admin)
				.contentType(ContentType.JSON)
				.accept(ContentType.JSON)
				.body(iGuru.Sportsbook.BIP.Payload.payload.exportbetsreport)
				.when()
				.post(SuperAdminRoutes.exportpayout);
		return response;
	}
	public static Response highestbetreport(){
		Response response=given()
				.header("x-api-key", "35969c8e0fba4")
				.header("API-KEY", "35969c8e0fba4")
				.header("Authorization", Token.super_admin)
				.contentType(ContentType.JSON)
				.accept(ContentType.JSON)
				.queryParam("page", 1)
				.queryParam("Size", 10)
				.body(iGuru.Sportsbook.BIP.Payload.payload.gethighestbetreport)
				.when()
				.post(SuperAdminRoutes.payoutreport);
		return response;
	}
	public static Response highestbetreportexport(){
		Response response=given()
				.header("x-api-key", "35969c8e0fba4")
				.header("API-KEY", "35969c8e0fba4")
				.header("Authorization", Token.super_admin)
				.contentType(ContentType.JSON)
				.accept(ContentType.JSON)
				.body(iGuru.Sportsbook.BIP.Payload.payload.exporthighestbetreport)
				.when()
				.post(SuperAdminRoutes.exportpayout);
		return response;
	}
	public static Response WinningReport(){
		Response response=given()
				.header("x-api-key", "35969c8e0fba4")
				.header("API-KEY", "35969c8e0fba4")
				.header("Authorization", Token.super_admin)
				.contentType(ContentType.JSON)
				.accept(ContentType.JSON)
				.queryParam("page", 1)
				.queryParam("Size", 10)
				.body(iGuru.Sportsbook.BIP.Payload.payload.exporthighestbetreport)
				.when()
				.post(SuperAdminRoutes.GetwinningReport);
		return response;
	}
	public static Response Winningreportexport(){
		Response response=given()
				.header("x-api-key", "35969c8e0fba4")
				.header("API-KEY", "35969c8e0fba4")
				.header("Authorization", Token.super_admin)
				.contentType(ContentType.JSON)
				.accept(ContentType.JSON)
				.body(iGuru.Sportsbook.BIP.Payload.payload.exporthighestbetreport)
				.when()
				.post(SuperAdminRoutes.Exportwinningreport);
		return response;
	}
	public static Response playerbetreport(){
		Response response=given()
				.header("x-api-key", "35969c8e0fba4")
				.header("API-KEY", "35969c8e0fba4")
				.header("Authorization", Token.super_admin)
				.contentType(ContentType.JSON)
				.accept(ContentType.JSON)
				.body(iGuru.Sportsbook.BIP.Payload.payload.playerbetreport)
				.when()
				.post(SuperAdminRoutes.Getplayerbet);
		return response;
	}
	public static Response BettingReport(){
		Response response=given()
				.header("x-api-key", "35969c8e0fba4")
				.header("API-KEY", "35969c8e0fba4")
				.header("Authorization", Token.super_admin)
				.contentType(ContentType.JSON)
				.accept(ContentType.JSON)
				.queryParam("page", 1)
				.queryParam("Size", 10)
				.body(iGuru.Sportsbook.BIP.Payload.payload.exportbetreport)
				.when()
				.post(SuperAdminRoutes.betreport);
		return response;
	}
	public static Response Exportbetting(){
		Response response=given()
				.header("x-api-key", "35969c8e0fba4")
				.header("API-KEY", "35969c8e0fba4")
				.header("Authorization", Token.super_admin)
				.contentType(ContentType.JSON)
				.accept(ContentType.JSON)
				.body(iGuru.Sportsbook.BIP.Payload.payload.exporthighestbetreport)
				.when()
				.post(SuperAdminRoutes.exportbetreport);
		return response;
	}
	public static Response shoplivestats(){
		Response response=given()
				.header("x-api-key", "35969c8e0fba4")
				.header("API-KEY", "35969c8e0fba4")
				.header("Authorization", Token.super_admin)
				.contentType(ContentType.JSON)
				.accept(ContentType.JSON)
				.when()
				.get(SuperAdminRoutes.livebalance);
		return response;
	}
	public static Response getsupervisorlist(){
		Response response=given()
				.header("x-api-key", "35969c8e0fba4")
				.header("API-KEY", "35969c8e0fba4")
				.header("Authorization", Token.super_admin)
				.contentType(ContentType.JSON)
				.accept(ContentType.JSON)
				.body(iGuru.Sportsbook.BIP.Payload.payload.getsupervisorlist)
				.when()
				.get(SuperAdminRoutes.getsupervisorlist);
		return response;
	}
	public static Response supervisorreport(){
		Response response=given()
				.header("x-api-key", "35969c8e0fba4")
				.header("API-KEY", "35969c8e0fba4")
				.header("Authorization", Token.super_admin)
				.contentType(ContentType.JSON)
				.accept(ContentType.JSON)
				.queryParam("page", 1)
				.queryParam("Size", 10)
				.body(iGuru.Sportsbook.BIP.Payload.payload.supervisorSummary)
				.when()
				.get(SuperAdminRoutes.supervisorreport);
		return response;
	}
	public static Response exportsupervisor(){
		Response response=given()
				.header("x-api-key", "35969c8e0fba4")
				.header("API-KEY", "35969c8e0fba4")
				.header("Authorization", Token.super_admin)
				.contentType(ContentType.JSON)
				.accept(ContentType.JSON)
				.body(iGuru.Sportsbook.BIP.Payload.payload.supervisorSummary)
				.when()
				.get(SuperAdminRoutes.exportsupervisorreport);
		return response;
	}
	public static Response getcashierlist(){
		Response response=given()
				.header("x-api-key", "35969c8e0fba4")
				.header("API-KEY", "35969c8e0fba4")
				.header("Authorization", Token.super_admin)
				.contentType(ContentType.JSON)
				.accept(ContentType.JSON)
				.body(iGuru.Sportsbook.BIP.Payload.payload.getcashiersummarylist)
				.when()
				.get(SuperAdminRoutes.getcashierlist);
		return response;
	}
	public static Response cashierreport(){
		Response response=given()
				.header("x-api-key", "35969c8e0fba4")
				.header("API-KEY", "35969c8e0fba4")
				.header("Authorization", Token.super_admin)
				.contentType(ContentType.JSON)
				.accept(ContentType.JSON)
				.queryParam("page", 1)
				.queryParam("Size", 10)
				.body(iGuru.Sportsbook.BIP.Payload.payload.cashierreport)
				.when()
				.get(SuperAdminRoutes.cashierreport);
		return response;
	}
	public static Response exportcashier(){
		Response response=given()
				.header("x-api-key", "35969c8e0fba4")
				.header("API-KEY", "35969c8e0fba4")
				.header("Authorization", Token.super_admin)
				.contentType(ContentType.JSON)
				.accept(ContentType.JSON)
				.body(iGuru.Sportsbook.BIP.Payload.payload.exportcashiersummary)
				.when()
				.get(SuperAdminRoutes.exportcashierreport);
		return response;
	}
	public static Response getshoplist(){
		Response response=given()
		.header("x-api-key", "35969c8e0fba4")
		.header("API-KEY", "35969c8e0fba4")
		.header("Authorization", Token.super_admin)
		.contentType(ContentType.JSON)
		.accept(ContentType.JSON)
		.body(iGuru.Sportsbook.BIP.Payload.payload.getshopsummarylist)
		.when()
		.get(SuperAdminRoutes.getshoplist);
		return response;
	}
	public static Response shopsummaryreport(){
		Response response=given()
		.header("x-api-key", "35969c8e0fba4")
		.header("API-KEY", "35969c8e0fba4")
		.header("Authorization", Token.super_admin)
		.contentType(ContentType.JSON)
		.accept(ContentType.JSON)
		.queryParam("page", 1)
		.queryParam("Size", 10)
		.body(iGuru.Sportsbook.BIP.Payload.payload.shopsummaryreport)
		.when()
		.post(SuperAdminRoutes.shopreport);
		return response;
	}
	public static Response exportshopsummary(){
		Response response=given()
		.header("x-api-key", "35969c8e0fba4")
		.header("API-KEY", "35969c8e0fba4")
		.header("Authorization", Token.super_admin)
		.contentType(ContentType.JSON)
		.accept(ContentType.JSON)
		.body(iGuru.Sportsbook.BIP.Payload.payload.exportshopsummaryreport)
		.when()
		.post(SuperAdminRoutes.exportshopreport);
		return response;
	}
	public static Response leaguesummarylist(){
		Response response=given()
		.header("x-api-key", "35969c8e0fba4")
		.header("API-KEY", "35969c8e0fba4")
		.header("Authorization", Token.super_admin)
		.contentType(ContentType.JSON)
		.accept(ContentType.JSON)
		.body(iGuru.Sportsbook.BIP.Payload.payload.getleaguesummarylist)
		.when()
		.get(SuperAdminRoutes.getleaguelist);
		return response;
	}
	public static Response leagueummaryreport(){
		Response response=given()
		.header("x-api-key", "35969c8e0fba4")
		.header("API-KEY", "35969c8e0fba4")
		.header("Authorization", Token.super_admin)
		.contentType(ContentType.JSON)
		.accept(ContentType.JSON)
		.queryParam("page", 1)
		.queryParam("Size", 10)
		.body(iGuru.Sportsbook.BIP.Payload.payload.leaguesummaryreport)
		.when()
		.post(SuperAdminRoutes.leaguereport);
		return response;
	}
	public static Response exportleaguesummary(){
		Response response=given()
		.header("x-api-key", "35969c8e0fba4")
		.header("API-KEY", "35969c8e0fba4")
		.header("Authorization", Token.super_admin)
		.contentType(ContentType.JSON)
		.accept(ContentType.JSON)
		.body(iGuru.Sportsbook.BIP.Payload.payload.exportleaguesummaryreport)
		.when()
		.post(SuperAdminRoutes.exportleaguereport);
		return response;
	}
	
}
