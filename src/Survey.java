import javax.swing.*;
import java.awt.*;
import java.sql.SQLException;

public class Survey extends JFrame {
    Survey(){
        String imagePath = "C:\\Users\\ADMIN\\Desktop\\Nabila Files\\SurveySystem\\icon\\survey.jpg";
        ImageIcon imageIcon = new ImageIcon(imagePath);

        Image image = imageIcon.getImage().getScaledInstance(500, 500, Image.SCALE_DEFAULT);
        ImageIcon scaledImageIcon = new ImageIcon(image);

        JLabel imageLabel = new JLabel(scaledImageIcon);
        add(imageLabel);
        setSize(500,500);
        setVisible(true);
        setLocation(500,200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        try{
            Thread.sleep(2000);
            setVisible(false);
            new Login();
        }
        catch(Exception e){
            e.printStackTrace();
        }

    }

    public static void main(String args[]) throws SQLException {
        new Survey();
        Login login = new Login();
        login.loginView();
    }
}
