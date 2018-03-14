package lk.raneesh.csacwk.utility;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import lk.raneesh.csacwk.databaseconnector.DatabaseConnection;

/**
 *
 * @author Raneesh Gomez
 */
public class UserValidation {

    private static Connection dbConn = DatabaseConnection.dbConnection();

    public static boolean validateUsername(String loginId) {
        boolean isLoginIdValid = false;
        String dbLoginId = "";

        try {
            // TODO add your handling code here:
            Statement stmt = (Statement) dbConn.createStatement();

            String insert_sql = "SELECT username FROM users WHERE username = '" + loginId + "'";

            ResultSet rs = stmt.executeQuery(insert_sql);
            while (rs.next()) {
                dbLoginId = rs.getString("username");
                System.out.println(dbLoginId);
            }

        } catch (SQLException ex) {
            Logger.getLogger(UserValidation.class.getName()).log(Level.SEVERE, null, ex);
        }

        if (dbLoginId.equals("")) {
            if (loginId.length() < 30) {
                isLoginIdValid = true;
            } else {
                showError("Login ID is too long! Please keep it below 30 characters");
            }
        } else {
            showError("Username already exists! Please choose another");
        }

        return isLoginIdValid;
    }
    
    public static boolean validatePassword(char[] password, char[] confirmPassword) {
        boolean isPasswordValid = false;
        
        if (String.valueOf(password).equals(String.valueOf(confirmPassword))) {
            isPasswordValid = true;
        }
        else {
            showError("Passwords do not match! Please try again.");
        }
        return isPasswordValid;
    }
    

    public static boolean validateNickname(String nickname) {
        boolean isNicknameValid = false;

        if (nickname.length() < 20) {
            isNicknameValid = true;
        } else {
            UserValidation.showError("Nickname is too long! Please keep it below 20 characters");
        }
        return isNicknameValid;
    }

    public static void showError(String errorMessage) {
        new JOptionPane().showMessageDialog(null, errorMessage, "Registration Failure", JOptionPane.ERROR_MESSAGE);
    }

}
