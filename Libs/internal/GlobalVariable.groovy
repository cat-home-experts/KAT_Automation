package internal

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.main.TestCaseMain


/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */
public class GlobalVariable {
     
    /**
     * <p>Profile default : Live CAT Site&#47;preview&#47;dev test
Profile Checkatrade_Live : Live CAT Website
Profile Current_Dev_Test : Current Dev Test - Web Office
Profile Dev_Test : Dev Test
Profile Preview : Preview Environment
Profile Trades_Sign_In_Dashboard : Direct link to Preview Dashboard
Profile Web_Office_Live : Web Office Live - Requires Login</p>
     */
    public static Object URL
     
    /**
     * <p>Profile default : Email Address
Profile Preview : Email</p>
     */
    public static Object EmailAddress
     
    /**
     * <p>Profile default : Trading Name
Profile Preview : Trading Name</p>
     */
    public static Object CompanyName
     
    /**
     * <p>Profile default : Full Name
Profile Preview : Name</p>
     */
    public static Object FullName
     
    /**
     * <p>Profile default : Category
Profile Preview : Category</p>
     */
    public static Object TradeCategory
     
    /**
     * <p>Profile default : Postcode</p>
     */
    public static Object postcode
     
    /**
     * <p>Profile default : Phone Number
Profile Preview : Phone Number</p>
     */
    public static Object ContactNumber
     
    /**
     * <p>Profile default : Invalid format email</p>
     */
    public static Object Invalid_Email
     
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
     * <p>Profile default : URL to compare with the starting URL before navigation
Profile Preview : URL to compare with the starting URL before navigation</p>
     */
    public static Object CurrentUrl
     
    /**
     * <p>Profile default : Fix the format error here Give Feedback - Recommend? true OR false
Profile Preview : Fix the format error here Give Feedback - Recommend? true OR false</p>
     */
    public static Object YE_Recommendations
     
    /**
     * <p>Profile default : Datasheet location (needs to change to shared repo local)
Profile Preview : Datasheet location (needs to change to shared repo local)</p>
     */
    public static Object DataSheet_Location
     
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
     
    /**
     * <p>Profile Trades_Sign_In_Dashboard : User Name</p>
     */
    public static Object Username
     
    /**
     * <p>Profile Trades_Sign_In_Dashboard : Password</p>
     */
    public static Object Password
     

    static {
        try {
            def selectedVariables = TestCaseMain.getGlobalVariables("default")
			selectedVariables += TestCaseMain.getGlobalVariables(RunConfiguration.getExecutionProfile())
            selectedVariables += RunConfiguration.getOverridingParameters()
    
            URL = selectedVariables['URL']
            EmailAddress = selectedVariables['EmailAddress']
            CompanyName = selectedVariables['CompanyName']
            FullName = selectedVariables['FullName']
            TradeCategory = selectedVariables['TradeCategory']
            postcode = selectedVariables['postcode']
            ContactNumber = selectedVariables['ContactNumber']
            Invalid_Email = selectedVariables['Invalid_Email']
            Validation_Data_Alpha = selectedVariables['Validation_Data_Alpha']
            Validation_Data_Numeric = selectedVariables['Validation_Data_Numeric']
            Validation_Data_Special_Chars = selectedVariables['Validation_Data_Special_Chars']
            CurrentUrl = selectedVariables['CurrentUrl']
            YE_Recommendations = selectedVariables['YE_Recommendations']
            DataSheet_Location = selectedVariables['DataSheet_Location']
            row = selectedVariables['row']
            Standalone_TC_Execution = selectedVariables['Standalone_TC_Execution']
            Postcode = selectedVariables['Postcode']
            Invalid_EMail = selectedVariables['Invalid_EMail']
            Username = selectedVariables['Username']
            Password = selectedVariables['Password']
            
        } catch (Exception e) {
            TestCaseMain.logGlobalVariableError(e)
        }
    }
}
