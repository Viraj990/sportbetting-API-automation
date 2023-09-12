package routes;

public class CashierRoutes {
	//public static String base_url="https://api.onlinegamblingtech.com/api";
	public static String base_url="http://api.onlinegamblingtech.com/api";
	//public static String local="http://192.168.1.7:5000/api";

	//Admin Login
	public static String adminlogin=base_url+"/admin/login";


	//Dashboard
	public static String getdashboarddata=base_url+"/cashier/dashboard";
	public static String summaryreport=base_url+"/cashier/summary/report";	

	//Profile
	public static String getprofile=base_url+"/cashier/profile/detail";
	public static String updateprofile=base_url+"/cashier/profile/update";
	public static String changepassword=base_url+"cashier/change/password";

	//create player
	public static String createplayer=base_url+"/cashier/user/create";
	public static String verifyOTP=base_url+"/cashier/verify/otp";
	public static String ResentOTP=base_url+"/cashier/resent/otp";
	public static String cancelplayer=base_url+"/cashier/user/cancel";

	//Balance Transfer
	public static String getuserlist=base_url+"/cashier/user/list";
	public static String BTrequest=base_url+"/cashier/transfer/balance";
	public static String verifytransferwithOTP=base_url+"/cashier/verify/otp";
	public static String canceltransfer=base_url+"/cashier/transfer/cancel";
	public static String ResentbtOTP=base_url+"/cashier/resent/otp";

	//Transaction
	public static String gettransaction=base_url+"/cashier/transaction/list";
	public static String exporttransaction=base_url+"/cashier/transaction/export";

	//Bet ticket code
	public static String tempbetdetils=base_url+"/cashier/get/temp/bet/details";
	public static String PlaceBetByCashier=base_url+"/cashier/user/place/bet";

	//Shop transfer balance
	public static String shoptransferrequest=base_url+"/cashier/shop/transfer/request";
	public static String getshoptransferlist=base_url+"/cashier/shop/transfer/list";

	//Report
	public static String getbetreport=base_url+"/cashier/bet/report";
	public static String exportbetreport=base_url+"/cashier/bet/report/export";

	//Payout
	public static String playerpayout=base_url+"/cashier/bet/payout";

	//Bet Slip Check
	public static String getplayerbetdeatils=base_url+"/cashier/get/bet/details";
	public static String getclonebetdeatils=base_url+"/cashier/bet/copy/details";

	//Extra
	public static String getrole=base_url+"/cashier/role/list";
	public static String checklogin=base_url+"/cashier/login/check";
}
