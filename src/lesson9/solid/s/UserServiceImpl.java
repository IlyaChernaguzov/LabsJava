package lesson9.solid.s;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class UserServiceImpl implements UserService {

    private static Connection connection;

    @Override
    public void registerUser(User user) {
        //проверить email

        //сохранить в бд

        create(user);

        //отправка email об успешной регистрации пользователю

    }

    private boolean create(User user) {
        boolean isModifiedRows = false;
        try {
            Connection connection = getConnection();
            PreparedStatement preparedStatement =
                    connection.prepareStatement("INSERT INTO user (email) VALUES(?)");
            preparedStatement.setString(1, user.getEmail());

            if (preparedStatement.executeUpdate() > 0)
                isModifiedRows = true;

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return isModifiedRows;
    }

    private Connection getConnection() {
        if(connection == null){
            ResourceBundle resourceBundle = ResourceBundle.getBundle("application");
            String driver = resourceBundle.getString("driver");
            String url = resourceBundle.getString("url");
            String username = resourceBundle.getString("username");
            String password = resourceBundle.getString("password");

            try {
                Class.forName(driver);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }

            try {
                connection = DriverManager.getConnection(url, username, password);
            } catch (SQLException e) {
                e.printStackTrace();
            }

            return connection;

        }

        return connection;
    }
}
