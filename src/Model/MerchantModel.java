
package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Udesh Madawa
 */
public class MerchantModel {
    DatabaseConnector dbConnector;
    public String addMerchant(Merchant merchant) {
        dbConnector = new DatabaseConnector();
        Connection connection = dbConnector.getConnection();
        String query = "INSERT INTO merchants(merchant_name,country_code,user_name,password) VALUES (?,?,?,?)";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setString(1, merchant.getMerchantName());
            stmt.setInt(2, merchant.getCountryCode());
            stmt.setString(3, merchant.getUserName());
            stmt.setString(4, merchant.getPassword());
            stmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {

        }
    
        return "Saved Succesfully..!";
    }
    
}
