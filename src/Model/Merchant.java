package Model;

/**
 *
 * @author Udesh Madawa
 */
public class Merchant {

    private String merchantName;
    private int countryCode;
    private String userName;
    private String password;

    public Merchant(String merchantName, int countryCode, String userName, String password) {
        this.merchantName = merchantName;
        this.countryCode = countryCode;
        this.userName = userName;
        this.password = password;

    }

    public String getMerchantName() {
        return merchantName;
    }

    public void setMerchantName(String merchantName) {
        this.merchantName = merchantName;
    }

    public int getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(int countryCode) {
        this.countryCode = countryCode;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
