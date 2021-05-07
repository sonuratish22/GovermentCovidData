package utill;

import java.sql.*;

public class JDBCConnector {

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        Connection connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sonu", "root", "mysql");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        System.out.println("Connection has been created succesfully");
        try {
            Statement statement = connection.createStatement();
            //statement.execute("select * from employee");
            ResultSet resultSet = statement.executeQuery("select count * from employee where ");
            while (resultSet.next()){
                int id = resultSet.getInt(1);
                String name = resultSet.getString("name");
                String email = resultSet.getString("email");
                double salary = resultSet.getDouble("salary");
                String department = resultSet.getString("department");
                System.out.println("id= "+ id + ", name: "+ name + ", email= " +email + ", salary= " + salary+ ", department: "+department );

            }
            System.out.println(resultSet);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }


    }
}
