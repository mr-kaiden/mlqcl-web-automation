package mlhuillier.qcl.utilities;

import org.jboss.aerogear.security.otp.Totp;

import static mlhuillier.qcl.testSteps.BaseClass.accountCredential;

public class TOTPGenerator {

    public static String getTwoFactorCode(){
        Totp totp = new Totp("add here the google token");
        String twoFactorCode = totp.now();
        return twoFactorCode;
    }
}
