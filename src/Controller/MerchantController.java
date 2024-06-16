
package Controller;

import Model.Merchant;
import Model.MerchantModel;
import View.LoginScreen;
import View.RegisterAsMerchantView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Udesh Madawa
 */
public class MerchantController {

    private RegisterAsMerchantView view;
    private MerchantModel model;

    public MerchantController(RegisterAsMerchantView view , MerchantModel model) {
        this.view = view;
        this.model = model;
    }
    
    public void registerAction() {
        
        String fname = view.getFirstName();
        int contry = view.getCountry();
        String uname = view.getUserName();
        String pwrd = view.getPassword();

        if (fname.equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(view, "Full Name Can Not Be Empty !");
        } else if (uname.equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(view, "Usename Can Not Be Empty !");
        } else if (pwrd.equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(view, "Password Can Not Be Empty !");
        } else {

            Merchant merchant = new Merchant(fname, contry, uname, pwrd);
            String msg = model.addMerchant(merchant);
            int input = JOptionPane.showOptionDialog(null, msg, "Info", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, null, null);

            if (input == JOptionPane.OK_OPTION) {
                new LoginScreen().setVisible(true);
                view.setVisible(false);
            }
        }

    
    }
    
}
