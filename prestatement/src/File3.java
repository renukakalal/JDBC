import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.xworkz.enumprestatement.RegisterEnum;

public class File3 {

	public static void main(String[] args) {
         
		
	
			try {
				Connection connection=null;
				
				PreparedStatement prst=null;
				
				connection=DriverManager.getConnection(RegisterEnum.URL.getValue(),RegisterEnum.USERNAME.getValue(),RegisterEnum.PASSWORD.getValue());
		       
				prst=connection.prepareStatement("insert into new_table values(?,?,?,?)");
				
				prst.setInt(1,1);
				prst.setString(2,"swapna");
				prst.setString(3,"pizza");
				prst.setInt(4,5000);
				
				prst.setInt(1,2);
				prst.setString(2,"viswa");
				prst.setString(3,"pizza");
				prst.setInt(4,6000);
				
				
				prst.setInt(1,3);
				prst.setString(2,"karan");
				prst.setString(3,"dosa");
				prst.setInt(4,7000);
				
				prst.setInt(1,4);
				prst.setString(2,"samanta");
				prst.setString(3,"burger");
				prst.setInt(4,8000);
				
				
				prst.setInt(1,5);
				prst.setString(2,"vijay");
				prst.setString(3,"burger");
				prst.setInt(4,9000);
				
				prst.setInt(1,6);
				prst.setString(2,"veeresh");
				prst.setString(3,"pizza");
				prst.setInt(4,5600);
				
				prst.setInt(1,7);
				prst.setString(2,"pishush");
				prst.setString(3,"idli");
				prst.setInt(4,3000);
				
				prst.setInt(1,8);
				prst.setString(2,"mani");
				prst.setString(3,"biryani");
				prst.setInt(4,5000);
				
				prst.setInt(1,9);
				prst.setString(2,"priyanka");
				prst.setString(3,"pepsi");
				prst.setInt(4,5500);
				
				prst.setInt(1,10);
				prst.setString(2,"virat");
				prst.setString(3,"fingerchips");
				prst.setInt(4,5800);
				
				prst.setInt(1,11);
				prst.setString(2,"pandya");
				prst.setString(3,"pizza");
				prst.setInt(4,3000);
				
				prst.setInt(1,12);
				prst.setString(2,"pandya");
				prst.setString(3,"dosa");
				prst.setInt(4,2500);
				
				
				prst.setInt(1,13);
				prst.setString(2,"rohit");
				prst.setString(3,"jamun");
				prst.setInt(4,500);
				
				prst.setInt(1,14);
				prst.setString(2,"paru");
				prst.setString(3,"weg rice");
				prst.setInt(4,500);
				
				prst.setInt(1,15);
				prst.setString(2,"srishti");
				prst.setString(3,"rumalroti");
				prst.setInt(4,500);

				
				
				
				
				
				
			
				
				
				

				
				
								
				
				
				
				
				
				
				
				
			
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
		         
				int value=prst.executeUpdate();
				
				if(value>0)
				{
					System.out.println("saved");
				}
				else
				{
					System.out.println(" not saved");	
				}
				}
				catch(SQLException e) {
					e.printStackTrace();
				}
			}


	}


