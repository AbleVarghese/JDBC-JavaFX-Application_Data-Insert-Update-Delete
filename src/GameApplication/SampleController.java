package GameApplication;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;


import java.sql.*;

public class SampleController {
	
	@FXML private int idGameVar;
	@FXML private TextField gameTitleVar;
	@FXML private TextField idPlayerVar;
	@FXML private TextField firstNameVar;
	@FXML private TextField lastNameVar;
	@FXML private TextField addressVar;
	@FXML private TextField postalCodeVar;
	@FXML private TextField provinceVar;
	@FXML private TextField phoneNumberVar;
	@FXML private Button submitVar;

	@FXML public void click(ActionEvent event) {
		
	try{
		/*
		//private int idGameVariable = idGameVariable.getText(); 
		  String gameTitleVarLocal = gameTitleVar.getText();
		 //private int idPlayerVariable = idPlayerVariable.getText();;
		 
		  String lastNameVarLocal = lastNameVar.getText();
		  String addressVarLocal = addressVar.getText();
		  String postalCodeVarLocal = postalCodeVar.getText();
		  String provinceVarLocal = provinceVar.getText();
		  String phoneNumberVarLocal =phoneNumberVar.getText();
		
		*/
		//1. get connection to database

		//  String firstNameVarLocal = firstNameVar.getText();
		
		Connection myConn =  DriverManager.getConnection("jdbc:mysql://localhost/gameapplication","root","");

		//2. Create a statement

		Statement myStmt = myConn.createStatement();

		//3. execute a SQL query

				//read data from database
		ResultSet myRs = myStmt.executeQuery("select * from game");
	
	//*************************************************************************************************************************************

			//Inserting into Table called Game
			String gameTable = "insert into game (game_title) values ("+gameTitleVar+")";
			//Inserting into Table called Player
			String playerTable = "insert into player (first_name, last_name, address, postal_code, province, phone_number) "
							+ "values ('"+firstNameVar+"','"+lastNameVar+"','"+addressVar+"',"
									+ " '"+postalCodeVar+"','"+provinceVar+"','"+phoneNumberVar+"');";
						
						myStmt.executeUpdate(gameTable);
						myStmt.executeUpdate(playerTable);

				//		  String firstNameVarLocal = firstNameVar.getText();		
				
			System.out.println("insert complete");
			//  System.out.println(firstNameVarLocal);
			//4. process the result set
	//**************************************************************************************************************************************
			
	/*	
			while (myRs.next()) {
	
			System.out.println(myRs.getString("id") + "\n\n," + myRs.getString("name"));
			}
	*/
		}
		
		catch(Exception exc){

		exc.printStackTrace();

		}
		
}
}

