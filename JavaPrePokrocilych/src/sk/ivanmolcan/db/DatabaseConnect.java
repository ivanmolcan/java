package sk.ivanmolcan.db;

import java.sql.*;

public class DatabaseConnect {

    public static void main(String[] args) throws SQLException {
        try{
            Class.forName("com.mysql.jdbc.Driver");
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }
        String user = "root";
        String password = "";
        String host = "localhost";
        String port = "3306";
        String dbname = "movies";
        Connection connection = null;
        Statement st = null;
        long id = 101;

        try {
            connection =
                DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/movies?characterEncoding=UTF-8", user, password);
            connection.setAutoCommit(false);

            st = connection.createStatement();
            ResultSet rs = st.executeQuery("Select * from osoba");

            String query = "Select * from osoba where id = " + id;
            String query2 = String.format("Select * from osoba where id = %d", id);
            StringBuilder query3 = new StringBuilder("Select * from osoba where id=").append(id);

            PreparedStatement statement =
                    connection.prepareStatement("Insert into osoba(Meno, Vek, Datum_narodenia)" +
                            " values()");
            statement.setString(1, "Jaro");
            statement.setInt(2, 30);
            statement.setDate(3, new java.sql.Date(new java.util.Date().getTime()));
            statement.executeQuery();

            while(rs.next()){
                String meno = rs.getString(1);
                int vek = rs.getInt("AGE");
            }

            connection.commit();

        } catch (SQLException throwables) {
            try {
                connection.rollback();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            throwables.printStackTrace();
        } finally {
            if(st!= null){
                st.close();
                connection.close();
            }
        }
    }
}
