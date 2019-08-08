package internal

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.main.TestCaseMain


/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */
public class GlobalVariable {
     
    /**
     * <p>Profile default : Live CAT Site
Profile Checkatrade_Live : Live CAT Website
Profile Current_Dev_Test : Current Dev Test 
Profile Dev_Test : Dev Test
Profile Preview : Preview Environment
Profile Trades_Sign_In_Dashboard : Direct link to Preview Dashboard
Profile Web_Office_Live : Web Office Live - Requires Login</p>
     */
    public static Object URL
     
    /**
     * <p>Profile Checkatrade_Live : Row count on spread sheet iterator</p>
     */
    public static Object row
     
    /**
     * <p>Profile Checkatrade_Live : Flag to run configured test, designed for 1 iteration, to run multiple iterations.</p>
     */
    public static Object Standalone_TC_Execution
     
    /**
     * <p>Profile Preview : Email</p>
     */
    public static Object EmailAddress
     
    /**
     * <p>Profile Preview : Trading Name</p>
     */
    public static Object CompanyName
     
    /**
     * <p>Profile Preview : Name</p>
     */
    public static Object FullName
     
    /**
     * <p>Profile Preview : Category</p>
     */
    public static Object TradeCategory
     
    /**
     * <p>Profile Preview : Postcode</p>
     */
    public static Object Postcode
     
    /**
     * <p>Profile Preview : Phone Number</p>
     */
    public static Object ContactNumber
     
    /**
     * <p>Profile Preview : Invalid emil address with space and format issue</p>
     */
    public static Object Invalid_EMail
     
    /**
     * <p>Profile Preview : Alpha Test Data</p>
     */
    public static Object Validation_Data_Alpha
     
    /**
     * <p>Profile Preview : Validation Data Numeric</p>
     */
    public static Object Validation_Data_Numeric
     
    /**
     * <p>Profile Preview : Validation Data Special Characters</p>
     */
    public static Object Validation_Data_Special_Chars
     
    /**
     * <p>Profile Preview : URL to compare with the starting URL before navigation</p>
     */
    public static Object CurrentUrl
     
    /**
     * <p>Profile Preview : Fix thre format error here Give Feedback - Recommend? true OR false</p>
     */
    public static Object YE_Recommendations
     
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
            row = selectedVariables['row']
            Standalone_TC_Execution = selectedVariables['Standalone_TC_Execution']
            EmailAddress = selectedVariables['EmailAddress']
            CompanyName = selectedVariables['CompanyName']
            FullName = selectedVariables['FullName']
            TradeCategory = selectedVariables['TradeCategory']
            Postcode = selectedVariables['Postcode']
            ContactNumber = selectedVariables['ContactNumber']
            Invalid_EMail = selectedVariables['Invalid_EMail']
            Validation_Data_Alpha = selectedVariables['Validation_Data_Alpha']
            Validation_Data_Numeric = selectedVariables['Validation_Data_Numeric']
            Validation_Data_Special_Chars = selectedVariables['Validation_Data_Special_Chars']
            CurrentUrl = selectedVariables['CurrentUrl']
            YE_Recommendations = selectedVariables['YE_Recommendations']
            Username = selectedVariables['Username']
            Password = selectedVariables['Password']
            
        } catch (Exception e) {
            TestCaseMain.logGlobalVariableError(e)
        }
    }
}
