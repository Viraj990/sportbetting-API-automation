package iGuru.Sportsbook.BIP.Routes;

public class UserRoutes {

	//public static String base_url="https://api.onlinegamblingtech.com/api";
		public static String base_url="http://api.onlinegamblingtech.com/api";
//		public static String local="http://192.168.1.7:5000/api";
		
		
		//Authentication (auth) URL

		public static String register=base_url+"/auth/register";
		public static String otpverification=base_url+"/auth/user/verify/otp";
		public static String resendotp=base_url+"/auth/user/resent/otp";
		public static String canceluser=base_url+"/auth/user/cancel";
		public static String login=base_url+"/auth/login";
		public static String getticketdetails=base_url+"/auth/ticket/detail";
		public static String forgetpassword=base_url+"/auth/forgot/password";
		public static String getsystemsetting=base_url+"/auth/system/setting/list";
		
		//Pre-match URL
		public static String getprematchlist=base_url+"/auth/prematch/fixtures";
		public static String getprematchdetails=base_url+"/auth/prematch/fixtures/detail/177557";
		public static String getlastminute=base_url+"/auth/prematch/last-minute/fixtures";
		public static String prematchcalendar=base_url+"/auth/prematch/calendar";
		
		//TopLeague & sportBook
		public static String GetTopLeague=base_url+"/auth/topleagues/get";
		public static String GetTopLeagueDetail=base_url+"/auth/topleagues/detail/9";
		public static String MobileGetTopLeague=base_url+"/auth/mobile/topleagues/get";

		//Sports book	
		public static String getsportbook=base_url+"/auth/sports/get";
		public static String sportbooklist=base_url+"/auth/sports/list";
		public static String MobileGetSportBooks=base_url+"/auth/mobile/sports/get";
		public static String MobileGetSportBooksList=base_url+"/auth/mobile/sports/get";
		
		//User
		public static String GetTicketlist=base_url+"/user/tickets";
		public static String GetTicketlistdetails=base_url+"/user/ticket/detail";
		public static String gettransactionlist=base_url+"/user/transactions";
		public static String placedbet=base_url+"/user/place/bet";
		public static String userlogintokencheck=base_url+"/user/login/check";
		public static String getuserprofile=base_url+"/user/profile/detail";
		public static String updateuserprofile=base_url+"/user/profile/update";
		
		//Offline User
		public static String savebet=base_url+"/auth/save/bet";
}
