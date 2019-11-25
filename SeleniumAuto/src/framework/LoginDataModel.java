package framework;

import java.util.HashMap;

import excel.ExcelLibrary;

/**
 * @author Ashutosh Srivastava
 * Created by ashutosh.kaystha@gmail.com on 25/11/2019
 */
public class LoginDataModel extends BaseTest implements LoginOjectPageCollection {
	
	public static ExcelLibrary loginDetails = new ExcelLibrary(LOGIN_TEST_DATA);
	
	/*
	 * This Data Model class is reponsible to fetch data from Excel sheet
	 * and convert those data in Key Value pair to use further in Framework	
	 */
	public static HashMap<String, String> loginData()
	{
		HashMap<String , String > login = new HashMap<String, String>();
		login.put("Username", loginDetails.getCellValue(0,1));
		login.put("Password", loginDetails.getCellValue(0,2));
		return login;
		
	}

}
