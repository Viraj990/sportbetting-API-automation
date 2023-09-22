package iGuru.Sportsbook.BIP.Routes;

public class SupervisorRoutes {
	//public static String base_url="https://api.onlinegamblingtech.com/api";
	public static String base_url="http://api.onlinegamblingtech.com/api";
	//public static String local="http://192.168.1.7:5000/api";

	//Admin Login
	public static String adminlogin=base_url+"/admin/login";

	//Shop transfer action
	public static String shoptransferaction=base_url+"/supervisor/shop/transfer/action";
	public static String getshoptransferrequest=base_url+"/supervisor/shop/transfer/list";

	//Profile
	public static String getprofile=base_url+"/supervisor/profile/detail";
	public static String updateprofile=base_url+"/supervisor/profile/update";
	public static String changepassword=base_url+"supervisor/change/password";

	//Shop
	public static String getshop=base_url+"supervisor/shop/list";
}
