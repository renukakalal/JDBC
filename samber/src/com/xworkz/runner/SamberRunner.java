package com.xworkz.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.xworkz.enumclass.Idli;
import com.xworkz.samber.dto.SamberDTO;

public class SamberRunner {
	public static void main(String args[]) {
		SamberDTO sambarDTO1 = new SamberDTO(1, "Traditional South Indian Sambar", 150, "Madurai","Toor Dal Tamarind Vegetables", "Spicy", "Tangy", 2, "Golden Brown", "Sambar Magic");
		SamberDTO sambarDTO2=new SamberDTO(2, "Udupi Style Sambar", 130.00, "Udupi", "Toor Dal, Coconut, Tamarind, Vegetables", "Mild", "Sweet and Tangy", 3, "Light Brown", "Udupi Delight");
		SamberDTO sambarDTO3=new SamberDTO(3, "Kerala Sambar", 140.00, "Kochi", "Toor Dal, Tamarind, Vegetables, Coconut Oil", "Mild", "Earthy and Tangy", 2, "Golden", "Kerala Special");
		 SamberDTO sambarDTO4=new SamberDTO(4, "Andhra Sambar", 160.00, "Vijayawada", "Toor Dal, Tamarind, Spicy Vegetables", "Very Spicy", "Hot and Tangy", 3, "Red-Brown", "Andhra Delight");
		 SamberDTO sambarDTO5=new SamberDTO(5, "Mysore Sambar", 155.50, "Mysore", "Toor Dal, Tamarind, Vegetables, Jaggery", "Spicy and Sweet", "Sweet and Tangy", 1, "Golden Brown", "Mysore Magic");
		 SamberDTO sambarDTO6=new SamberDTO(6, "Mumbai Sambar", 145.00, "Mumbai", "Toor Dal, Tamarind, Potatoes, Carrots", "Medium Spicy", "Tangy and Mildly Sweet", 2, "Dark Brown", "Mumbai Spice");
		 SamberDTO sambarDTO7= new SamberDTO(7, "Hyderabadi Sambar", 175.00, "Hyderabad", "Toor Dal, Tamarind, Coriander", "Spicy", "Rich and Tangy", 4, "Reddish Brown", "Hyderabad Heritage");
		 SamberDTO sambarDTO8= new SamberDTO(8, "Tamil Brahmin Sambar", 125.50, "Chennai", "Toor Dal, Tamarind, Vegetables, Curry Leaves", "Mild", "Subtle and Tangy", 1, "Light Yellow", "Brahmin Sambar");
		 SamberDTO sambarDTO9=new SamberDTO(9, "Gujarati Dal Sambar", 135.00, "Ahmedabad", "Toor Dal, Tamarind, Sweet Vegetables", "Mild", "Sweet and Tangy", 3, "Golden Yellow", "Gujarati Delight");
		 SamberDTO sambarDTO10=new SamberDTO(10, "Karnataka Style Huli", 150.00, "Bangalore", "Toor Dal, Coconut, Tamarind, Spicy Vegetables", "Spicy", "Savory and Tangy", 3, "Golden Orange", "Bangalore Special");
		 
		 
		 
		 
		 Connection connection = null;
		PreparedStatement pstmt = null;

		try {
			connection = DriverManager.getConnection(Idli.URL.getValue(), Idli.USERNAME.getValue(),Idli.PASSWORD.getValue());

			// Ensure the SQL statement is correct and has all placeholders
			pstmt = connection.prepareStatement("INSERT INTO new_table VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");

			pstmt.setInt(1, sambarDTO1.getId());
			pstmt.setString(2, sambarDTO1.getSamberName());
			pstmt.setDouble(3, sambarDTO1.getPrice());
			pstmt.setString(4, sambarDTO1.getFamousPlace());
			pstmt.setString(5, sambarDTO1.getSamberIngredients());
			pstmt.setString(6, sambarDTO1.getSamberType());
			pstmt.setString(7, sambarDTO1.getFlavor());
			pstmt.setInt(8, sambarDTO1.getSamberQuantity());
			pstmt.setString(9, sambarDTO1.getSamberColor());
			pstmt.setString(10, sambarDTO1.getSamberBrand());
			
			   pstmt.setInt(1, sambarDTO2.getId());
	           pstmt.setString(2, sambarDTO2.getSamberName());
	           pstmt.setDouble(3, sambarDTO2.getPrice());
	           pstmt.setString(4, sambarDTO2.getFamousPlace());
	           pstmt.setString(5, sambarDTO2.getSamberIngredients());
	           pstmt.setString(6, sambarDTO2.getSamberType());
	           pstmt.setString(7, sambarDTO2.getFlavor());
	           pstmt.setInt(8, sambarDTO2.getSamberQuantity());
	           pstmt.setString(9, sambarDTO2.getSamberColor());
	           pstmt.setString(10, sambarDTO2.getSamberBrand());
	           
	           
	           pstmt.setInt(1, sambarDTO3.getId());
	           pstmt.setString(2, sambarDTO3.getSamberName());
	           pstmt.setDouble(3, sambarDTO3.getPrice());
	           pstmt.setString(4, sambarDTO3.getFamousPlace());
	           pstmt.setString(5, sambarDTO3.getSamberIngredients());
	           pstmt.setString(6, sambarDTO3.getSamberType());
	           pstmt.setString(7, sambarDTO3.getFlavor());
	           pstmt.setInt(8, sambarDTO3.getSamberQuantity());
	           pstmt.setString(9, sambarDTO3.getSamberColor());
	           pstmt.setString(10, sambarDTO3.getSamberBrand());
	           
	           pstmt.setInt(1, sambarDTO4.getId());
	           pstmt.setString(2, sambarDTO4.getSamberName());
	           pstmt.setDouble(3, sambarDTO4.getPrice());
	           pstmt.setString(4, sambarDTO4.getFamousPlace());
	           pstmt.setString(5, sambarDTO4.getSamberIngredients());
	           pstmt.setString(6, sambarDTO4.getSamberType());
	           pstmt.setString(7, sambarDTO4.getFlavor());
	           pstmt.setInt(8, sambarDTO4.getSamberQuantity());
	           pstmt.setString(9, sambarDTO4.getSamberColor());
	           pstmt.setString(10, sambarDTO4.getSamberBrand());
	           
	           
	           pstmt.setInt(1, sambarDTO5.getId());
	           pstmt.setString(2, sambarDTO5.getSamberName());
	           pstmt.setDouble(3, sambarDTO5.getPrice());
	           pstmt.setString(4, sambarDTO5.getFamousPlace());
	           pstmt.setString(5, sambarDTO5.getSamberIngredients());
	           pstmt.setString(6, sambarDTO5.getSamberType());
	           pstmt.setString(7, sambarDTO5.getFlavor());
	           pstmt.setInt(8, sambarDTO5.getSamberQuantity());
	           pstmt.setString(9, sambarDTO5.getSamberColor());
	           pstmt.setString(10, sambarDTO5.getSamberBrand());
	           
	           pstmt.setInt(1, sambarDTO6.getId());
	           pstmt.setString(2, sambarDTO6.getSamberName());
	           pstmt.setDouble(3, sambarDTO6.getPrice());
	           pstmt.setString(4, sambarDTO6.getFamousPlace());
	           pstmt.setString(5, sambarDTO6.getSamberIngredients());
	           pstmt.setString(6, sambarDTO6.getSamberType());
	           pstmt.setString(7, sambarDTO6.getFlavor());
	           pstmt.setInt(8, sambarDTO6.getSamberQuantity());
	           pstmt.setString(9, sambarDTO6.getSamberColor());
	           pstmt.setString(10, sambarDTO6.getSamberBrand());
	           
	           pstmt.setInt(1, sambarDTO7.getId());
	           pstmt.setString(2, sambarDTO7.getSamberName());
	           pstmt.setDouble(3, sambarDTO7.getPrice());
	           pstmt.setString(4, sambarDTO7.getFamousPlace());
	           pstmt.setString(5, sambarDTO7.getSamberIngredients());
	           pstmt.setString(6, sambarDTO7.getSamberType());
	           pstmt.setString(7, sambarDTO7.getFlavor());
	           pstmt.setInt(8, sambarDTO7.getSamberQuantity());
	           pstmt.setString(9, sambarDTO7.getSamberColor());
	           pstmt.setString(10, sambarDTO7.getSamberBrand());
	           
	           
	           pstmt.setInt(1, sambarDTO8.getId());
	           pstmt.setString(2, sambarDTO8.getSamberName());
	           pstmt.setDouble(3, sambarDTO8.getPrice());
	           pstmt.setString(4, sambarDTO8.getFamousPlace());
	           pstmt.setString(5, sambarDTO8.getSamberIngredients());
	           pstmt.setString(6, sambarDTO8.getSamberType());
	           pstmt.setString(7, sambarDTO8.getFlavor());
	           pstmt.setInt(8, sambarDTO8.getSamberQuantity());
	           pstmt.setString(9, sambarDTO8.getSamberColor());
	           pstmt.setString(10, sambarDTO8.getSamberBrand());
	           
	           pstmt.setInt(1, sambarDTO9.getId());
	           pstmt.setString(2, sambarDTO9.getSamberName());
	           pstmt.setDouble(3, sambarDTO9.getPrice());
	           pstmt.setString(4, sambarDTO9.getFamousPlace());
	           pstmt.setString(5, sambarDTO9.getSamberIngredients());
	           pstmt.setString(6, sambarDTO9.getSamberType());
	           pstmt.setString(7, sambarDTO9.getFlavor());
	           pstmt.setInt(8, sambarDTO9.getSamberQuantity());
	           pstmt.setString(9, sambarDTO9.getSamberColor());
	           pstmt.setString(10, sambarDTO9.getSamberBrand());
	           
	           pstmt.setInt(1, sambarDTO10.getId());
	           pstmt.setString(2, sambarDTO10.getSamberName());
	           pstmt.setDouble(3, sambarDTO10.getPrice());
	           pstmt.setString(4, sambarDTO10.getFamousPlace());
	           pstmt.setString(5, sambarDTO10.getSamberIngredients());
	           pstmt.setString(6, sambarDTO10.getSamberType());
	           pstmt.setString(7, sambarDTO10.getFlavor());
	           pstmt.setInt(8, sambarDTO10.getSamberQuantity());
	           pstmt.setString(9, sambarDTO10.getSamberColor());
	           pstmt.setString(10, sambarDTO10.getSamberBrand());
			   
	           

			int value = pstmt.executeUpdate();

			if (value > 0) {
				System.out.println("Saved");
			} else {
				System.out.println("Not saved");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}
