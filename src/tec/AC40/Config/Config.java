package tec.AC40.Config;

public class Config 
{
	public static String BrowserEnvironment ="local"; 
	public static String url = "http://sqm.tecra.com/acqa/#/";  //Main URL http://192.168.1.121/acv52/#/
	public static String LayoutType = "Layout1";  	// Classic Layout1 Layout2
	public static String browser = "GC";  // FF GC IE																																						
	public static String ReleaseNo = "TEC-ACC-4.0-1.35";  // Release patch Number
	public static String Currency = "$";  // Currency symbol Classic
	public static String PercentageSymbol = "%";  // Percentage symbol
	public static int ElementWaitTime = 300; 			   // Explicit wait time in seconds
	
	public static String TakeScreenShot = "Yes";         // YES yes Yes NO (other than Yes it is not taken screen shots)
	public static String IsConsoleErrorSave = "yes";  // Yes yes YES and NO
	public static String IsAdjustMOuse = "Yes"; 		   // YES yes no NO
	public static String ExecutionStartRow = "41";      // Any number (it must be equal or less than the Execution End row value)
	public static String ExecutionEndRow = "50";      // Any number or n (IF we enter n, it indicates last row of the Data sheet) 
	public static Integer[] SelectedRows ={41};              // 89,90,94,95,96,101,103,104,105 to execute for selected test cases, if it empty above ranges will work  

	public static String ProductPriceCode = "price1";   // Product Price code
	public static String AddonPriceCode = "addon";	    // Add-on price code
	public static String ShippingPriceCode = "price3"; 
	public static String LandingPriceCode = "price4";  

	// Shipping Price code
	public static String DiscountName = "Discount1";		         // Discount Name
	public static String DiscountName2 = "Discount2";		     // Discount Name
	public static String CouponCodeName = "couponcode"; // Coupon code Name
	public static String PostageName = "postage1";	             // Postage price name
	public static String PricingList10 = "pricing list10";              // 10 records list name
	public static String PricingList7 = "pricing list7";	                 // 7 Records list name
	public static String PricingList2 = "pricing list2";
	public static String PricingList3 = "pricing list3";
	public static String PromotionCode = "Coupon81";

	

	// Layout1 users Details
	public static String UserNamel1 = "atuserr1";
	public static String UserPwdl1 = "welcome";
	public static String AdminNamel1 = "atadminr1";	
	public static String AdminPwdl1 = "welcome";
	public static String ApproverNamel1 = "atappr1";
	public static String ApproverPwdl1 = "welcome";
	public static String PSNamel1 = "atpsr1";
	public static String PSPwdl1 = "welcome";
	public static String CutomUserNamel1 = "test";
	public static String CustomUserPwdl1 = "welcome";





	
	
	
}
