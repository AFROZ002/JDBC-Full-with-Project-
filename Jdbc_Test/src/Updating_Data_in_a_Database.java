
import  java.sql.*;
public class Updating_Data_in_a_Database {
    public static void main(String[] args) throws ClassNotFoundException{
        String url="jdbc:mysql://127.0.0.1:3306/kafil";
        String username="root";
        String password="Alam@800";
        String query="UPDATE Employees SET  JobTitle='Front_End_Developer' WHERE EmployeeID = 4;";



        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver loaded Sucessfully: ");

        }catch(ClassNotFoundException e){
            System.out.println(e.getMessage());

        }
        try{
            Connection con= DriverManager.getConnection(url,username,password);
            System.out.println("Connection loaded sucessfully!!");
            Statement stat=con.createStatement();
            int rowsaffected=stat.executeUpdate(query);
            if(rowsaffected>0){
                System.out.println("Updation Succesfully ."+rowsaffected+"row(S) affected.");

            }
            else{
                System.out.println("Updation  Failed!");
            }


//           rs.close();
            stat.close();
            con.close();
            System.out.println();
            System.out.println("Connection close Succesfully");
        }
        catch(SQLException e){
            System.out.println(e.getMessage());
        }


    }
}
