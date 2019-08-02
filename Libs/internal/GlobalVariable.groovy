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
            
        } catch (Exception e) {
            TestCaseMain.logGlobalVariableError(e)
        }
    }
}
