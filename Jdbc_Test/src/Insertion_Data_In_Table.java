import  java.sql.*;

public class Insertion_Data_In_Table {
    public static void main(String[] args) throws ClassNotFoundException{
       String url="jdbc:mysql://127.0.0.1:3306/kafil";
       String username="root";
       String password="Alam@800";
       String query=" INSERT INTO Employees (EmployeeID, Name, JobTitle, Salary) VALUES (37, 'Dani Daniels   ', 'Vloger from Ut', 510000);";



        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver loaded Sucessfully: ");

        }catch(ClassNotFoundException e){
            System.out.println(e.getMessage());

        }
        try{
            Connection con=DriverManager.getConnection(url,username,password);
            System.out.println("Connection loaded sucessfully!!");
            Statement stat=con.createStatement();
            int rowsaffected=stat.executeUpdate(query);
            if(rowsaffected>0){
                System.out.println("Insert Succesfull."+rowsaffected+"row(S) affected.");

            }
            else{
                System.out.println("Insertion Failed!");
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
