package dbUtil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

    public class dbConnection {
        private static final String SQCCNN = "jdbc:sqlite:mit.sqllite";


        private  static Connection getConntion() throws SQLException {
            try {
                Class.forName("org.sqlite.JDBC");
                return DriverManager.getConnection(SQCCNN);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();

            }
            return null;

        }//class
