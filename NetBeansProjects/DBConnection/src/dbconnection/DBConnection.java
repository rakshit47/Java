package dbconnection;
import java.sql.*;
import java.util.Scanner;

public class DBConnection {
    
    static Scanner sc = new Scanner(System.in);
    
    public static Connection con(){
        Connection con=null;
        try{
//            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/dbconnection?","root","");
            System.out.println("Database Connected");
        }catch(Exception e){
            System.out.println("Connection Failed");
        }
        return con;
    }
    
    public static void createTable() throws Exception{
        try{
            Connection con=con();
            PreparedStatement create=con.prepareStatement("CREATE TABLE IF NOT EXISTS bit(roll varchar(11),name varchar(255),branch varchar(255))");
            create.executeUpdate();
        }catch(Exception e){
            System.out.println(e);
        }finally{
            System.out.println("Function Completed: Table Created");
        }
        
    }
    public static void insertVal() throws Exception{
        try{
            Connection con=con();
            System.out.println("Enter your name");
            String name = sc.nextLine();
            System.out.println("Enter your roll");
            String roll = sc.nextLine();
            System.out.println("Enter your branch");
            String branch = sc.nextLine();
            System.out.println("Inserting Data...");
            PreparedStatement insert=con.prepareStatement("INSERT INTO bit VALUES('"+roll+"','"+name+"','"+branch+"')");
            insert.executeUpdate();
        }catch(Exception e){
            System.out.println(e);
        }finally{
            System.out.println("Function Completed: Value Inserted");
        }
        
    }
    public static void deleteVal() throws Exception{
        try{
            Connection con=con();
            System.out.println("Enter roll to be deleted");
            String roll= sc.nextLine();
            PreparedStatement delete=con.prepareStatement("DELETE FROM bit WHERE roll='"+roll+"'");
            delete.executeUpdate();
        }catch(Exception e){
            System.out.println(e);
        }finally{
            System.out.println("Function Completed: Value Deleted");
        }
        
    }
    public static void display() throws Exception{
        try{
            Connection con=con();
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("SELECT * FROM bit");
            while(rs.next()){
                String name=rs.getString("name");
                String roll=rs.getString("roll");
                String branch=rs.getString("branch");
//                int semester=rs.getInt("semester");
                System.out.println(roll+" "+name+" "+branch);
            }
        }catch(Exception e){
            System.out.println(e);
        }finally{
            System.out.println("Function Completed: Data Displayed");
        }
        
    }
    
    public static void main(String args[]) throws Exception{
        con();
//        createTable();
//        insertVal();
//        deleteVal();  
//        display();
    }
            
}