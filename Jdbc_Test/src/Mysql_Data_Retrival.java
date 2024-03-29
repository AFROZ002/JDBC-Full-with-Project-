import  java.sql.*;

public class Mysql_Data_Retrival {
    public static void main(String[] args) throws ClassNotFoundException{
       String url="jdbc:mysql://127.0.0.1:3306/kafil";
       String username="root";
       String password="Alam@800";
       String query="SELECT * FROM Employees";



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
           ResultSet rs=stat.executeQuery(query);
           while(rs.next()){
               int Id=rs.getInt("EmployeeID");
               String name=rs.getString("Name");
               String   jt=rs.getString("JobTitle");
               int salary=rs.getInt("Salary");
               System.out.println();
               System.out.println("====================================");
               System.out.println("Id:"+Id);
               System.out.println("Name:"+name);
               System.out.println("Job_title"+jt);
               System.out.println("Salary:"+salary);
           }
           rs.close();
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
