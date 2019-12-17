package internal

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.main.TestCaseMain


/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */
public class GlobalVariable {
     
    /**
     * <p>Profile default : SE</p>
     */
    public static Object aFirstName
     
    /**
     * <p>Profile default : SA</p>
     */
    public static Object aSurName
     
    /**
     * <p>Profile default : Trading Name
Profile Preview : Trading Name</p>
     */
    public static Object CompanyName
     
    /**
     * <p>Profile default : Phone Number
Profile Preview : Phone Number</p>
     */
    public static Object ContactNumber
     
    /**
     * <p>Profile default : URL to compare with the starting URL before navigation, test that complete, and CAT link is clicked (for example) need to ensure dev is returned back to dev etc.
Profile Preview : URL to compare with the starting URL before navigation</p>
     */
    public static Object CurrentUrl
     
    /**
     * <p>Profile default : Datasheet location (needs to change to shared repo local) C:\\Users\\davidho\\Katalon Studio C:\\Users\\davidho\\Katalon Studio (THIS SEEMS RESOLVED NOW) 22&#47;08&#47;2019
Profile Preview : Datasheet location (needs to change to shared repo local)</p>
     */
    public static Object DataSheet_Location
     
    /**
     * <p>Profile default : Email Address
Profile Preview : Email</p>
     */
    public static Object EmailAddress
     
    /**
     * <p>Profile default : Full Name
Profile Preview : Name</p>
     */
    public static Object FullName
     
    /**
     * <p>Profile default : Used by the URL Handler from Starup Process, Correctio  of URL&#47;Discrepencies</p>
     */
    public static Object FUNCTION_AREA
     
    /**
     * <p>Profile default : Invalid format email</p>
     */
    public static Object Invalid_Email
     
    /**
     * <p>Profile default : Preview Members Area URL
Profile Checkatrade_Live : Live Members Area URL</p>
     */
    public static Object MembersURL
     
    /**
     * <p>Profile default : For Mobile Tetsing, Set this flat to true. Flag is set within CAT_Setup</p>
     */
    public static Object Mobile_Flag
     
    /**
     * <p>Profile default : Specific area within the Members Portal
Profile Preview_Members_Area : Specific area within the Members Portal</p>
     */
    public static Object PAGE
     
    /**
     * <p>Profile default : Password credentials for Members Area
Profile Preview_Members_Area : Member Login Password
Profile Trades_Sign_In_Dashboard : Password</p>
     */
    public static Object Password
     
    /**
     * <p>Profile default : URL_Handler Global, some of the links do go to the expected places, hence the handler</p>
     */
    public static Object Portal_Subfunction
     
    /**
     * <p>Profile default : Postcode</p>
     */
    public static Object postcode
     
    /**
     * <p>Profile default : Returned data after mobile simulation search</p>
     */
    public static Object Returns_Verification
     
    /**
     * <p>Profile default : Category
Profile Preview : Category</p>
     */
    public static Object TradeCategory
     
    /**
     * <p>Profile default : Live CAT Site&#47;preview&#47;dev test
Profile Checkatrade_Live : Live CAT Website
Profile Current_Dev_Test : Current Dev Test - Web Office
Profile Dev_Test : Dev Test
Profile Preview : Preview Environment
Profile Preview_Members_Area : Preview Members Area, URL not as expected, and not where the link from the home page directs you
Profile Trades_Sign_In_Dashboard : Direct link to Preview Dashboard
Profile Web_Office_Current : Current Environment Web Office URL
Profile Web_Office_Live : Web Office Live - Requires Login
Profile Web_Office_Preview : WebOffice Preview URL</p>
     */
    public static Object URL
     
    /**
     * <p>Profile default : User credentials for Members Area
Profile Preview_Members_Area : Member Login Username
Profile Trades_Sign_In_Dashboard : User Name</p>
     */
    public static Object Username
     
    /**
     * <p>Profile default : Alph Validation test data
Profile Preview : Alpha Test Data</p>
     */
    public static Object Validation_Data_Alpha
     
    /**
     * <p>Profile default : Numeric validation test data
Profile Preview : Validation Data Numeric</p>
     */
    public static Object Validation_Data_Numeric
     
    /**
     * <p>Profile default : Validation Data Special Characters
Profile Preview : Validation Data Special Characters</p>
     */
    public static Object Validation_Data_Special_Chars
     
    /**
     * <p>Profile default : Web Office URL
Profile Checkatrade_Live : Web Office URL</p>
     */
    public static Object WebOfficeURL
     
    /**
     * <p>Profile default : Fix the format error here Give Feedback - Recommend? true OR false
Profile Preview : Fix the format error here Give Feedback - Recommend? true OR false</p>
     */
    public static Object YE_Recommendations
     
    /**
     * <p>Profile Checkatrade_Live : Row count on spread sheet iterator</p>
     */
    public static Object row
     
    /**
     * <p>Profile Checkatrade_Live : Flag to run configured test, designed for 1 iteration, to run multiple iterations.</p>
     */
    public static Object Standalone_TC_Execution
     
    /**
     * <p>Profile Preview : Postcode</p>
     */
    public static Object Postcode
     
    /**
     * <p>Profile Preview : Invalid emil address with space and format issue</p>
     */
    public static Object Invalid_EMail
     

    static {
        try {
            def selectedVariables = TestCaseMain.getGlobalVariables("default")
			selectedVariables += TestCaseMain.getGlobalVariables(RunConfiguration.getExecutionProfile())
            selectedVariables += RunConfiguration.getOverridingParameters()
    
            aFirstName = selectedVariables['aFirstName']
            aSurName = selectedVariables['aSurName']
            CompanyName = selectedVariables['CompanyName']
            ContactNumber = selectedVariables['ContactNumber']
            CurrentUrl = selectedVariables['CurrentUrl']
            DataSheet_Location = selectedVariables['DataSheet_Location']
            EmailAddress = selectedVariables['EmailAddress']
            FullName = selectedVariables['FullName']
            FUNCTION_AREA = selectedVariables['FUNCTION_AREA']
            Invalid_Email = selectedVariables['Invalid_Email']
            MembersURL = selectedVariables['MembersURL']
            Mobile_Flag = selectedVariables['Mobile_Flag']
            PAGE = selectedVariables['PAGE']
            Password = selectedVariables['Password']
            Portal_Subfunction = selectedVariables['Portal_Subfunction']
            postcode = selectedVariables['postcode']
            Returns_Verification = selectedVariables['Returns_Verification']
            TradeCategory = selectedVariables['TradeCategory']
            URL = selectedVariables['URL']
            Username = selectedVariables['Username']
            Validation_Data_Alpha = selectedVariables['Validation_Data_Alpha']
            Validation_Data_Numeric = selectedVariables['Validation_Data_Numeric']
            Validation_Data_Special_Chars = selectedVariables['Validation_Data_Special_Chars']
            WebOfficeURL = selectedVariables['WebOfficeURL']
            YE_Recommendations = selectedVariables['YE_Recommendations']
            row = selectedVariables['row']
            Standalone_TC_Execution = selectedVariables['Standalone_TC_Execution']
            Postcode = selectedVariables['Postcode']
            Invalid_EMail = selectedVariables['Invalid_EMail']
            
        } catch (Exception e) {
            TestCaseMain.logGlobalVariableError(e)
        }
    }
}
