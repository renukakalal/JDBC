package com.xworkz.jdbc.readoperation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import com.xworkz.enumclass.read.ReadOpeartionEnum;

public class ReadOpeartion
{


	public static void main(String[] args)
	{
		
		String insertQuery="insert into stu_details values(9,'ishan','ishan@gmail.com','ishan123',54,'35000',945690834,'java','2024','python')";
		String insertQuery1="insert into stu_details values(11,'shraddakapoor','shraddakapoor@gmail.com','shraddakapoor123',75,'34000',867345048,'kalburgi','2024','python')";
		String insertQuery2="insert into stu_details values(12,'alia','alia@gmail.com','alia123',67,'22000',898648933,'mumbai','2024','webdevelopment')";
		String insertQuery3="insert into stu_details values(13,'isha','isha@gmail.com','isha123',69,'35000',680370373,'jammu','2024','datascientest')";
		String insertQuery4="insert into stu_details values(14,'saraalikhan','saraalikhan@gmail.com','saraalikhan123',62,'73000',786435973,'hydrabad','2024','python')";
		String insertQuery5="insert into stu_details values(15,'varun','varun@gmail.com','varun123',35,'89000',890747736,'delhi','2024','AI')";
		String insertQuery6="insert into stu_details values(16,'kajalagrval','kajalagrval@gmail.com','kajalagrval123',62,'73000',786435973,'chennai','2024','java')";
		String insertQuery8="insert into stu_details values(17,'prabhas','prabhas@gmail.com','prabhas123',99,'24000',859645740,'delhi','2024','javadevelopment')";
		String insertQuery7="insert into stu_details values(18,'sundar','sundar@gmail.com','sundar123',62,'73000',87569477,'delhi','2024','java')";
		String insertQuery9="insert into stu_details values(19,'deependraghoyal','deependraghoyal@gmail.com','deependraghoyal123',62,'73000',78643597,'kalkatta','2024','java')";
		String insertQuery10="insert into stu_details values(20,'viratkohli','viratkohli@gmail.com','viratkohli123',68,'89075655',857967605,'delhi','2024','datascience')";
		
		Connection connection=null;
		
		try {
		connection=DriverManager.getConnection(ReadOpeartionEnum.URL.getValue(),ReadOpeartionEnum.USERNAME.getValue(),ReadOpeartionEnum.PASSWORD.getValue());
		Statement statement=connection.createStatement();
		
		statement.executeUpdate(insertQuery1);
		statement.executeUpdate(insertQuery2);
		statement.executeUpdate(insertQuery3);
		statement.executeUpdate(insertQuery4);
		statement.executeUpdate(insertQuery5);
		statement.executeUpdate(insertQuery6);
		statement.executeUpdate(insertQuery7);
		statement.executeUpdate(insertQuery9);
		statement.executeUpdate(insertQuery8);
		statement.executeUpdate(insertQuery10);
		
		
		
		if(connection!=null)
		{
			System.out.println("this is connected");
		}
		else
		{
			System.out.println("this is not connected");
		}
		}
		catch(Exception e)
		{
		e.printStackTrace();	
		}

}

	
}
    	



	
        
            
                
            
        


