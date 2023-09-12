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
public class AuthEndpoint {
public static Response createuser(authpojo payload){
		
		Response response=given()
		.header("x-api-key", "35969c8e0fba4")
		.header("API-KEY", "35969c8e0fba4")
		.contentType(ContentType.JSON)
		.accept(ContentType.JSON)
		.body(payload)
		.when()
		.post(UserRoutes.register);
		return response;
	}
	
	public static Response VerifyOTPForRegistration() throws FileNotFoundException {
		File f=new File(".\\JsonFile\\userverifyotpregistration.json");
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
				.post(UserRoutes.otpverification);
				return response;
	}
	public static Response resentotp() throws FileNotFoundException{
		File f=new File(".\\JsonFile\\userrentotp.json");
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
				.post(UserRoutes.resendotp);
				return response;
	}
	public static Response cancelusers() throws FileNotFoundException {
		File f=new File(".\\JsonFile\\userrentotp.json");
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
				.post(UserRoutes.canceluser);
				return response;
	}
	
	
	public static Response loginuser(){
		
		Response response=given()
				.header("x-api-key", "35969c8e0fba4")
				.header("API-KEY", "35969c8e0fba4")
				.contentType(ContentType.JSON)
				.accept(ContentType.JSON)
				.body(LoginEndpoint.payload.loginuser)
				//.body(LoginEndpoint.Credential.userlogin)
				.when()
				.post(UserRoutes.login);
				return response;
	}
	
	public static Response getticketdetails(){
		Response ticket=given()
				.header("x-api-key", "35969c8e0fba4")
				.contentType(ContentType.JSON)
				.accept(ContentType.JSON)
				.header("API-KEY", "35969c8e0fba4")
				.body(LoginEndpoint.payload.getticketdetails)
				.when()
				.post(UserRoutes.getticketdetails);
	return ticket;
			
	}
	
	public static Response forgetpassword(){
	Response ticket=given()
				.header("x-api-key", "35969c8e0fba4")
				.contentType(ContentType.JSON)
				.accept(ContentType.JSON)
				.header("API-KEY", "35969c8e0fba4")
				.body(LoginEndpoint.payload.forgetpassword)
				.when()
				.post(UserRoutes.forgetpassword);
	return ticket;
	}
}
