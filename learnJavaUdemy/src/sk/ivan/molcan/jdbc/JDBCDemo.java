package sk.ivan.molcan.jdbc;

import java.sql.*;

public class JDBCDemo {

    public static void main(String[] args) {
//        String url = "jdbc:oracle:thin:@localhost:1521:xe","system","oracle";

        String url = "jdbc:mysql://127.0.0.1:3306/movies";
        try {
            //Establish Connection Object
            Connection conn = DriverManager.getConnection(url, "root", "");

            //Create a statement object to send to the database
            Statement statement = conn.createStatement();

            //Execute the statement object
//            ResultSet resultSet = statement.executeQuery("select * from employees_tbl;");

//            statement.execute("insert into employees_tbl values(" +
//                    "800, 'Juliet', 'Sales', 5500);");

            statement.executeUpdate("delete from employees_tbl where id = 800");

            //Process the result
//            int salaryTotal = 0;
//            while(resultSet.next()){
//                salaryTotal += resultSet.getInt("salary");
//            }

//            System.out.println(salaryTotal);

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }

}
